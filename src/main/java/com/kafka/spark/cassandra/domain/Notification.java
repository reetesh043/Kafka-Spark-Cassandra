
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "notificationheader",
    "event"
})
public class Notification implements Serializable
{

    @JsonProperty("notificationheader")
    private Notificationheader notificationheader;
    @JsonProperty("event")
    private List<Event> event = null;
    private final static long serialVersionUID = -5882573189289494174L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Notification() {
    }

    /**
     * 
     * @param event
     * @param notificationheader
     */
    public Notification(Notificationheader notificationheader, List<Event> event) {
        super();
        this.notificationheader = notificationheader;
        this.event = event;
    }

    @JsonProperty("notificationheader")
    public Notificationheader getNotificationheader() {
        return notificationheader;
    }

    @JsonProperty("notificationheader")
    public void setNotificationheader(Notificationheader notificationheader) {
        this.notificationheader = notificationheader;
    }

    @JsonProperty("event")
    public List<Event> getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(List<Event> event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notificationheader", notificationheader).append("event", event).toString();
    }

}
