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
@JsonPropertyOrder({"Uattnd", "DbtSts", "LBGChargeAmount", "SvrAgt", "DebitAmount", "CreditAmount"
})
public class LBGPaymentInformation {

    @JsonProperty("Uattnd")
    private String uattnd;
    @JsonProperty("DbtSts")
    private String dbtSts;
    @JsonProperty("LBGChargeAmount")
    private LBGChargeAmount lBGChargeAmount;
    @JsonProperty("SvrAgt")
    private SvrAgt svrAgt;
    @JsonProperty("DebitAmount")
    private DebitAmount debitAmount;
    @JsonProperty("CreditAmount")
    private CreditAmount creditAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Uattnd")
    public String getUattnd() {
        return uattnd;
    }

    @JsonProperty("Uattnd")
    public void setUattnd(String uattnd) {
        this.uattnd = uattnd;
    }

    @JsonProperty("DbtSts")
    public String getDbtSts() {
        return dbtSts;
    }

    @JsonProperty("DbtSts")
    public void setDbtSts(String dbtSts) {
        this.dbtSts = dbtSts;
    }

    @JsonProperty("LBGChargeAmount")
    public LBGChargeAmount getLBGChargeAmount() {
        return lBGChargeAmount;
    }

    @JsonProperty("LBGChargeAmount")
    public void setLBGChargeAmount(LBGChargeAmount lBGChargeAmount) {
        this.lBGChargeAmount = lBGChargeAmount;
    }

    @JsonProperty("SvrAgt")
    public SvrAgt getSvrAgt() {
        return svrAgt;
    }

    @JsonProperty("SvrAgt")
    public void setSvrAgt(SvrAgt svrAgt) {
        this.svrAgt = svrAgt;
    }

    @JsonProperty("DebitAmount")
    public DebitAmount getDebitAmount() {
        return debitAmount;
    }

    @JsonProperty("DebitAmount")
    public void setDebitAmount(DebitAmount debitAmount) {
        this.debitAmount = debitAmount;
    }

    @JsonProperty("CreditAmount")
    public CreditAmount getCreditAmount() {
        return creditAmount;
    }

    @JsonProperty("CreditAmount")
    public void setCreditAmount(CreditAmount creditAmount) {
        this.creditAmount = creditAmount;
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
