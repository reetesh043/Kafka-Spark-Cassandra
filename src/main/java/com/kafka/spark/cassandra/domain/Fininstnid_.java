
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clrsysmmbid"
})
public class Fininstnid_ implements Serializable
{

    @JsonProperty("clrsysmmbid")
    private Clrsysmmbid_ clrsysmmbid;
    private final static long serialVersionUID = 6413801885926650484L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fininstnid_() {
    }

    /**
     * 
     * @param clrsysmmbid
     */
    public Fininstnid_(Clrsysmmbid_ clrsysmmbid) {
        super();
        this.clrsysmmbid = clrsysmmbid;
    }

    @JsonProperty("clrsysmmbid")
    public Clrsysmmbid_ getClrsysmmbid() {
        return clrsysmmbid;
    }

    @JsonProperty("clrsysmmbid")
    public void setClrsysmmbid(Clrsysmmbid_ clrsysmmbid) {
        this.clrsysmmbid = clrsysmmbid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clrsysmmbid", clrsysmmbid).toString();
    }

}
