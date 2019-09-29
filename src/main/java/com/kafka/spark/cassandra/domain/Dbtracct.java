
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "nm"
})
public class Dbtracct implements Serializable
{

    @JsonProperty("id")
    private Id id;
    @JsonProperty("nm")
    private String nm;
    private final static long serialVersionUID = -6004843296070594618L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dbtracct() {
    }

    /**
     * 
     * @param id
     * @param nm
     */
    public Dbtracct(Id id, String nm) {
        super();
        this.id = id;
        this.nm = nm;
    }

    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("nm")
    public String getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(String nm) {
        this.nm = nm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("nm", nm).toString();
    }

}
