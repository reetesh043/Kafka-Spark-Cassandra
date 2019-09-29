
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventid",
    "occurrencedatetime",
    "detectiondatetime",
    "sourcesystemid",
    "version",
    "type",
    "category",
    "paymenteventdetails"
})
public class Event implements Serializable
{

    @JsonProperty("eventid")
    private String eventid;
    @JsonProperty("occurrencedatetime")
    private String occurrencedatetime;
    @JsonProperty("detectiondatetime")
    private String detectiondatetime;
    @JsonProperty("sourcesystemid")
    private String sourcesystemid;
    @JsonProperty("version")
    private String version;
    @JsonProperty("type")
    private String type;
    @JsonProperty("category")
    private String category;
    @JsonProperty("paymenteventdetails")
    private Paymenteventdetails paymenteventdetails;
    private final static long serialVersionUID = 8546058293265080413L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param category
     * @param occurrencedatetime
     * @param paymenteventdetails
     * @param sourcesystemid
     * @param detectiondatetime
     * @param type
     * @param eventid
     * @param version
     */
    public Event(String eventid, String occurrencedatetime, String detectiondatetime, String sourcesystemid, String version, String type, String category, Paymenteventdetails paymenteventdetails) {
        super();
        this.eventid = eventid;
        this.occurrencedatetime = occurrencedatetime;
        this.detectiondatetime = detectiondatetime;
        this.sourcesystemid = sourcesystemid;
        this.version = version;
        this.type = type;
        this.category = category;
        this.paymenteventdetails = paymenteventdetails;
    }

    @JsonProperty("eventid")
    public String getEventid() {
        return eventid;
    }

    @JsonProperty("eventid")
    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    @JsonProperty("occurrencedatetime")
    public String getOccurrencedatetime() {
        return occurrencedatetime;
    }

    @JsonProperty("occurrencedatetime")
    public void setOccurrencedatetime(String occurrencedatetime) {
        this.occurrencedatetime = occurrencedatetime;
    }

    @JsonProperty("detectiondatetime")
    public String getDetectiondatetime() {
        return detectiondatetime;
    }

    @JsonProperty("detectiondatetime")
    public void setDetectiondatetime(String detectiondatetime) {
        this.detectiondatetime = detectiondatetime;
    }

    @JsonProperty("sourcesystemid")
    public String getSourcesystemid() {
        return sourcesystemid;
    }

    @JsonProperty("sourcesystemid")
    public void setSourcesystemid(String sourcesystemid) {
        this.sourcesystemid = sourcesystemid;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("paymenteventdetails")
    public Paymenteventdetails getPaymenteventdetails() {
        return paymenteventdetails;
    }

    @JsonProperty("paymenteventdetails")
    public void setPaymenteventdetails(Paymenteventdetails paymenteventdetails) {
        this.paymenteventdetails = paymenteventdetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventid", eventid).append("occurrencedatetime", occurrencedatetime).append("detectiondatetime", detectiondatetime).append("sourcesystemid", sourcesystemid).append("version", version).append("type", type).append("category", category).append("paymenteventdetails", paymenteventdetails).toString();
    }

}
