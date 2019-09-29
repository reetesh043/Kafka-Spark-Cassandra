
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channelattributes",
    "paymenteventheader",
    "paymentdetails"
})
public class Paymenteventdetails implements Serializable
{

    @JsonProperty("channelattributes")
    private Channelattributes channelattributes;
    @JsonProperty("paymenteventheader")
    private Paymenteventheader paymenteventheader;
    @JsonProperty("paymentdetails")
    private Paymentdetails paymentdetails;
    private final static long serialVersionUID = 6651315088814855553L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paymenteventdetails() {
    }

    /**
     * 
     * @param channelattributes
     * @param paymenteventheader
     * @param paymentdetails
     */
    public Paymenteventdetails(Channelattributes channelattributes, Paymenteventheader paymenteventheader, Paymentdetails paymentdetails) {
        super();
        this.channelattributes = channelattributes;
        this.paymenteventheader = paymenteventheader;
        this.paymentdetails = paymentdetails;
    }

    @JsonProperty("channelattributes")
    public Channelattributes getChannelattributes() {
        return channelattributes;
    }

    @JsonProperty("channelattributes")
    public void setChannelattributes(Channelattributes channelattributes) {
        this.channelattributes = channelattributes;
    }

    @JsonProperty("paymenteventheader")
    public Paymenteventheader getPaymenteventheader() {
        return paymenteventheader;
    }

    @JsonProperty("paymenteventheader")
    public void setPaymenteventheader(Paymenteventheader paymenteventheader) {
        this.paymenteventheader = paymenteventheader;
    }

    @JsonProperty("paymentdetails")
    public Paymentdetails getPaymentdetails() {
        return paymentdetails;
    }

    @JsonProperty("paymentdetails")
    public void setPaymentdetails(Paymentdetails paymentdetails) {
        this.paymentdetails = paymentdetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("channelattributes", channelattributes).append("paymenteventheader", paymenteventheader).append("paymentdetails", paymentdetails).toString();
    }

}
