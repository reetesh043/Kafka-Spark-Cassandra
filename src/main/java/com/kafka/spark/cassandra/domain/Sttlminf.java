
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sttlmmtd"
})
public class Sttlminf implements Serializable
{

    @JsonProperty("sttlmmtd")
    private String sttlmmtd;
    private final static long serialVersionUID = -3096302503342795401L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sttlminf() {
    }

    /**
     * 
     * @param sttlmmtd
     */
    public Sttlminf(String sttlmmtd) {
        super();
        this.sttlmmtd = sttlmmtd;
    }

    @JsonProperty("sttlmmtd")
    public String getSttlmmtd() {
        return sttlmmtd;
    }

    @JsonProperty("sttlmmtd")
    public void setSttlmmtd(String sttlmmtd) {
        this.sttlmmtd = sttlmmtd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sttlmmtd", sttlmmtd).toString();
    }

}
