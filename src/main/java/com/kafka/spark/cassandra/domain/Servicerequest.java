
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "servicename",
    "fromsystem"
})
public class Servicerequest implements Serializable
{

    @JsonProperty("servicename")
    private String servicename;
    @JsonProperty("fromsystem")
    private String fromsystem;
    private final static long serialVersionUID = 1924756209433064593L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Servicerequest() {
    }

    /**
     * 
     * @param servicename
     * @param fromsystem
     */
    public Servicerequest(String servicename, String fromsystem) {
        super();
        this.servicename = servicename;
        this.fromsystem = fromsystem;
    }

    @JsonProperty("servicename")
    public String getServicename() {
        return servicename;
    }

    @JsonProperty("servicename")
    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    @JsonProperty("fromsystem")
    public String getFromsystem() {
        return fromsystem;
    }

    @JsonProperty("fromsystem")
    public void setFromsystem(String fromsystem) {
        this.fromsystem = fromsystem;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("servicename", servicename).append("fromsystem", fromsystem).toString();
    }

}
