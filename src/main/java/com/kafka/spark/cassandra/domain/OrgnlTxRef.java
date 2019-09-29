package com.kafka.spark.cassandra.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"IntrBkSttlmAmt", "IntrBkSttlmDt", "SttlmInf", "PmtTpInf", "DbtrAgt", "CdtrAgt", "UltmtCdtr"
})
public class OrgnlTxRef {

    @JsonProperty("IntrBkSttlmAmt")
    private IntrBkSttlmAmt_ intrBkSttlmAmt;
    @JsonProperty("IntrBkSttlmDt")
    private String intrBkSttlmDt;
    @JsonProperty("SttlmInf")
    private SttlmInf_ sttlmInf;
    @JsonProperty("PmtTpInf")
    private PmtTpInf__ pmtTpInf;
    @JsonProperty("DbtrAgt")
    private DbtrAgt_ dbtrAgt;
    @JsonProperty("CdtrAgt")
    private CdtrAgt_ cdtrAgt;
    @JsonProperty("UltmtCdtr")
    private UltmtCdtr ultmtCdtr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("IntrBkSttlmAmt")
    public IntrBkSttlmAmt_ getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    @JsonProperty("IntrBkSttlmAmt")
    public void setIntrBkSttlmAmt(IntrBkSttlmAmt_ intrBkSttlmAmt) {
        this.intrBkSttlmAmt = intrBkSttlmAmt;
    }

    @JsonProperty("IntrBkSttlmDt")
    public String getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    @JsonProperty("IntrBkSttlmDt")
    public void setIntrBkSttlmDt(String intrBkSttlmDt) {
        this.intrBkSttlmDt = intrBkSttlmDt;
    }

    @JsonProperty("SttlmInf")
    public SttlmInf_ getSttlmInf() {
        return sttlmInf;
    }

    @JsonProperty("SttlmInf")
    public void setSttlmInf(SttlmInf_ sttlmInf) {
        this.sttlmInf = sttlmInf;
    }

    @JsonProperty("PmtTpInf")
    public PmtTpInf__ getPmtTpInf() {
        return pmtTpInf;
    }

    @JsonProperty("PmtTpInf")
    public void setPmtTpInf(PmtTpInf__ pmtTpInf) {
        this.pmtTpInf = pmtTpInf;
    }

    @JsonProperty("DbtrAgt")
    public DbtrAgt_ getDbtrAgt() {
        return dbtrAgt;
    }

    @JsonProperty("DbtrAgt")
    public void setDbtrAgt(DbtrAgt_ dbtrAgt) {
        this.dbtrAgt = dbtrAgt;
    }

    @JsonProperty("CdtrAgt")
    public CdtrAgt_ getCdtrAgt() {
        return cdtrAgt;
    }

    @JsonProperty("CdtrAgt")
    public void setCdtrAgt(CdtrAgt_ cdtrAgt) {
        this.cdtrAgt = cdtrAgt;
    }

    @JsonProperty("UltmtCdtr")
    public UltmtCdtr getUltmtCdtr() {
        return ultmtCdtr;
    }

    @JsonProperty("UltmtCdtr")
    public void setUltmtCdtr(UltmtCdtr ultmtCdtr) {
        this.ultmtCdtr = ultmtCdtr;
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