
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ccy",
    "amt"
})
public class Chrgsinf implements Serializable
{

    @JsonProperty("ccy")
    private String ccy;
    @JsonProperty("amt")
    private Integer amt;
    private final static long serialVersionUID = 7596520450343766176L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Chrgsinf() {
    }

    /**
     * 
     * @param amt
     * @param ccy
     */
    public Chrgsinf(String ccy, Integer amt) {
        super();
        this.ccy = ccy;
        this.amt = amt;
    }

    @JsonProperty("ccy")
    public String getCcy() {
        return ccy;
    }

    @JsonProperty("ccy")
    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @JsonProperty("amt")
    public Integer getAmt() {
        return amt;
    }

    @JsonProperty("amt")
    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ccy", ccy).append("amt", amt).toString();
    }

}
