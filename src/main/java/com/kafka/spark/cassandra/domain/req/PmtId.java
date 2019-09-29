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
@JsonPropertyOrder({"EndToEndId", "TxId"
})
public class PmtId {

    @JsonProperty("EndToEndId")
    private String endToEndId;
    @JsonProperty("TxId")
    private String txId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EndToEndId")
    public String getEndToEndId() {
        return endToEndId;
    }

    @JsonProperty("EndToEndId")
    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    @JsonProperty("TxId")
    public String getTxId() {
        return txId;
    }

    @JsonProperty("TxId")
    public void setTxId(String txId) {
        this.txId = txId;
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