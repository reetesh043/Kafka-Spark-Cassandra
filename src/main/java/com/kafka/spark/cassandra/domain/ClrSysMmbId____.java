package com.kafka.spark.cassandra.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ClrSysId", "MmbId" })
public class ClrSysMmbId____ {

	@JsonProperty("ClrSysId")
	private ClrSysId clrSysId;
	@JsonProperty("MmbId")
	private String mmbId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ClrSysId")
	public ClrSysId getClrSysId() {
		return clrSysId;
	}

	@JsonProperty("ClrSysId")
	public void setClrSysId(ClrSysId clrSysId) {
		this.clrSysId = clrSysId;
	}

	@JsonProperty("MmbId")
	public String getMmbId() {
		return mmbId;
	}

	@JsonProperty("MmbId")
	public void setMmbId(String mmbId) {
		this.mmbId = mmbId;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}