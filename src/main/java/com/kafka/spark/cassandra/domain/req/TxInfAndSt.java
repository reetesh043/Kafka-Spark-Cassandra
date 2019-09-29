package com.kafka.spark.cassandra.domain.req;

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
@JsonPropertyOrder({"OrgnlTxId", "StsRsnInf", "AccptncDtTm", "InstAgt", "OrgnlTxRef"
})
@JsonIgnoreProperties(value = { "StsRsnInf" })
public class TxInfAndSt {

    @JsonProperty("OrgnlTxId")
    private String orgnlTxId;
    @JsonProperty("StsRsnInf")
    private List<StsRsnInf_> stsRsnInf;
    @JsonProperty("AccptncDtTm")
    private String accptncDtTm;
    @JsonProperty("InstAgt")
    private InstAgt instAgt;
    @JsonProperty("OrgnlTxRef")
    private OrgnlTxRef orgnlTxRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OrgnlTxId")
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    @JsonProperty("OrgnlTxId")
    public void setOrgnlTxId(String orgnlTxId) {
        this.orgnlTxId = orgnlTxId;
    }

    @JsonProperty("StsRsnInf")
    public List<StsRsnInf_> getStsRsnInf() {
        return stsRsnInf;
    }

    @JsonProperty("StsRsnInf")
    public void setStsRsnInf(List<StsRsnInf_> stsRsnInf) {
        this.stsRsnInf = stsRsnInf;
    }

    @JsonProperty("AccptncDtTm")
    public String getAccptncDtTm() {
        return accptncDtTm;
    }

    @JsonProperty("AccptncDtTm")
    public void setAccptncDtTm(String accptncDtTm) {
        this.accptncDtTm = accptncDtTm;
    }

    @JsonProperty("InstAgt")
    public InstAgt getInstAgt() {
        return instAgt;
    }

    @JsonProperty("InstAgt")
    public void setInstAgt(InstAgt instAgt) {
        this.instAgt = instAgt;
    }

    @JsonProperty("OrgnlTxRef")
    public OrgnlTxRef getOrgnlTxRef() {
        return orgnlTxRef;
    }

    @JsonProperty("OrgnlTxRef")
    public void setOrgnlTxRef(OrgnlTxRef orgnlTxRef) {
        this.orgnlTxRef = orgnlTxRef;
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