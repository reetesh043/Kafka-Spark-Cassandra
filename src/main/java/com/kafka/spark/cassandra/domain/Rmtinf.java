
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strd"
})
public class Rmtinf implements Serializable
{

    @JsonProperty("strd")
    private List<Strd> strd = null;
    private final static long serialVersionUID = -305000025440360840L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rmtinf() {
    }

    /**
     * 
     * @param strd
     */
    public Rmtinf(List<Strd> strd) {
        super();
        this.strd = strd;
    }

    @JsonProperty("strd")
    public List<Strd> getStrd() {
        return strd;
    }

    @JsonProperty("strd")
    public void setStrd(List<Strd> strd) {
        this.strd = strd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("strd", strd).toString();
    }

}
