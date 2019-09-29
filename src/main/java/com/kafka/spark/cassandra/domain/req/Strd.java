package com.kafka.spark.cassandra.domain.req;

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
@JsonPropertyOrder({"CdtrRefInf", "AddtlRmtInf"
})
public class Strd {

    @JsonProperty("CdtrRefInf")
    private CdtrRefInf cdtrRefInf;
    @JsonProperty("AddtlRmtInf")
    private List<Object> addtlRmtInf = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CdtrRefInf")
    public CdtrRefInf getCdtrRefInf() {
        return cdtrRefInf;
    }

    @JsonProperty("CdtrRefInf")
    public void setCdtrRefInf(CdtrRefInf cdtrRefInf) {
        this.cdtrRefInf = cdtrRefInf;
    }

    @JsonProperty("AddtlRmtInf")
    public List<Object> getAddtlRmtInf() {
        return addtlRmtInf;
    }

    @JsonProperty("AddtlRmtInf")
    public void setAddtlRmtInf(List<Object> addtlRmtInf) {
        this.addtlRmtInf = addtlRmtInf;
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