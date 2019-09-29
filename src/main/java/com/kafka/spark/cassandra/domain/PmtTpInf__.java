package com.kafka.spark.cassandra.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"SvcLvl", "LclInstrm"
})
public class PmtTpInf__ {

    @JsonProperty("SvcLvl")
    private SvcLvl svcLvl;
    @JsonProperty("LclInstrm")
    private LclInstrm_ lclInstrm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SvcLvl")
    public SvcLvl getSvcLvl() {
        return svcLvl;
    }

    @JsonProperty("SvcLvl")
    public void setSvcLvl(SvcLvl svcLvl) {
        this.svcLvl = svcLvl;
    }

    @JsonProperty("LclInstrm")
    public LclInstrm_ getLclInstrm() {
        return lclInstrm;
    }

    @JsonProperty("LclInstrm")
    public void setLclInstrm(LclInstrm_ lclInstrm) {
        this.lclInstrm = lclInstrm;
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