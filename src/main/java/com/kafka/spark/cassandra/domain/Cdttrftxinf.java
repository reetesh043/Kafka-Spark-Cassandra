
package com.kafka.spark.cassandra.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pmtid",
    "pmttpinf",
    "intrbksttlmamt",
    "accptncdttm",
    "instdamt",
    "xchgrate",
    "chrgbr",
    "chrgsinf",
    "instgagt",
    "dbtracct",
    "dbtragt",
    "cdtragt",
    "cdtracct",
    "purp",
    "rmtinf"
})
public class Cdttrftxinf implements Serializable
{

    @JsonProperty("pmtid")
    private Pmtid pmtid;
    @JsonProperty("pmttpinf")
    private Pmttpinf pmttpinf;
    @JsonProperty("intrbksttlmamt")
    private Intrbksttlmamt intrbksttlmamt;
    @JsonProperty("accptncdttm")
    private String accptncdttm;
    @JsonProperty("instdamt")
    private Instdamt instdamt;
    @JsonProperty("xchgrate")
    private Float xchgrate;
    @JsonProperty("chrgbr")
    private String chrgbr;
    @JsonProperty("chrgsinf")
    private List<Chrgsinf> chrgsinf = null;
    @JsonProperty("instgagt")
    private Instgagt instgagt;
    @JsonProperty("dbtracct")
    private Dbtracct dbtracct;
    @JsonProperty("dbtragt")
    private Dbtragt dbtragt;
    @JsonProperty("cdtragt")
    private Cdtragt cdtragt;
    @JsonProperty("cdtracct")
    private Cdtracct cdtracct;
    @JsonProperty("purp")
    private Purp purp;
    @JsonProperty("rmtinf")
    private Rmtinf rmtinf;
    private final static long serialVersionUID = 3898209134282472654L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cdttrftxinf() {
    }

    /**
     * 
     * @param cdtracct
     * @param dbtragt
     * @param pmtid
     * @param accptncdttm
     * @param chrgbr
     * @param instgagt
     * @param cdtragt
     * @param dbtracct
     * @param pmttpinf
     * @param xchgrate
     * @param instdamt
     * @param chrgsinf
     * @param purp
     * @param rmtinf
     * @param intrbksttlmamt
     */
    public Cdttrftxinf(Pmtid pmtid, Pmttpinf pmttpinf, Intrbksttlmamt intrbksttlmamt, String accptncdttm, Instdamt instdamt, Float xchgrate, String chrgbr, List<Chrgsinf> chrgsinf, Instgagt instgagt, Dbtracct dbtracct, Dbtragt dbtragt, Cdtragt cdtragt, Cdtracct cdtracct, Purp purp, Rmtinf rmtinf) {
        super();
        this.pmtid = pmtid;
        this.pmttpinf = pmttpinf;
        this.intrbksttlmamt = intrbksttlmamt;
        this.accptncdttm = accptncdttm;
        this.instdamt = instdamt;
        this.xchgrate = xchgrate;
        this.chrgbr = chrgbr;
        this.chrgsinf = chrgsinf;
        this.instgagt = instgagt;
        this.dbtracct = dbtracct;
        this.dbtragt = dbtragt;
        this.cdtragt = cdtragt;
        this.cdtracct = cdtracct;
        this.purp = purp;
        this.rmtinf = rmtinf;
    }

    @JsonProperty("pmtid")
    public Pmtid getPmtid() {
        return pmtid;
    }

    @JsonProperty("pmtid")
    public void setPmtid(Pmtid pmtid) {
        this.pmtid = pmtid;
    }

    @JsonProperty("pmttpinf")
    public Pmttpinf getPmttpinf() {
        return pmttpinf;
    }

    @JsonProperty("pmttpinf")
    public void setPmttpinf(Pmttpinf pmttpinf) {
        this.pmttpinf = pmttpinf;
    }

