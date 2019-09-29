
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prtry"
})
public class Lclinstrm implements Serializable
{

    @JsonProperty("prtry")
    private String prtry;
    private final static long serialVersionUID = 3156960545411243918L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lclinstrm() {
    }

    /**
     * 
     * @param prtry
     */
    public Lclinstrm(String prtry) {
        super();
        this.prtry = prtry;
    }

    @JsonProperty("prtry")
    public String getPrtry() {
        return prtry;
    }

    @JsonProperty("prtry")
    public void setPrtry(String prtry) {
        this.prtry = prtry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("prtry", prtry).toString();
    }

}
