
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "applicationtrackingid"
})
public class Paymentstage implements Serializable
{

    @JsonProperty("applicationtrackingid")
    private String applicationtrackingid;
    private final static long serialVersionUID = 2512917627553694558L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paymentstage() {
    }

    /**
     * 
     * @param applicationtrackingid
     */
    public Paymentstage(String applicationtrackingid) {
        super();
        this.applicationtrackingid = applicationtrackingid;
    }

    @JsonProperty("applicationtrackingid")
    public String getApplicationtrackingid() {
        return applicationtrackingid;
    }

    @JsonProperty("applicationtrackingid")
    public void setApplicationtrackingid(String applicationtrackingid) {
        this.applicationtrackingid = applicationtrackingid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationtrackingid", applicationtrackingid).toString();
    }

}
