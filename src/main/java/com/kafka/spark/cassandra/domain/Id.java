
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "othr"
})
public class Id implements Serializable
{

    @JsonProperty("othr")
    private Othr othr;
    private final static long serialVersionUID = 6548642037452687670L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Id() {
    }

    /**
     * 
     * @param othr
     */
    public Id(Othr othr) {
        super();
        this.othr = othr;
    }

    @JsonProperty("othr")
    public Othr getOthr() {
        return othr;
    }

    @JsonProperty("othr")
    public void setOthr(Othr othr) {
        this.othr = othr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("othr", othr).toString();
    }

}
