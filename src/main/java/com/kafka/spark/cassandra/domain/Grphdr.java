
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msgid",
    "credttm",
    "nboftxs",
    "sttlminf"
})
public class Grphdr implements Serializable
{

    @JsonProperty("msgid")
    private String msgid;
    @JsonProperty("credttm")
    private String credttm;
    @JsonProperty("nboftxs")
    private Integer nboftxs;
    @JsonProperty("sttlminf")
    private Sttlminf sttlminf;
    private final static long serialVersionUID = 1839633814323914155L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Grphdr() {
    }

    /**
     * 
     * @param sttlminf
     * @param msgid
     * @param credttm
     * @param nboftxs
     */
    public Grphdr(String msgid, String credttm, Integer nboftxs, Sttlminf sttlminf) {
        super();
        this.msgid = msgid;
        this.credttm = credttm;
        this.nboftxs = nboftxs;
        this.sttlminf = sttlminf;
    }

    @JsonProperty("msgid")
    public String getMsgid() {
        return msgid;
    }

    @JsonProperty("msgid")
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    @JsonProperty("credttm")
    public String getCredttm() {
        return credttm;
    }

    @JsonProperty("credttm")
    public void setCredttm(String credttm) {
        this.credttm = credttm;
    }

    @JsonProperty("nboftxs")
    public Integer getNboftxs() {
        return nboftxs;
    }

    @JsonProperty("nboftxs")
    public void setNboftxs(Integer nboftxs) {
        this.nboftxs = nboftxs;
    }

    @JsonProperty("sttlminf")
    public Sttlminf getSttlminf() {
        return sttlminf;
    }

    @JsonProperty("sttlminf")
    public void setSttlminf(Sttlminf sttlminf) {
        this.sttlminf = sttlminf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("msgid", msgid).append("credttm", credttm).append("nboftxs", nboftxs).append("sttlminf", sttlminf).toString();
    }

}
