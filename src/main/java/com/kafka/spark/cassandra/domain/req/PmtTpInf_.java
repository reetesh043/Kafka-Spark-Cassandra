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
@JsonPropertyOrder({"LclInstrm", "CtgyPurp"
})
public class PmtTpInf_ {

    @JsonProperty("LclInstrm")
    private LclInstrm lclInstrm;
    @JsonProperty("CtgyPurp")
    private CtgyPurp_ ctgyPurp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LclInstrm")
    public LclInstrm getLclInstrm() {
        return lclInstrm;
    }

    @JsonProperty("LclInstrm")
    public void setLclInstrm(LclInstrm lclInstrm) {
        this.lclInstrm = lclInstrm;
    }

    @JsonProperty("CtgyPurp")
    public CtgyPurp_ getCtgyPurp() {
        return ctgyPurp;
    }

    @JsonProperty("CtgyPurp")
    public void setCtgyPurp(CtgyPurp_ ctgyPurp) {
        this.ctgyPurp = ctgyPurp;
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