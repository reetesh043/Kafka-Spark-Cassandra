/**
 * 
 */
package com.kafka.spark.cassandra.service.dao;

import org.apache.spark.streaming.api.java.JavaStreamingContext;

import com.kafka.spark.cassandra.domain.InboundPayment;

/**
 * @author reekumar0
 *
 */
public interface SparkCassandraDAO {

	public void save(InboundPayment ip, JavaStreamingContext jssc);

}
