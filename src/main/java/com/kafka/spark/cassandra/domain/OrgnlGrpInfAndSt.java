package com.kafka.spark.cassandra.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"OrgnlMsgId", "OrgnlMsgNmId", "StsRsnInf"
})
@JsonIgnoreProperties(value = { "StsRsnInf" })
public class OrgnlGrpInfAndSt {

    @JsonProperty("OrgnlMsgId")
    private String orgnlMsgId;
    @JsonProperty("OrgnlMsgNmId")
    private String orgnlMsgNmId;
    @JsonProperty("StsRsnInf")
    private List<StsRsnInf> stsRsnInf = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OrgnlMsgId")
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    @JsonProperty("OrgnlMsgId")
    public void setOrgnlMsgId(String orgnlMsgId) {
        this.orgnlMsgId = orgnlMsgId;
    }

    @JsonProperty("OrgnlMsgNmId")
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    @JsonProperty("OrgnlMsgNmId")
    public void setOrgnlMsgNmId(String orgnlMsgNmId) {
        this.orgnlMsgNmId = orgnlMsgNmId;
    }

    @JsonProperty("StsRsnInf")
    public List<StsRsnInf> getStsRsnInf() {
        return stsRsnInf;
    }

    @JsonProperty("StsRsnInf")
    public void setStsRsnInf(List<StsRsnInf> stsRsnInf) {
        this.stsRsnInf = stsRsnInf;
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