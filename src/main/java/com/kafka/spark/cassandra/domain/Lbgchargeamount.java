
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lbgchrgamt",
    "lbgchrgamtccy"
})
public class Lbgchargeamount implements Serializable
{

    @JsonProperty("lbgchrgamt")
    private Integer lbgchrgamt;
    @JsonProperty("lbgchrgamtccy")
    private String lbgchrgamtccy;
    private final static long serialVersionUID = -8823725363505887999L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lbgchargeamount() {
    }

    /**
     * 
     * @param lbgchrgamtccy
     * @param lbgchrgamt
     */
    public Lbgchargeamount(Integer lbgchrgamt, String lbgchrgamtccy) {
        super();
        this.lbgchrgamt = lbgchrgamt;
        this.lbgchrgamtccy = lbgchrgamtccy;
    }

    @JsonProperty("lbgchrgamt")
    public Integer getLbgchrgamt() {
        return lbgchrgamt;
    }

    @JsonProperty("lbgchrgamt")
    public void setLbgchrgamt(Integer lbgchrgamt) {
        this.lbgchrgamt = lbgchrgamt;
    }

    @JsonProperty("lbgchrgamtccy")
    public String getLbgchrgamtccy() {
        return lbgchrgamtccy;
    }

    @JsonProperty("lbgchrgamtccy")
    public void setLbgchrgamtccy(String lbgchrgamtccy) {
        this.lbgchrgamtccy = lbgchrgamtccy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lbgchrgamt", lbgchrgamt).append("lbgchrgamtccy", lbgchrgamtccy).toString();
    }

}
