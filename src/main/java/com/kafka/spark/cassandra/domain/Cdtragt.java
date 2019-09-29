
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fininstnid"
})
public class Cdtragt implements Serializable
{

    @JsonProperty("fininstnid")
    private Fininstnid__ fininstnid;
    private final static long serialVersionUID = -7288921247483575610L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cdtragt() {
    }

    /**
     * 
     * @param fininstnid
     */
    public Cdtragt(Fininstnid__ fininstnid) {
        super();
        this.fininstnid = fininstnid;
    }

    @JsonProperty("fininstnid")
    public Fininstnid__ getFininstnid() {
        return fininstnid;
    }

    @JsonProperty("fininstnid")
    public void setFininstnid(Fininstnid__ fininstnid) {
        this.fininstnid = fininstnid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fininstnid", fininstnid).toString();
    }

}
