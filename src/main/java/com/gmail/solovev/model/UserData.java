package com.gmail.solovev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "user_data")
public class UserData {

    private static String tableName = "user_data";

    @Id
    @Column(name = "ID")
    private String ssoid;

    @Column(name = "TS")
    private Time ts;

    @Column(name = "GRP")
    private String grp;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SUBTYPE")
    private String subtype;

    @Column(name = "URL")
    private String url;

    @Column(name = "ORG_ID")
    private String orgid;

    @Column(name = "FORM_ID")
    private String formid;

    @Column(name = "CODE")
    private String code;

    @Column(name = "LTPA")
    private String ltpa;

    @Column(name = "SUDIRRESPONSE")
    private String sudirresponse;

    @Column(name = "YMDH")
    private Date ymdh;

    public String getSsoid() { return ssoid; }

    public void setSsoid(String ssoid) { this.ssoid = ssoid; }

    public Time getTs() { return ts; }

    public void setTs(Time ts) { this.ts = ts; }

    public String getGrp() { return grp; }

    public void setGrp(String grp) { this.grp = grp; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getSubtype() { return subtype; }

    public void setSubtype(String subtype) { this.subtype = subtype; }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

    public String getOrgid() { return orgid; }

    public void setOrgid(String orgid) { this.orgid = orgid; }

    public String getFormid() { return formid; }

    public void setFormid(String formid) { this.formid = formid; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getLtpa() { return ltpa; }

    public void setLtpa(String ltpa) { this.ltpa = ltpa; }

    public String getSudirresponse() { return sudirresponse; }

    public void setSudirresponse(String sudirresponse) { this.sudirresponse = sudirresponse; }

    public Date getYmdh() { return ymdh; }

    public void setYmdh(Date ymdh) { this.ymdh = ymdh; }

    public static String getTableName() { return tableName; }

    public static void setTableName(String tableName) { UserData.tableName = tableName; }
}
