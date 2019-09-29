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
@JsonPropertyOrder({"LBGPaymentInformation", "FIToFICstmrCdtTrf", "FIToFIPmtStsRpt"
})
public class PaymentDetails {

    @JsonProperty("LBGPaymentInformation")
    private LBGPaymentInformation lBGPaymentInformation;
    @JsonProperty("FIToFICstmrCdtTrf")
    private FIToFICstmrCdtTrf fIToFICstmrCdtTrf;
    @JsonProperty("FIToFIPmtStsRpt")
    private FIToFIPmtStsRpt fIToFIPmtStsRpt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LBGPaymentInformation")
    public LBGPaymentInformation getLBGPaymentInformation() {
        return lBGPaymentInformation;
    }

    @JsonProperty("LBGPaymentInformation")
    public void setLBGPaymentInformation(LBGPaymentInformation lBGPaymentInformation) {
        this.lBGPaymentInformation = lBGPaymentInformation;
    }

    @JsonProperty("FIToFICstmrCdtTrf")
    public FIToFICstmrCdtTrf getFIToFICstmrCdtTrf() {
        return fIToFICstmrCdtTrf;
    }

    @JsonProperty("FIToFICstmrCdtTrf")
    public void setFIToFICstmrCdtTrf(FIToFICstmrCdtTrf fIToFICstmrCdtTrf) {
        this.fIToFICstmrCdtTrf = fIToFICstmrCdtTrf;
    }

    @JsonProperty("FIToFIPmtStsRpt")
    public FIToFIPmtStsRpt getFIToFIPmtStsRpt() {
        return fIToFIPmtStsRpt;
    }

    @JsonProperty("FIToFIPmtStsRpt")
    public void setFIToFIPmtStsRpt(FIToFIPmtStsRpt fIToFIPmtStsRpt) {
        this.fIToFIPmtStsRpt = fIToFIPmtStsRpt;
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