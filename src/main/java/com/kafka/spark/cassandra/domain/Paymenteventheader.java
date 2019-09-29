
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paymentuniqueid",
    "paymentinstancenumber",
    "paymentscheme",
    "paymentcontext",
    "paymentdestination",
    "onuspayment",
    "paymentstage"
})
public class Paymenteventheader implements Serializable
{

    @JsonProperty("paymentuniqueid")
    private String paymentuniqueid;
    @JsonProperty("paymentinstancenumber")
    private String paymentinstancenumber;
    @JsonProperty("paymentscheme")
    private String paymentscheme;
    @JsonProperty("paymentcontext")
    private String paymentcontext;
    @JsonProperty("paymentdestination")
    private String paymentdestination;
    @JsonProperty("onuspayment")
    private String onuspayment;
    @JsonProperty("paymentstage")
    private Paymentstage paymentstage;
    private final static long serialVersionUID = 2335815398768392628L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paymenteventheader() {
    }

    /**
     * 
     * @param paymentcontext
     * @param paymentinstancenumber
     * @param paymentscheme
     * @param onuspayment
     * @param paymentuniqueid
     * @param paymentstage
     * @param paymentdestination
     */
    public Paymenteventheader(String paymentuniqueid, String paymentinstancenumber, String paymentscheme, String paymentcontext, String paymentdestination, String onuspayment, Paymentstage paymentstage) {
        super();
        this.paymentuniqueid = paymentuniqueid;
        this.paymentinstancenumber = paymentinstancenumber;
        this.paymentscheme = paymentscheme;
        this.paymentcontext = paymentcontext;
        this.paymentdestination = paymentdestination;
        this.onuspayment = onuspayment;
        this.paymentstage = paymentstage;
    }

    @JsonProperty("paymentuniqueid")
    public String getPaymentuniqueid() {
        return paymentuniqueid;
    }

    @JsonProperty("paymentuniqueid")
    public void setPaymentuniqueid(String paymentuniqueid) {
        this.paymentuniqueid = paymentuniqueid;
    }

    @JsonProperty("paymentinstancenumber")
    public String getPaymentinstancenumber() {
        return paymentinstancenumber;
    }

    @JsonProperty("paymentinstancenumber")
    public void setPaymentinstancenumber(String paymentinstancenumber) {
        this.paymentinstancenumber = paymentinstancenumber;
    }

    @JsonProperty("paymentscheme")
    public String getPaymentscheme() {
        return paymentscheme;
    }

    @JsonProperty("paymentscheme")
    public void setPaymentscheme(String paymentscheme) {
        this.paymentscheme = paymentscheme;
    }

    @JsonProperty("paymentcontext")
    public String getPaymentcontext() {
        return paymentcontext;
    }

    @JsonProperty("paymentcontext")
    public void setPaymentcontext(String paymentcontext) {
        this.paymentcontext = paymentcontext;
    }

    @JsonProperty("paymentdestination")
    public String getPaymentdestination() {
        return paymentdestination;
    }

    @JsonProperty("paymentdestination")
    public void setPaymentdestination(String paymentdestination) {
        this.paymentdestination = paymentdestination;
    }

    @JsonProperty("onuspayment")
    public String getOnuspayment() {
        return onuspayment;
    }

    @JsonProperty("onuspayment")
    public void setOnuspayment(String onuspayment) {
        this.onuspayment = onuspayment;
    }

    @JsonProperty("paymentstage")
    public Paymentstage getPaymentstage() {
        return paymentstage;
    }

    @JsonProperty("paymentstage")
    public void setPaymentstage(Paymentstage paymentstage) {
        this.paymentstage = paymentstage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("paymentuniqueid", paymentuniqueid).append("paymentinstancenumber", paymentinstancenumber).append("paymentscheme", paymentscheme).append("paymentcontext", paymentcontext).append("paymentdestination", paymentdestination).append("onuspayment", onuspayment).append("paymentstage", paymentstage).toString();
    }

}
