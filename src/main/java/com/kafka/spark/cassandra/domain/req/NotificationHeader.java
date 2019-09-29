package com.kafka.spark.cassandra.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Version", "CreationdateTime", "NotificationKey", "NumberOfEvents" })
public class NotificationHeader {

	@JsonProperty("Version")
	private String version;
	@JsonProperty("CreationdateTime")
	private String creationdatetime;
	@JsonProperty("NotificationKey")
	private String notificationkey;
	@JsonProperty("NumberOfEvents")
	private Integer numberofevents;

	@JsonProperty("Version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("Version")
	public void setVersion(String version) {
		this.version = version;
	}

	@JsonProperty("CreationdateTime")
	public String getCreationdatetime() {
		return creationdatetime;
	}

	@JsonProperty("CreationdateTime")
	public void setCreationdatetime(String creationdatetime) {
		this.creationdatetime = creationdatetime;
	}

	@JsonProperty("NotificationKey")
	public String getNotificationkey() {
		return notificationkey;
	}

	@JsonProperty("NotificationKey")
	public void setNotificationkey(String notificationkey) {
		this.notificationkey = notificationkey;
	}

	@JsonProperty("NumberOfEvents")
	public Integer getNumberofevents() {
		return numberofevents;
	}

	@JsonProperty("NumberOfEvents")
	public void setNumberofevents(Integer numberofevents) {
		this.numberofevents = numberofevents;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("version", version).append("creationdatetime", creationdatetime)
				.append("notificationkey", notificationkey).append("numberofevents", numberofevents).toString();
	}

}