
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref"
})
public class Cdtrrefinf implements Serializable
{

    @JsonProperty("ref")
    private String ref;
    private final static long serialVersionUID = 3839740822201954403L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cdtrrefinf() {
    }

    /**
     * 
     * @param ref
     */
    public Cdtrrefinf(String ref) {
        super();
        this.ref = ref;
    }

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ref", ref).toString();
    }

}
