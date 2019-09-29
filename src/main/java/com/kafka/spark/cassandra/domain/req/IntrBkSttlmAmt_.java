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
@JsonPropertyOrder({"Ccy", "Amt"
})
public class IntrBkSttlmAmt_ {

    @JsonProperty("Ccy")
    private String ccy;
    @JsonProperty("Amt")
    private String amt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Ccy")
    public String getCcy() {
        return ccy;
    }

    @JsonProperty("Ccy")
    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @JsonProperty("Amt")
    public String getAmt() {
        return amt;
    }

    @JsonProperty("Amt")
    public void setAmt(String amt) {
        this.amt = amt;
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