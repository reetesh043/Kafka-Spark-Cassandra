/**
 * 
 */
package com.kafka.spark.cassandra.domain.db;

import java.io.Serializable;
import com.kafka.spark.cassandra.domain.Notification;

/**
 * @author reekumar0
 *
 */
public class InboundPaymentsData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private Notification notification;

	/**
	 * @param id
	 * @param notification
	 */
	public InboundPaymentsData(String id, Notification notification) {
		this.id = id;
		this.notification = notification;
	}

	public InboundPaymentsData() {
		// Default Constructor
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the notification
	 */
	public Notification getNotification() {
		return notification;
	}

	/**
	 * @param notification the notification to set
	 */
	public void setNotification(Notification notification) {
		this.notification = notification;
	}

}
