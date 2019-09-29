
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clrsysmmbid"
})
public class Fininstnid implements Serializable
{

    @JsonProperty("clrsysmmbid")
    private Clrsysmmbid clrsysmmbid;
    private final static long serialVersionUID = 8533561143091109920L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fininstnid() {
    }

    /**
     * 
     * @param clrsysmmbid
     */
    public Fininstnid(Clrsysmmbid clrsysmmbid) {
        super();
        this.clrsysmmbid = clrsysmmbid;
    }

    @JsonProperty("clrsysmmbid")
    public Clrsysmmbid getClrsysmmbid() {
        return clrsysmmbid;
    }

    @JsonProperty("clrsysmmbid")
    public void setClrsysmmbid(Clrsysmmbid clrsysmmbid) {
        this.clrsysmmbid = clrsysmmbid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clrsysmmbid", clrsysmmbid).toString();
    }

}
