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
@JsonPropertyOrder({"ClrSysMmbId"
})
public class FinInstnId____ {

    @JsonProperty("ClrSysMmbId")
    private ClrSysMmbId____ clrSysMmbId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ClrSysMmbId")
    public ClrSysMmbId____ getClrSysMmbId() {
        return clrSysMmbId;
    }

    @JsonProperty("ClrSysMmbId")
    public void setClrSysMmbId(ClrSysMmbId____ clrSysMmbId) {
        this.clrSysMmbId = clrSysMmbId;
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