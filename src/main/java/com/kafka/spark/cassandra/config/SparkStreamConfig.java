
package com.kafka.spark.cassandra.config;

import org.apache.spark.SparkConf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkStreamConfig {

	private static final String LOCAL = "local";

	private static final String LOCAL_WIN = "localw";

	@Value(value = "${spark.stream.master.host}")
	private String sparkMasterHost;

	@Value(value = "${spark.stream.master.port}")
	private String sparkMasterPort;

	@Value(value = "${spark.stream.master.mode}")
	private String sparkMasterMode;

	@Value(value = "${spark.stream.appname}")
	private String appName;

	@Value(value = "${cassandra.connection.host}")
	private String cassandraHost;

	@Value(value = "${spark.driver.memory}")
	private String sparkDriverMemory;

	@Bean
	public SparkConf createSparkConf() {
		StringBuilder masterUrl = new StringBuilder();
		if (LOCAL_WIN.equalsIgnoreCase(sparkMasterMode)) {
			System.setProperty("hadoop.home.dir", "/");
		}
		if (LOCAL.equalsIgnoreCase(sparkMasterMode) || LOCAL_WIN.equalsIgnoreCase(sparkMasterMode)) {
			masterUrl.append(sparkMasterHost);
		} else {
			masterUrl.append("spark://").append(sparkMasterHost).append(":").append(sparkMasterPort);
		}
		SparkConf sparkConf = new SparkConf();
		sparkConf.setMaster(masterUrl.toString());
		sparkConf.setAppName(appName);
		sparkConf.set("spark.cassandra.connection.host", cassandraHost);
		return sparkConf;
	}
}
