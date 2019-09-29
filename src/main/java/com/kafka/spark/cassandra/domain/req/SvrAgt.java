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
@JsonPropertyOrder({"FinInstnId", "BrnchId"
})
public class SvrAgt {

    @JsonProperty("FinInstnId")
    private FinInstnId finInstnId;
    @JsonProperty("BrnchId")
    private BrnchId brnchId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FinInstnId")
    public FinInstnId getFinInstnId() {
        return finInstnId;
    }

    @JsonProperty("FinInstnId")
    public void setFinInstnId(FinInstnId finInstnId) {
        this.finInstnId = finInstnId;
    }

    @JsonProperty("BrnchId")
    public BrnchId getBrnchId() {
        return brnchId;
    }

    @JsonProperty("BrnchId")
    public void setBrnchId(BrnchId brnchId) {
        this.brnchId = brnchId;
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