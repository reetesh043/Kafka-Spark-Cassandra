package com.kafka.spark.cassandra.domain.req;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Ustrd", "Strd"
})
public class RmtInf {

    @JsonProperty("Ustrd")
    private List<Object> ustrd = null;
    @JsonProperty("Strd")
    private List<Strd> strd = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Ustrd")
    public List<Object> getUstrd() {
        return ustrd;
    }

    @JsonProperty("Ustrd")
    public void setUstrd(List<Object> ustrd) {
        this.ustrd = ustrd;
    }

    @JsonProperty("Strd")
    public List<Strd> getStrd() {
        return strd;
    }

    @JsonProperty("Strd")
    public void setStrd(List<Strd> strd) {
        this.strd = strd;
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