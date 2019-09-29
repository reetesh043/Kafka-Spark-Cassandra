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
@JsonPropertyOrder({"PmtId", "PmtTpInf", "IntrBkSttlmAmt", "AccptncDtTm", "InstdAmt", "XchgRate", "ChrgBr", "ChrgsInf", "InstgAgt", "Dbtr", "DbtrAcct", "DbtrAgt", "CdtrAgt", "Cdtr", "CdtrAcct", "Purp", "RgltryRptg", "RmtInf"
})
public class CdtTrfTxInf {

    @JsonProperty("PmtId")
    private PmtId pmtId;
    @JsonProperty("PmtTpInf")
    private PmtTpInf_ pmtTpInf;
    @JsonProperty("IntrBkSttlmAmt")
    private IntrBkSttlmAmt intrBkSttlmAmt;
    @JsonProperty("AccptncDtTm")
    private String accptncDtTm;
    @JsonProperty("InstdAmt")
    private InstdAmt instdAmt;
    @JsonProperty("XchgRate")
    private String xchgRate;
    @JsonProperty("ChrgBr")
    private String chrgBr;
    @JsonProperty("ChrgsInf")
    private List<ChrgsInf> chrgsInf = null;
    @JsonProperty("InstgAgt")
    private InstgAgt instgAgt;
    @JsonProperty("Dbtr")
    private Dbtr dbtr;
    @JsonProperty("DbtrAcct")
    private DbtrAcct dbtrAcct;
    @JsonProperty("DbtrAgt")
    private DbtrAgt dbtrAgt;
    @JsonProperty("CdtrAgt")
    private CdtrAgt cdtrAgt;
    @JsonProperty("Cdtr")
    private Cdtr cdtr;
    @JsonProperty("CdtrAcct")
    private CdtrAcct cdtrAcct;
    @JsonProperty("Purp")
    private Purp purp;
    @JsonProperty("RgltryRptg")
    private List<RgltryRptg> rgltryRptg = null;
    @JsonProperty("RmtInf")
    private RmtInf rmtInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PmtId")
    public PmtId getPmtId() {
        return pmtId;
    }

    @JsonProperty("PmtId")
    public void setPmtId(PmtId pmtId) {
        this.pmtId = pmtId;
    }

    @JsonProperty("PmtTpInf")
    public PmtTpInf_ getPmtTpInf() {
        return pmtTpInf;
    }

    @JsonProperty("PmtTpInf")
    public void setPmtTpInf(PmtTpInf_ pmtTpInf) {
        this.pmtTpInf = pmtTpInf;
    }

    @JsonProperty("IntrBkSttlmAmt")
    public IntrBkSttlmAmt getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    @JsonProperty("IntrBkSttlmAmt")
    public void setIntrBkSttlmAmt(IntrBkSttlmAmt intrBkSttlmAmt) {
        this.intrBkSttlmAmt = intrBkSttlmAmt;
    }

    @JsonProperty("AccptncDtTm")
    public String getAccptncDtTm() {
        return accptncDtTm;
    }

    @JsonProperty("AccptncDtTm")
    public void setAccptncDtTm(String accptncDtTm) {
        this.accptncDtTm = accptncDtTm;
    }

    @JsonProperty("InstdAmt")
    public InstdAmt getInstdAmt() {
        return instdAmt;
    }

    @JsonProperty("InstdAmt")
    public void setInstdAmt(InstdAmt instdAmt) {
        this.instdAmt = instdAmt;
    }

    @JsonProperty("XchgRate")
    public String getXchgRate() {
        return xchgRate;
    }

    @JsonProperty("XchgRate")
    public void setXchgRate(String xchgRate) {
        this.xchgRate = xchgRate;
    }

    @JsonProperty("ChrgBr")
    public String getChrgBr() {
        return chrgBr;
    }

    @JsonProperty("ChrgBr")
    public void setChrgBr(String chrgBr) {
        this.chrgBr = chrgBr;
    }

    @JsonProperty("ChrgsInf")
    public List<ChrgsInf> getChrgsInf() {
        return chrgsInf;
    }

    @JsonProperty("ChrgsInf")
    public void setChrgsInf(List<ChrgsInf> chrgsInf) {
        this.chrgsInf = chrgsInf;
    }

    @JsonProperty("InstgAgt")
    public InstgAgt getInstgAgt() {
        return instgAgt;
    }

    @JsonProperty("InstgAgt")
    public void setInstgAgt(InstgAgt instgAgt) {
        this.instgAgt = instgAgt;
    }

    @JsonProperty("Dbtr")
    public Dbtr getDbtr() {
        return dbtr;
    }

    @JsonProperty("Dbtr")
    public void setDbtr(Dbtr dbtr) {
        this.dbtr = dbtr;
    }

    @JsonProperty("DbtrAcct")
    public DbtrAcct getDbtrAcct() {
        return dbtrAcct;
    }

    @JsonProperty("DbtrAcct")
    public void setDbtrAcct(DbtrAcct dbtrAcct) {
        this.dbtrAcct = dbtrAcct;
    }

    @JsonProperty("DbtrAgt")
    public DbtrAgt getDbtrAgt() {
        return dbtrAgt;
    }

    @JsonProperty("DbtrAgt")
    public void setDbtrAgt(DbtrAgt dbtrAgt) {
        this.dbtrAgt = dbtrAgt;
    }

    @JsonProperty("CdtrAgt")
    public CdtrAgt getCdtrAgt() {
        return cdtrAgt;
    }

    @JsonProperty("CdtrAgt")
    public void setCdtrAgt(CdtrAgt cdtrAgt) {
        this.cdtrAgt = cdtrAgt;
    }

    @JsonProperty("Cdtr")
    public Cdtr getCdtr() {
        return cdtr;
    }

    @JsonProperty("Cdtr")
    public void setCdtr(Cdtr cdtr) {
        this.cdtr = cdtr;
    }

    @JsonProperty("CdtrAcct")
    public CdtrAcct getCdtrAcct() {
        return cdtrAcct;
    }

    @JsonProperty("CdtrAcct")
    public void setCdtrAcct(CdtrAcct cdtrAcct) {
        this.cdtrAcct = cdtrAcct;
    }

    @JsonProperty("Purp")
    public Purp getPurp() {
        return purp;
    }

    @JsonProperty("Purp")
    public void setPurp(Purp purp) {
        this.purp = purp;
    }

    @JsonProperty("RgltryRptg")
    public List<RgltryRptg> getRgltryRptg() {
        return rgltryRptg;
    }

    @JsonProperty("RgltryRptg")
    public void setRgltryRptg(List<RgltryRptg> rgltryRptg) {
        this.rgltryRptg = rgltryRptg;
    }

    @JsonProperty("RmtInf")
    public RmtInf getRmtInf() {
        return rmtInf;
    }

    @JsonProperty("RmtInf")
    public void setRmtInf(RmtInf rmtInf) {
        this.rmtInf = rmtInf;
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