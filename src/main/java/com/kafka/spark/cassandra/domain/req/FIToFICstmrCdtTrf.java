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
@JsonPropertyOrder({"GrpHdr", "CdtTrfTxInf"
})
public class FIToFICstmrCdtTrf {

    @JsonProperty("GrpHdr")
    private GrpHdr grpHdr;
    @JsonProperty("CdtTrfTxInf")
    private List<CdtTrfTxInf> cdtTrfTxInf = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GrpHdr")
    public GrpHdr getGrpHdr() {
        return grpHdr;
    }

    @JsonProperty("GrpHdr")
    public void setGrpHdr(GrpHdr grpHdr) {
        this.grpHdr = grpHdr;
    }

    @JsonProperty("CdtTrfTxInf")
    public List<CdtTrfTxInf> getCdtTrfTxInf() {
        return cdtTrfTxInf;
    }

    @JsonProperty("CdtTrfTxInf")
    public void setCdtTrfTxInf(List<CdtTrfTxInf> cdtTrfTxInf) {
        this.cdtTrfTxInf = cdtTrfTxInf;
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