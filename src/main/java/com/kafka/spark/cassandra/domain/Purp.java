
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cd"
})
public class Purp implements Serializable
{

    @JsonProperty("cd")
    private String cd;
    private final static long serialVersionUID = 4925104588872691433L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Purp() {
    }

    /**
     * 
     * @param cd
     */
    public Purp(String cd) {
        super();
        this.cd = cd;
    }

    @JsonProperty("cd")
    public String getCd() {
        return cd;
    }

    @JsonProperty("cd")
    public void setCd(String cd) {
        this.cd = cd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cd", cd).toString();
    }

}
