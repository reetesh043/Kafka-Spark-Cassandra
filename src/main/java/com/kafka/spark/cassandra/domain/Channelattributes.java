
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "servicerequest"
})
public class Channelattributes implements Serializable
{

    @JsonProperty("servicerequest")
    private Servicerequest servicerequest;
    private final static long serialVersionUID = -2230865970000251244L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Channelattributes() {
    }

    /**
     * 
     * @param servicerequest
     */
    public Channelattributes(Servicerequest servicerequest) {
        super();
        this.servicerequest = servicerequest;
    }

    @JsonProperty("servicerequest")
    public Servicerequest getServicerequest() {
        return servicerequest;
    }

    @JsonProperty("servicerequest")
    public void setServicerequest(Servicerequest servicerequest) {
        this.servicerequest = servicerequest;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("servicerequest", servicerequest).toString();
    }

}
