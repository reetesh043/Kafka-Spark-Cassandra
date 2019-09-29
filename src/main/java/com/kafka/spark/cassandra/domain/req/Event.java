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
@JsonPropertyOrder({"EventId", "OccurrenceDateTime", "DetectionDateTime", "SourceSystemId", "Version", "Type", "Category", "PaymentEventDetails"
})
public class Event {

    @JsonProperty("EventId")
    private String eventId;
    @JsonProperty("OccurrenceDateTime")
    private String occurrenceDateTime;
    @JsonProperty("DetectionDateTime")
    private String detectionDateTime;
    @JsonProperty("SourceSystemId")
    private String sourceSystemId;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("PaymentEventDetails")
    private PaymentEventDetails paymentEventDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EventId")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("EventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("OccurrenceDateTime")
    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    @JsonProperty("OccurrenceDateTime")
    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    @JsonProperty("DetectionDateTime")
    public String getDetectionDateTime() {
        return detectionDateTime;
    }

    @JsonProperty("DetectionDateTime")
    public void setDetectionDateTime(String detectionDateTime) {
        this.detectionDateTime = detectionDateTime;
    }

    @JsonProperty("SourceSystemId")
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    @JsonProperty("SourceSystemId")
    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("PaymentEventDetails")
    public PaymentEventDetails getPaymentEventDetails() {
        return paymentEventDetails;
    }

    @JsonProperty("PaymentEventDetails")
    public void setPaymentEventDetails(PaymentEventDetails paymentEventDetails) {
        this.paymentEventDetails = paymentEventDetails;
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