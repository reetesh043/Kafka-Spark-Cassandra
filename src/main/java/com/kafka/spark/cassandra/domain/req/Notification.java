package com.kafka.spark.cassandra.domain.req;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "NotificationHeader", "Event" })
public class Notification {

	@JsonProperty("NotificationHeader")
	private NotificationHeader notificationheader;
	@JsonProperty("Event")
	private List<Event> event = null;

	@JsonProperty("NotificationHeader")
	public NotificationHeader getNotificationheader() {
		return notificationheader;
	}

	@JsonProperty("NotificationHeader")
	public void setNotificationheader(NotificationHeader notificationheader) {
		this.notificationheader = notificationheader;
	}

	@JsonProperty("Event")
	public List<Event> getEvent() {
		return event;
	}

	@JsonProperty("vent")
	public void setEvent(List<Event> event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("notificationheader", notificationheader).append("event", event)
				.toString();
	}

}