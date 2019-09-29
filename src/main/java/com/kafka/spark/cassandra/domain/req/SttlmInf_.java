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
@JsonPropertyOrder({"SttlmMtd", "ClrSys", "InstgRmbrsmntAgt"
})
public class SttlmInf_ {

    @JsonProperty("SttlmMtd")
    private String sttlmMtd;
    @JsonProperty("ClrSys")
    private ClrSys clrSys;
    @JsonProperty("InstgRmbrsmntAgt")
    private InstgRmbrsmntAgt instgRmbrsmntAgt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SttlmMtd")
    public String getSttlmMtd() {
        return sttlmMtd;
    }

    @JsonProperty("SttlmMtd")
    public void setSttlmMtd(String sttlmMtd) {
        this.sttlmMtd = sttlmMtd;
    }

    @JsonProperty("ClrSys")
    public ClrSys getClrSys() {
        return clrSys;
    }

    @JsonProperty("ClrSys")
    public void setClrSys(ClrSys clrSys) {
        this.clrSys = clrSys;
    }

    @JsonProperty("InstgRmbrsmntAgt")
    public InstgRmbrsmntAgt getInstgRmbrsmntAgt() {
        return instgRmbrsmntAgt;
    }

    @JsonProperty("InstgRmbrsmntAgt")
    public void setInstgRmbrsmntAgt(InstgRmbrsmntAgt instgRmbrsmntAgt) {
        this.instgRmbrsmntAgt = instgRmbrsmntAgt;
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