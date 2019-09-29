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
@JsonPropertyOrder({"MsgId", "CreDtTm", "NbOfTxs", "SttlmInf", "PmtTpInf"
})
public class GrpHdr {

    @JsonProperty("MsgId")
    private String msgId;
    @JsonProperty("CreDtTm")
    private String creDtTm;
    @JsonProperty("NbOfTxs")
    private String nbOfTxs;
    @JsonProperty("SttlmInf")
    private SttlmInf sttlmInf;
    @JsonProperty("PmtTpInf")
    private PmtTpInf pmtTpInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MsgId")
    public String getMsgId() {
        return msgId;
    }

    @JsonProperty("MsgId")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @JsonProperty("CreDtTm")
    public String getCreDtTm() {
        return creDtTm;
    }

    @JsonProperty("CreDtTm")
    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
    }

    @JsonProperty("NbOfTxs")
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    @JsonProperty("NbOfTxs")
    public void setNbOfTxs(String nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    @JsonProperty("SttlmInf")
    public SttlmInf getSttlmInf() {
        return sttlmInf;
    }

    @JsonProperty("SttlmInf")
    public void setSttlmInf(SttlmInf sttlmInf) {
        this.sttlmInf = sttlmInf;
    }

    @JsonProperty("PmtTpInf")
    public PmtTpInf getPmtTpInf() {
        return pmtTpInf;
    }

    @JsonProperty("PmtTpInf")
    public void setPmtTpInf(PmtTpInf pmtTpInf) {
        this.pmtTpInf = pmtTpInf;
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