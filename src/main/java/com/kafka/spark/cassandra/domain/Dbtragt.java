
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
public class Dbtragt implements Serializable
{

    @JsonProperty("fininstnid")
    private Fininstnid_ fininstnid;
    private final static long serialVersionUID = -6466619994863922261L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dbtragt() {
    }

    /**
     * 
     * @param fininstnid
     */
    public Dbtragt(Fininstnid_ fininstnid) {
        super();
        this.fininstnid = fininstnid;
    }

    @JsonProperty("fininstnid")
    public Fininstnid_ getFininstnid() {
        return fininstnid;
    }

    @JsonProperty("fininstnid")
    public void setFininstnid(Fininstnid_ fininstnid) {
        this.fininstnid = fininstnid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fininstnid", fininstnid).toString();
    }

}
