
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lbgpaymentinformation",
    "paymentmessagetype",
    "fitoficstmrcdttrf"
})
public class Paymentdetails implements Serializable
{

    @JsonProperty("lbgpaymentinformation")
    private Lbgpaymentinformation lbgpaymentinformation;
    @JsonProperty("paymentmessagetype")
    private String paymentmessagetype;
    @JsonProperty("fitoficstmrcdttrf")
    private Fitoficstmrcdttrf fitoficstmrcdttrf;
    private final static long serialVersionUID = 4911475649566506670L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paymentdetails() {
    }

    /**
     * 
     * @param fitoficstmrcdttrf
     * @param paymentmessagetype
     * @param lbgpaymentinformation
     */
    public Paymentdetails(Lbgpaymentinformation lbgpaymentinformation, String paymentmessagetype, Fitoficstmrcdttrf fitoficstmrcdttrf) {
        super();
        this.lbgpaymentinformation = lbgpaymentinformation;
        this.paymentmessagetype = paymentmessagetype;
        this.fitoficstmrcdttrf = fitoficstmrcdttrf;
    }

    @JsonProperty("lbgpaymentinformation")
    public Lbgpaymentinformation getLbgpaymentinformation() {
        return lbgpaymentinformation;
    }

    @JsonProperty("lbgpaymentinformation")
    public void setLbgpaymentinformation(Lbgpaymentinformation lbgpaymentinformation) {
        this.lbgpaymentinformation = lbgpaymentinformation;
    }

    @JsonProperty("paymentmessagetype")
    public String getPaymentmessagetype() {
        return paymentmessagetype;
    }

    @JsonProperty("paymentmessagetype")
    public void setPaymentmessagetype(String paymentmessagetype) {
        this.paymentmessagetype = paymentmessagetype;
    }

    @JsonProperty("fitoficstmrcdttrf")
    public Fitoficstmrcdttrf getFitoficstmrcdttrf() {
        return fitoficstmrcdttrf;
    }

    @JsonProperty("fitoficstmrcdttrf")
    public void setFitoficstmrcdttrf(Fitoficstmrcdttrf fitoficstmrcdttrf) {
        this.fitoficstmrcdttrf = fitoficstmrcdttrf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lbgpaymentinformation", lbgpaymentinformation).append("paymentmessagetype", paymentmessagetype).append("fitoficstmrcdttrf", fitoficstmrcdttrf).toString();
    }

}