    @JsonProperty("intrbksttlmamt")
    public Intrbksttlmamt getIntrbksttlmamt() {
        return intrbksttlmamt;
    }

    @JsonProperty("intrbksttlmamt")
    public void setIntrbksttlmamt(Intrbksttlmamt intrbksttlmamt) {
        this.intrbksttlmamt = intrbksttlmamt;
    }

    @JsonProperty("accptncdttm")
    public String getAccptncdttm() {
        return accptncdttm;
    }

    @JsonProperty("accptncdttm")
    public void setAccptncdttm(String accptncdttm) {
        this.accptncdttm = accptncdttm;
    }

    @JsonProperty("instdamt")
    public Instdamt getInstdamt() {
        return instdamt;
    }

    @JsonProperty("instdamt")
    public void setInstdamt(Instdamt instdamt) {
        this.instdamt = instdamt;
    }

    @JsonProperty("xchgrate")
    public Float getXchgrate() {
        return xchgrate;
    }

    @JsonProperty("xchgrate")
    public void setXchgrate(Float xchgrate) {
        this.xchgrate = xchgrate;
    }

    @JsonProperty("chrgbr")
    public String getChrgbr() {
        return chrgbr;
    }

    @JsonProperty("chrgbr")
    public void setChrgbr(String chrgbr) {
        this.chrgbr = chrgbr;
    }

    @JsonProperty("chrgsinf")
    public List<Chrgsinf> getChrgsinf() {
        return chrgsinf;
    }

    @JsonProperty("chrgsinf")
    public void setChrgsinf(List<Chrgsinf> chrgsinf) {
        this.chrgsinf = chrgsinf;
    }

    @JsonProperty("instgagt")
    public Instgagt getInstgagt() {
        return instgagt;
    }

    @JsonProperty("instgagt")
    public void setInstgagt(Instgagt instgagt) {
        this.instgagt = instgagt;
    }

    @JsonProperty("dbtracct")
    public Dbtracct getDbtracct() {
        return dbtracct;
    }

    @JsonProperty("dbtracct")
    public void setDbtracct(Dbtracct dbtracct) {
        this.dbtracct = dbtracct;
    }

    @JsonProperty("dbtragt")
    public Dbtragt getDbtragt() {
        return dbtragt;
    }

    @JsonProperty("dbtragt")
    public void setDbtragt(Dbtragt dbtragt) {
        this.dbtragt = dbtragt;
    }

    @JsonProperty("cdtragt")
    public Cdtragt getCdtragt() {
        return cdtragt;
    }

    @JsonProperty("cdtragt")
    public void setCdtragt(Cdtragt cdtragt) {
        this.cdtragt = cdtragt;
    }

    @JsonProperty("cdtracct")
    public Cdtracct getCdtracct() {
        return cdtracct;
    }

    @JsonProperty("cdtracct")
    public void setCdtracct(Cdtracct cdtracct) {
        this.cdtracct = cdtracct;
    }

    @JsonProperty("purp")
    public Purp getPurp() {
        return purp;
    }

    @JsonProperty("purp")
    public void setPurp(Purp purp) {
        this.purp = purp;
    }

    @JsonProperty("rmtinf")
    public Rmtinf getRmtinf() {
        return rmtinf;
    }

    @JsonProperty("rmtinf")
    public void setRmtinf(Rmtinf rmtinf) {
        this.rmtinf = rmtinf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pmtid", pmtid).append("pmttpinf", pmttpinf).append("intrbksttlmamt", intrbksttlmamt).append("accptncdttm", accptncdttm).append("instdamt", instdamt).append("xchgrate", xchgrate).append("chrgbr", chrgbr).append("chrgsinf", chrgsinf).append("instgagt", instgagt).append("dbtracct", dbtracct).append("dbtragt", dbtragt).append("cdtragt", cdtragt).append("cdtracct", cdtracct).append("purp", purp).append("rmtinf", rmtinf).toString();
    }

}
