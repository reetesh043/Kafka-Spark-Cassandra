
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cdtamt",
    "cdtamtccy"
})
public class Creditamount implements Serializable
{

    @JsonProperty("cdtamt")
    private Integer cdtamt;
    @JsonProperty("cdtamtccy")
    private String cdtamtccy;
    private final static long serialVersionUID = 5766924069243074582L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Creditamount() {
    }

    /**
     * 
     * @param cdtamtccy
     * @param cdtamt
     */
    public Creditamount(Integer cdtamt, String cdtamtccy) {
        super();
        this.cdtamt = cdtamt;
        this.cdtamtccy = cdtamtccy;
    }

    @JsonProperty("cdtamt")
    public Integer getCdtamt() {
        return cdtamt;
    }

    @JsonProperty("cdtamt")
    public void setCdtamt(Integer cdtamt) {
        this.cdtamt = cdtamt;
    }

    @JsonProperty("cdtamtccy")
    public String getCdtamtccy() {
        return cdtamtccy;
    }

    @JsonProperty("cdtamtccy")
    public void setCdtamtccy(String cdtamtccy) {
        this.cdtamtccy = cdtamtccy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cdtamt", cdtamt).append("cdtamtccy", cdtamtccy).toString();
    }

}
