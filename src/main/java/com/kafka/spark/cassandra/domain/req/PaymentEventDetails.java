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
@JsonPropertyOrder({"PaymentEventHeader", "PaymentDetails"
})
public class PaymentEventDetails {

    @JsonProperty("PaymentEventHeader")
    private PaymentEventHeader paymentEventHeader;
    @JsonProperty("PaymentDetails")
    private PaymentDetails paymentDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PaymentEventHeader")
    public PaymentEventHeader getPaymentEventHeader() {
        return paymentEventHeader;
    }

    @JsonProperty("PaymentEventHeader")
    public void setPaymentEventHeader(PaymentEventHeader paymentEventHeader) {
        this.paymentEventHeader = paymentEventHeader;
    }

    @JsonProperty("PaymentDetails")
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    @JsonProperty("PaymentDetails")
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
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