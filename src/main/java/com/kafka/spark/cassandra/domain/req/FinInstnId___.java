package com.kafka.spark.cassandra.domain.req;

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
public class FinInstnId___ {

    @JsonProperty("ClrSysMmbId")
    private ClrSysMmbId___ clrSysMmbId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ClrSysMmbId")
    public ClrSysMmbId___ getClrSysMmbId() {
        return clrSysMmbId;
    }

    @JsonProperty("ClrSysMmbId")
    public void setClrSysMmbId(ClrSysMmbId___ clrSysMmbId) {
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