
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lclinstrm"
})
public class Pmttpinf implements Serializable
{

    @JsonProperty("lclinstrm")
    private Lclinstrm lclinstrm;
    private final static long serialVersionUID = -3311799694985682902L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pmttpinf() {
    }

    /**
     * 
     * @param lclinstrm
     */
    public Pmttpinf(Lclinstrm lclinstrm) {
        super();
        this.lclinstrm = lclinstrm;
    }

    @JsonProperty("lclinstrm")
    public Lclinstrm getLclinstrm() {
        return lclinstrm;
    }

    @JsonProperty("lclinstrm")
    public void setLclinstrm(Lclinstrm lclinstrm) {
        this.lclinstrm = lclinstrm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lclinstrm", lclinstrm).toString();
    }

}
