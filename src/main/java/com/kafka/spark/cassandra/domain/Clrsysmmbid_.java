
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mmbid"
})
public class Clrsysmmbid_ implements Serializable
{

    @JsonProperty("mmbid")
    private String mmbid;
    private final static long serialVersionUID = -8955355235978237382L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Clrsysmmbid_() {
    }

    /**
     * 
     * @param mmbid
     */
    public Clrsysmmbid_(String mmbid) {
        super();
        this.mmbid = mmbid;
    }

    @JsonProperty("mmbid")
    public String getMmbid() {
        return mmbid;
    }

    @JsonProperty("mmbid")
    public void setMmbid(String mmbid) {
        this.mmbid = mmbid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mmbid", mmbid).toString();
    }

}
