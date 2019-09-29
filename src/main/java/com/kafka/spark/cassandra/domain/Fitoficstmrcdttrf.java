
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grphdr",
    "cdttrftxinf"
})
public class Fitoficstmrcdttrf implements Serializable
{

    @JsonProperty("grphdr")
    private Grphdr grphdr;
    @JsonProperty("cdttrftxinf")
    private List<Cdttrftxinf> cdttrftxinf = null;
    private final static long serialVersionUID = 952351124552700534L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fitoficstmrcdttrf() {
    }

    /**
     * 
     * @param grphdr
     * @param cdttrftxinf
     */
    public Fitoficstmrcdttrf(Grphdr grphdr, List<Cdttrftxinf> cdttrftxinf) {
        super();
        this.grphdr = grphdr;
        this.cdttrftxinf = cdttrftxinf;
    }

    @JsonProperty("grphdr")
    public Grphdr getGrphdr() {
        return grphdr;
    }

    @JsonProperty("grphdr")
    public void setGrphdr(Grphdr grphdr) {
        this.grphdr = grphdr;
    }

    @JsonProperty("cdttrftxinf")
    public List<Cdttrftxinf> getCdttrftxinf() {
        return cdttrftxinf;
    }

    @JsonProperty("cdttrftxinf")
    public void setCdttrftxinf(List<Cdttrftxinf> cdttrftxinf) {
        this.cdttrftxinf = cdttrftxinf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("grphdr", grphdr).append("cdttrftxinf", cdttrftxinf).toString();
    }

}
