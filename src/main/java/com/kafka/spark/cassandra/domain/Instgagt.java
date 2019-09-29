
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
public class Instgagt implements Serializable
{

    @JsonProperty("fininstnid")
    private Fininstnid fininstnid;
    private final static long serialVersionUID = 4567408148456220679L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Instgagt() {
    }

    /**
     * 
     * @param fininstnid
     */
    public Instgagt(Fininstnid fininstnid) {
        super();
        this.fininstnid = fininstnid;
    }

    @JsonProperty("fininstnid")
    public Fininstnid getFininstnid() {
        return fininstnid;
    }

    @JsonProperty("fininstnid")
    public void setFininstnid(Fininstnid fininstnid) {
        this.fininstnid = fininstnid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fininstnid", fininstnid).toString();
    }

}
