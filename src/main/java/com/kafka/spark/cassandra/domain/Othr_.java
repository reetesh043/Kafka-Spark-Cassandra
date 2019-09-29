
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id"
})
public class Othr_ implements Serializable
{

    @JsonProperty("id")
    private String id;
    private final static long serialVersionUID = 3667188660485113110L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Othr_() {
    }

    /**
     * 
     * @param id
     */
    public Othr_(String id) {
        super();
        this.id = id;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).toString();
    }

}
