
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtamt",
    "dbtamtccy"
})
public class Debitamount implements Serializable
{

    @JsonProperty("dbtamt")
    private Integer dbtamt;
    @JsonProperty("dbtamtccy")
    private String dbtamtccy;
    private final static long serialVersionUID = -5983844641810183530L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Debitamount() {
    }

    /**
     * 
     * @param dbtamt
     * @param dbtamtccy
     */
    public Debitamount(Integer dbtamt, String dbtamtccy) {
        super();
        this.dbtamt = dbtamt;
        this.dbtamtccy = dbtamtccy;
    }

    @JsonProperty("dbtamt")
    public Integer getDbtamt() {
        return dbtamt;
    }

    @JsonProperty("dbtamt")
    public void setDbtamt(Integer dbtamt) {
        this.dbtamt = dbtamt;
    }

    @JsonProperty("dbtamtccy")
    public String getDbtamtccy() {
        return dbtamtccy;
    }

    @JsonProperty("dbtamtccy")
    public void setDbtamtccy(String dbtamtccy) {
        this.dbtamtccy = dbtamtccy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dbtamt", dbtamt).append("dbtamtccy", dbtamtccy).toString();
    }

}
