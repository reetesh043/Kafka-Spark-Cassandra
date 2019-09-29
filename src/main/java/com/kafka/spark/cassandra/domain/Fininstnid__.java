
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
public class Fininstnid__ implements Serializable
{

    @JsonProperty("clrsysmmbid")
    private Clrsysmmbid__ clrsysmmbid;
    private final static long serialVersionUID = -7890740293450489432L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fininstnid__() {
    }

    /**
     * 
     * @param clrsysmmbid
     */
    public Fininstnid__(Clrsysmmbid__ clrsysmmbid) {
        super();
        this.clrsysmmbid = clrsysmmbid;
    }

    @JsonProperty("clrsysmmbid")
    public Clrsysmmbid__ getClrsysmmbid() {
        return clrsysmmbid;
    }

    @JsonProperty("clrsysmmbid")
    public void setClrsysmmbid(Clrsysmmbid__ clrsysmmbid) {
        this.clrsysmmbid = clrsysmmbid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clrsysmmbid", clrsysmmbid).toString();
    }

}
