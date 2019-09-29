
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "creationdatetime",
    "notificationkey",
    "numberofevents"
})
public class Notificationheader implements Serializable
{

    @JsonProperty("version")
    private String version;
    @JsonProperty("creationdatetime")
    private String creationdatetime;
    @JsonProperty("notificationkey")
    private String notificationkey;
    @JsonProperty("numberofevents")
    private Integer numberofevents;
    private final static long serialVersionUID = 8043204582748411755L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Notificationheader() {
    }

    /**
     * 
     * @param notificationkey
     * @param numberofevents
     * @param creationdatetime
     * @param version
     */
    public Notificationheader(String version, String creationdatetime, String notificationkey, Integer numberofevents) {
        super();
        this.version = version;
        this.creationdatetime = creationdatetime;
        this.notificationkey = notificationkey;
        this.numberofevents = numberofevents;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("creationdatetime")
    public String getCreationdatetime() {
        return creationdatetime;
    }

    @JsonProperty("creationdatetime")
    public void setCreationdatetime(String creationdatetime) {
        this.creationdatetime = creationdatetime;
    }

    @JsonProperty("notificationkey")
    public String getNotificationkey() {
        return notificationkey;
    }

    @JsonProperty("notificationkey")
    public void setNotificationkey(String notificationkey) {
        this.notificationkey = notificationkey;
    }

    @JsonProperty("numberofevents")
    public Integer getNumberofevents() {
        return numberofevents;
    }

    @JsonProperty("numberofevents")
    public void setNumberofevents(Integer numberofevents) {
        this.numberofevents = numberofevents;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("version", version).append("creationdatetime", creationdatetime).append("notificationkey", notificationkey).append("numberofevents", numberofevents).toString();
    }

}
