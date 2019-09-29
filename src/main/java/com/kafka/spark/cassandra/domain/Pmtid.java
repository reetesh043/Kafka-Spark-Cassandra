
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "endtoendid",
    "txid"
})
public class Pmtid implements Serializable
{

    @JsonProperty("endtoendid")
    private String endtoendid;
    @JsonProperty("txid")
    private String txid;
    private final static long serialVersionUID = -1810702047282643998L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pmtid() {
    }

    /**
     * 
     * @param endtoendid
     * @param txid
     */
    public Pmtid(String endtoendid, String txid) {
        super();
        this.endtoendid = endtoendid;
        this.txid = txid;
    }

    @JsonProperty("endtoendid")
    public String getEndtoendid() {
        return endtoendid;
    }

    @JsonProperty("endtoendid")
    public void setEndtoendid(String endtoendid) {
        this.endtoendid = endtoendid;
    }

    @JsonProperty("txid")
    public String getTxid() {
        return txid;
    }

    @JsonProperty("txid")
    public void setTxid(String txid) {
        this.txid = txid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endtoendid", endtoendid).append("txid", txid).toString();
    }

}
