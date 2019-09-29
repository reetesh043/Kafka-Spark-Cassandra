
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "tp",
    "nm"
})
public class Cdtracct implements Serializable
{

    @JsonProperty("id")
    private Id_ id;
    @JsonProperty("tp")
    private Tp tp;
    @JsonProperty("nm")
    private String nm;
    private final static long serialVersionUID = 6945151511102856254L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cdtracct() {
    }

    /**
     * 
     * @param id
     * @param tp
     * @param nm
     */
    public Cdtracct(Id_ id, Tp tp, String nm) {
        super();
        this.id = id;
        this.tp = tp;
        this.nm = nm;
    }

    @JsonProperty("id")
    public Id_ getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id_ id) {
        this.id = id;
    }

    @JsonProperty("tp")
    public Tp getTp() {
        return tp;
    }

    @JsonProperty("tp")
    public void setTp(Tp tp) {
        this.tp = tp;
    }

    @JsonProperty("nm")
    public String getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(String nm) {
        this.nm = nm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("tp", tp).append("nm", nm).toString();
    }

}
