package com.kafka.spark.cassandra.service;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.kafka.spark.cassandra.domain.InboundPayment;
import com.kafka.spark.cassandra.message.MessageMapper;
import com.kafka.spark.cassandra.service.dao.SparkCassandraDAO;

@Component
public class SparkKafkaStreamExecutor implements Runnable, Serializable {

	private static final long serialVersionUID = 8130735080044391087L;

	@Value(value = "${spark.stream.kafka.brokers}")
	private String brokers;

	@Value(value = "${spark.stream.kafka.topics}")
	private String topics;

	@Value(value = "${spark.stream.kafka.intervals}")
	private Integer intervals;

	@Autowired
	private SparkConf sparkConf;

	@Autowired
	private SparkCassandraDAO sparkCassandraDAO;

	@Autowired
	private MessageMapper messageMapper;

	@Override
	public void run() {
		JavaStreamingContext jssc = new JavaStreamingContext(sparkConf, Durations.seconds(intervals));
		Set<String> topic = Collections.singleton(topics);
		JavaInputDStream<ConsumerRecord<String, String>> messages = KafkaUtils.createDirectStream(jssc,
				LocationStrategies.PreferConsistent(),
				ConsumerStrategies.<String, String>Subscribe(topic, getKafkaParams()));
		JavaDStream<String> lines = messages.map(record -> (record.value()));

		lines.foreachRDD(rdd -> {
			if (rdd.count() > 0) {
				List<String> strArray = rdd.collect();
				InboundPayment ip = messageMapper.map(strArray.get(0));
				sparkCassandraDAO.save(ip, jssc);
			}
		});

		jssc.start();

		try {
			jssc.awaitTermination();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Map<String, Object> getKafkaParams() {
		Map<String, Object> kafkaParams = new HashMap<>();
		kafkaParams.put("bootstrap.servers", brokers);
		kafkaParams.put("key.deserializer", StringDeserializer.class);
		kafkaParams.put("value.deserializer", StringDeserializer.class);
		kafkaParams.put("group.id", "groupe-id");
		kafkaParams.put("auto.offset.reset", "latest");
		kafkaParams.put("enable.auto.commit", false);
		return kafkaParams;
	}

	@PostConstruct
	private void startThread() {
		new Thread(this).start();
	}

}
