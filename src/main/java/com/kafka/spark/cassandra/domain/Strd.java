
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cdtrrefinf"
})
public class Strd implements Serializable
{

    @JsonProperty("cdtrrefinf")
    private Cdtrrefinf cdtrrefinf;
    private final static long serialVersionUID = 7523887327700595536L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Strd() {
    }

    /**
     * 
     * @param cdtrrefinf
     */
    public Strd(Cdtrrefinf cdtrrefinf) {
        super();
        this.cdtrrefinf = cdtrrefinf;
    }

    @JsonProperty("cdtrrefinf")
    public Cdtrrefinf getCdtrrefinf() {
        return cdtrrefinf;
    }

    @JsonProperty("cdtrrefinf")
    public void setCdtrrefinf(Cdtrrefinf cdtrrefinf) {
        this.cdtrrefinf = cdtrrefinf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cdtrrefinf", cdtrrefinf).toString();
    }

}
