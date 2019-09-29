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
@JsonPropertyOrder({"Id", "Tp", "Nm"
})
public class CdtrAcct {

    @JsonProperty("Id")
    private Id_ id;
    @JsonProperty("Tp")
    private Tp tp;
    @JsonProperty("Nm")
    private String nm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Id")
    public Id_ getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Id_ id) {
        this.id = id;
    }

    @JsonProperty("Tp")
    public Tp getTp() {
        return tp;
    }

    @JsonProperty("Tp")
    public void setTp(Tp tp) {
        this.tp = tp;
    }

    @JsonProperty("Nm")
    public String getNm() {
        return nm;
    }

    @JsonProperty("Nm")
    public void setNm(String nm) {
        this.nm = nm;
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