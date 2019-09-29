
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
public class Id_ implements Serializable
{

    @JsonProperty("othr")
    private Othr_ othr;
    private final static long serialVersionUID = -3320627014868213785L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Id_() {
    }

    /**
     * 
     * @param othr
     */
    public Id_(Othr_ othr) {
        super();
        this.othr = othr;
    }

    @JsonProperty("othr")
    public Othr_ getOthr() {
        return othr;
    }

    @JsonProperty("othr")
    public void setOthr(Othr_ othr) {
        this.othr = othr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("othr", othr).toString();
    }

}
