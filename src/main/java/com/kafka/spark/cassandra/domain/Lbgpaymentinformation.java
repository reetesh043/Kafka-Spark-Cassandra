
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uattnd",
    "dbtst",
    "lbgchargeamount",
    "debitamount",
    "creditamount"
})
public class Lbgpaymentinformation implements Serializable
{

    @JsonProperty("uattnd")
    private String uattnd;
    @JsonProperty("dbtst")
    private String dbtst;
    @JsonProperty("lbgchargeamount")
    private Lbgchargeamount lbgchargeamount;
    @JsonProperty("debitamount")
    private Debitamount debitamount;
    @JsonProperty("creditamount")
    private Creditamount creditamount;
    private final static long serialVersionUID = -5801287347532226964L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lbgpaymentinformation() {
    }

    /**
     * 
     * @param debitamount
     * @param uattnd
     * @param dbtst
     * @param lbgchargeamount
     * @param creditamount
     */
    public Lbgpaymentinformation(String uattnd, String dbtst, Lbgchargeamount lbgchargeamount, Debitamount debitamount, Creditamount creditamount) {
        super();
        this.uattnd = uattnd;
        this.dbtst = dbtst;
        this.lbgchargeamount = lbgchargeamount;
        this.debitamount = debitamount;
        this.creditamount = creditamount;
    }

    @JsonProperty("uattnd")
    public String getUattnd() {
        return uattnd;
    }

    @JsonProperty("uattnd")
    public void setUattnd(String uattnd) {
        this.uattnd = uattnd;
    }

    @JsonProperty("dbtst")
    public String getDbtst() {
        return dbtst;
    }

    @JsonProperty("dbtst")
    public void setDbtst(String dbtst) {
        this.dbtst = dbtst;
    }

    @JsonProperty("lbgchargeamount")
    public Lbgchargeamount getLbgchargeamount() {
        return lbgchargeamount;
    }

    @JsonProperty("lbgchargeamount")
    public void setLbgchargeamount(Lbgchargeamount lbgchargeamount) {
        this.lbgchargeamount = lbgchargeamount;
    }

    @JsonProperty("debitamount")
    public Debitamount getDebitamount() {
        return debitamount;
    }

    @JsonProperty("debitamount")
    public void setDebitamount(Debitamount debitamount) {
        this.debitamount = debitamount;
    }

    @JsonProperty("creditamount")
    public Creditamount getCreditamount() {
        return creditamount;
    }

    @JsonProperty("creditamount")
    public void setCreditamount(Creditamount creditamount) {
        this.creditamount = creditamount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uattnd", uattnd).append("dbtst", dbtst).append("lbgchargeamount", lbgchargeamount).append("debitamount", debitamount).append("creditamount", creditamount).toString();
    }

}
