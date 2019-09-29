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
@JsonPropertyOrder({"DbtAmt", "DbtAmtCcy"
})
public class DebitAmount {

    @JsonProperty("DbtAmt")
    private Integer dbtAmt;
    @JsonProperty("DbtAmtCcy")
    private String dbtAmtCcy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DbtAmt")
    public Integer getDbtAmt() {
        return dbtAmt;
    }

    @JsonProperty("DbtAmt")
    public void setDbtAmt(Integer dbtAmt) {
        this.dbtAmt = dbtAmt;
    }

    @JsonProperty("DbtAmtCcy")
    public String getDbtAmtCcy() {
        return dbtAmtCcy;
    }

    @JsonProperty("DbtAmtCcy")
    public void setDbtAmtCcy(String dbtAmtCcy) {
        this.dbtAmtCcy = dbtAmtCcy;
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