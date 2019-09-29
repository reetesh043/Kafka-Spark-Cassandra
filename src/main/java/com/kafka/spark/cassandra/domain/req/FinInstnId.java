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
@JsonPropertyOrder({"BICFI", "ClrSysMmbId", "Nm", "PstlAdr", "Othr"
})
public class FinInstnId {

    @JsonProperty("BICFI")
    private String bICFI;
    @JsonProperty("ClrSysMmbId")
    private ClrSysMmbId clrSysMmbId;
    @JsonProperty("Nm")
    private String nm;
    @JsonProperty("PstlAdr")
    private PstlAdr pstlAdr;
    @JsonProperty("Othr")
    private Othr othr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BICFI")
    public String getBICFI() {
        return bICFI;
    }

    @JsonProperty("BICFI")
    public void setBICFI(String bICFI) {
        this.bICFI = bICFI;
    }

    @JsonProperty("ClrSysMmbId")
    public ClrSysMmbId getClrSysMmbId() {
        return clrSysMmbId;
    }

    @JsonProperty("ClrSysMmbId")
    public void setClrSysMmbId(ClrSysMmbId clrSysMmbId) {
        this.clrSysMmbId = clrSysMmbId;
    }

    @JsonProperty("Nm")
    public String getNm() {
        return nm;
    }

    @JsonProperty("Nm")
    public void setNm(String nm) {
        this.nm = nm;
    }

    @JsonProperty("PstlAdr")
    public PstlAdr getPstlAdr() {
        return pstlAdr;
    }

    @JsonProperty("PstlAdr")
    public void setPstlAdr(PstlAdr pstlAdr) {
        this.pstlAdr = pstlAdr;
    }

    @JsonProperty("Othr")
    public Othr getOthr() {
        return othr;
    }

    @JsonProperty("Othr")
    public void setOthr(Othr othr) {
        this.othr = othr;
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