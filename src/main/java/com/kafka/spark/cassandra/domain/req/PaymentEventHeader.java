package com.kafka.spark.cassandra.domain.req;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"PaymentUniqueId", "PaymentScheme", "PaymentContext", "PaymentDestination", "OnusPayment", "PaymentStage"
})
public class PaymentEventHeader {

    @JsonProperty("PaymentUniqueId")
    private String paymentUniqueId;
    @JsonProperty("PaymentScheme")
    private String paymentScheme;
    @JsonProperty("PaymentContext")
    private String paymentContext;
    @JsonProperty("PaymentDestination")
    private String paymentDestination;
    @JsonProperty("OnusPayment")
    private String onusPayment;
    @JsonProperty("PaymentStage")
    private PaymentStage paymentStage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PaymentUniqueId")
    public String getPaymentUniqueId() {
        return paymentUniqueId;
    }

    @JsonProperty("PaymentUniqueId")
    public void setPaymentUniqueId(String paymentUniqueId) {
        this.paymentUniqueId = paymentUniqueId;
    }

    @JsonProperty("PaymentScheme")
    public String getPaymentScheme() {
        return paymentScheme;
    }

    @JsonProperty("PaymentScheme")
    public void setPaymentScheme(String paymentScheme) {
        this.paymentScheme = paymentScheme;
    }

    @JsonProperty("PaymentContext")
    public String getPaymentContext() {
        return paymentContext;
    }

    @JsonProperty("PaymentContext")
    public void setPaymentContext(String paymentContext) {
        this.paymentContext = paymentContext;
    }

    @JsonProperty("PaymentDestination")
    public String getPaymentDestination() {
        return paymentDestination;
    }

    @JsonProperty("PaymentDestination")
    public void setPaymentDestination(String paymentDestination) {
        this.paymentDestination = paymentDestination;
    }

    @JsonProperty("OnusPayment")
    public String getOnusPayment() {
        return onusPayment;
    }

    @JsonProperty("OnusPayment")
    public void setOnusPayment(String onusPayment) {
        this.onusPayment = onusPayment;
    }

    @JsonProperty("PaymentStage")
    public PaymentStage getPaymentStage() {
        return paymentStage;
    }

    @JsonProperty("PaymentStage")
    public void setPaymentStage(PaymentStage paymentStage) {
        this.paymentStage = paymentStage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}