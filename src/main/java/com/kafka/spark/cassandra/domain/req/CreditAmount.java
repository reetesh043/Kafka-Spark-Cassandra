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
@JsonPropertyOrder({"CdtAmt", "CdtAmtCcy"
})
public class CreditAmount {

    @JsonProperty("CdtAmt")
    private Integer cdtAmt;
    @JsonProperty("CdtAmtCcy")
    private String cdtAmtCcy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CdtAmt")
    public Integer getCdtAmt() {
        return cdtAmt;
    }

    @JsonProperty("CdtAmt")
    public void setCdtAmt(Integer cdtAmt) {
        this.cdtAmt = cdtAmt;
    }

    @JsonProperty("CdtAmtCcy")
    public String getCdtAmtCcy() {
        return cdtAmtCcy;
    }

    @JsonProperty("CdtAmtCcy")
    public void setCdtAmtCcy(String cdtAmtCcy) {
        this.cdtAmtCcy = cdtAmtCcy;
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