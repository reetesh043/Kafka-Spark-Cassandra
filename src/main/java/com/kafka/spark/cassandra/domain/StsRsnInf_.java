package com.kafka.spark.cassandra.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Rsn", "AddtlInf"
})
public class StsRsnInf_ {

    @JsonProperty("Rsn")
    private Rsn rsn;
    @JsonProperty("AddtlInf")
    private List<Object> addtlInf = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Rsn")
    public Rsn getRsn() {
        return rsn;
    }

    @JsonProperty("Rsn")
    public void setRsn(Rsn rsn) {
        this.rsn = rsn;
    }

    @JsonProperty("AddtlInf")
    public List<Object> getAddtlInf() {
        return addtlInf;
    }

    @JsonProperty("AddtlInf")
    public void setAddtlInf(List<Object> addtlInf) {
        this.addtlInf = addtlInf;
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