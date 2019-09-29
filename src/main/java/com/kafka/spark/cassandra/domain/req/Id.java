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
@JsonPropertyOrder({"IBAN", "Othr"
})
public class Id {

    @JsonProperty("IBAN")
    private String iBAN;
    @JsonProperty("Othr")
    private Othr_ othr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("IBAN")
    public String getIBAN() {
        return iBAN;
    }

    @JsonProperty("IBAN")
    public void setIBAN(String iBAN) {
        this.iBAN = iBAN;
    }

    @JsonProperty("Othr")
    public Othr_ getOthr() {
        return othr;
    }

    @JsonProperty("Othr")
    public void setOthr(Othr_ othr) {
        this.othr = othr;
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