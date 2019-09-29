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
@JsonPropertyOrder({"GrpHdr", "OrgnlGrpInfAndSts", "TxInfAndSts"
})
public class FIToFIPmtStsRpt {

    @JsonProperty("GrpHdr")
    private GrpHdr_ grpHdr;
    @JsonProperty("OrgnlGrpInfAndSts")
    private List<OrgnlGrpInfAndSt> orgnlGrpInfAndSts = null;
    @JsonProperty("TxInfAndSts")
    private List<TxInfAndSt> txInfAndSts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GrpHdr")
    public GrpHdr_ getGrpHdr() {
        return grpHdr;
    }

    @JsonProperty("GrpHdr")
    public void setGrpHdr(GrpHdr_ grpHdr) {
        this.grpHdr = grpHdr;
    }

    @JsonProperty("OrgnlGrpInfAndSts")
    public List<OrgnlGrpInfAndSt> getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    @JsonProperty("OrgnlGrpInfAndSts")
    public void setOrgnlGrpInfAndSts(List<OrgnlGrpInfAndSt> orgnlGrpInfAndSts) {
        this.orgnlGrpInfAndSts = orgnlGrpInfAndSts;
    }

    @JsonProperty("TxInfAndSts")
    public List<TxInfAndSt> getTxInfAndSts() {
        return txInfAndSts;
    }

    @JsonProperty("TxInfAndSts")
    public void setTxInfAndSts(List<TxInfAndSt> txInfAndSts) {
        this.txInfAndSts = txInfAndSts;
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
