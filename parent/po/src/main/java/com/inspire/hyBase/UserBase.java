package com.inspire.hyBase;

import com.inspire.entity.BaseEntity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class UserBase extends BaseEntity {

    private String smemberid; //会员ID String
    private String soperatorno; //交易员编号 String
    private String susername; //用户名 String
    private String spassword; //用户密码 String
    private String stradepassword; //交易密码 String
    private String slikename; //昵称 String
    private String sname; //姓名 String
    private Integer isex = 0; //性别 int
    private String sphone; //电话 String
    private String sfax; //传真 String
    private String smobile; //手机 String
    private String semail; //Email String
    private Integer bisymobile = 0; //手机号是否已验证 int
    private Integer bisyemail = 0; //Email是否已验证 int
    private String sqq; //QQ String
    private String smsn; //Msn String
    private Integer bisvalid = 0; //是否有效 int
    private Integer bisadmin = 0; //是否管理员 int
    private Integer bisdelete = 0; //是否删除 int
    private Long ierrorcount; //当天密码错误次数 long
    private Date dlastlogintime; //上次登陆时间 Date
    private Date dendlogintime; //最后登陆时间 Date
    private String sremark; //备注 String
    private Date dlastloginsuccessdate; //最后登录成功日期 Date

    /**
     * 会员ID String
     */
    @Column(name = "smemberid", length = 32)
    public String getSmemberid() {
        return smemberid;//会员ID String
    }

    /**
     * 会员ID String
     */
    public void setSmemberid(String smemberid) {
        this.smemberid = smemberid;//会员ID String
    }

    /**
     * 交易员编号 String
     */
    @Column(name = "soperatorno", length = 50)
    public String getSoperatorno() {
        return soperatorno;//交易员编号 String
    }

    /**
     * 交易员编号 String
     */
    public void setSoperatorno(String soperatorno) {
        this.soperatorno = soperatorno;//交易员编号 String
    }

    /**
     * 用户名 String
     */
    @Column(name = "susername", length = 50)
    public String getSusername() {
        return susername;//用户名 String
    }

    /**
     * 用户名 String
     */
    public void setSusername(String susername) {
        this.susername = susername;//用户名 String
    }

    /**
     * 用户密码 String
     */
    @Column(name = "spassword", length = 50)
    public String getSpassword() {
        return spassword;//用户密码 String
    }

    /**
     * 用户密码 String
     */
    public void setSpassword(String spassword) {
        this.spassword = spassword;//用户密码 String
    }

    /**
     * 交易密码 String
     */
    @Column(name = "stradepassword", length = 50)
    public String getStradepassword() {
        return stradepassword;//交易密码 String
    }

    /**
     * 交易密码 String
     */
    public void setStradepassword(String stradepassword) {
        this.stradepassword = stradepassword;//交易密码 String
    }

    /**
     * 昵称 String
     */
    @Column(name = "slikename", length = 50)
    public String getSlikename() {
        return slikename;//昵称 String
    }

    /**
     * 昵称 String
     */
    public void setSlikename(String slikename) {
        this.slikename = slikename;//昵称 String
    }

    /**
     * 姓名 String
     */
    @Column(name = "sname", length = 50)
    public String getSname() {
        return sname;//姓名 String
    }

    /**
     * 姓名 String
     */
    public void setSname(String sname) {
        this.sname = sname;//姓名 String
    }

    /**
     * 性别 int
     * Sex:
     * 0:MAN:男
     * 1:WOMAN:女
     */
    @Column(name = "isex")
    public Integer getIsex() {
        return isex;//性别 int
    }

    /**
     * 性别 int
     * Sex:
     * 0:MAN:男
     * 1:WOMAN:女
     */
    public void setIsex(Integer isex) {
        this.isex = isex;//性别 int
    }

    /**
     * 电话 String
     */
    @Column(name = "sphone", length = 20)
    public String getSphone() {
        return sphone;//电话 String
    }

    /**
     * 电话 String
     */
    public void setSphone(String sphone) {
        this.sphone = sphone;//电话 String
    }

    /**
     * 传真 String
     */
    @Column(name = "sfax", length = 30)
    public String getSfax() {
        return sfax;//传真 String
    }

    /**
     * 传真 String
     */
    public void setSfax(String sfax) {
        this.sfax = sfax;//传真 String
    }

    /**
     * 手机 String
     */
    @Column(name = "smobile", length = 20)
    public String getSmobile() {
        return smobile;//手机 String
    }

    /**
     * 手机 String
     */
    public void setSmobile(String smobile) {
        this.smobile = smobile;//手机 String
    }

    /**
     * Email String
     */
    @Column(name = "semail", length = 100)
    public String getSemail() {
        return semail;//Email String
    }

    /**
     * Email String
     */
    public void setSemail(String semail) {
        this.semail = semail;//Email String
    }

    /**
     * 手机号是否已验证 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisymobile")
    public Integer getBisymobile() {
        return bisymobile;//手机号是否已验证 int
    }

    /**
     * 手机号是否已验证 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisymobile(Integer bisymobile) {
        this.bisymobile = bisymobile;//手机号是否已验证 int
    }

    /**
     * Email是否已验证 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisyemail")
    public Integer getBisyemail() {
        return bisyemail;//Email是否已验证 int
    }

    /**
     * Email是否已验证 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisyemail(Integer bisyemail) {
        this.bisyemail = bisyemail;//Email是否已验证 int
    }

    /**
     * QQ String
     */
    @Column(name = "sqq", length = 50)
    public String getSqq() {
        return sqq;//QQ String
    }

    /**
     * QQ String
     */
    public void setSqq(String sqq) {
        this.sqq = sqq;//QQ String
    }

    /**
     * Msn String
     */
    @Column(name = "smsn", length = 50)
    public String getSmsn() {
        return smsn;//Msn String
    }

    /**
     * Msn String
     */
    public void setSmsn(String smsn) {
        this.smsn = smsn;//Msn String
    }

    /**
     * 是否有效 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisvalid")
    public Integer getBisvalid() {
        return bisvalid;//是否有效 int
    }

    /**
     * 是否有效 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisvalid(Integer bisvalid) {
        this.bisvalid = bisvalid;//是否有效 int
    }

    /**
     * 是否管理员 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisadmin")
    public Integer getBisadmin() {
        return bisadmin;//是否管理员 int
    }

    /**
     * 是否管理员 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisadmin(Integer bisadmin) {
        this.bisadmin = bisadmin;//是否管理员 int
    }

    /**
     * 是否删除 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisdelete")
    public Integer getBisdelete() {
        return bisdelete;//是否删除 int
    }

    /**
     * 是否删除 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisdelete(Integer bisdelete) {
        this.bisdelete = bisdelete;//是否删除 int
    }

    /**
     * 当天密码错误次数 long
     */
    @Column(name = "ierrorcount")
    public Long getIerrorcount() {
        return ierrorcount;//当天密码错误次数 long
    }

    /**
     * 当天密码错误次数 long
     */
    public void setIerrorcount(Long ierrorcount) {
        this.ierrorcount = ierrorcount;//当天密码错误次数 long
    }

    /**
     * 上次登陆时间 Date
     */
    @Column(name = "dlastlogintime")
    public Date getDlastlogintime() {
        return dlastlogintime;//上次登陆时间 Date
    }

    /**
     * 上次登陆时间 Date
     */
    public void setDlastlogintime(Date dlastlogintime) {
        this.dlastlogintime = dlastlogintime;//上次登陆时间 Date
    }

    /**
     * 最后登陆时间 Date
     */
    @Column(name = "dendlogintime")
    public Date getDendlogintime() {
        return dendlogintime;//最后登陆时间 Date
    }

    /**
     * 最后登陆时间 Date
     */
    public void setDendlogintime(Date dendlogintime) {
        this.dendlogintime = dendlogintime;//最后登陆时间 Date
    }

    /**
     * 备注 String
     */
    @Column(name = "sremark", length = 500)
    public String getSremark() {
        return sremark;//备注 String
    }

    /**
     * 备注 String
     */
    public void setSremark(String sremark) {
        this.sremark = sremark;//备注 String
    }

    /**
     * 最后登录成功日期 Date
     */
    @Column(name = "dlastloginsuccessdate")
    public Date getDlastloginsuccessdate() {
        return dlastloginsuccessdate;//最后登录成功日期 Date
    }

    /**
     * 最后登录成功日期 Date
     */
    public void setDlastloginsuccessdate(Date dlastloginsuccessdate) {
        this.dlastloginsuccessdate = dlastloginsuccessdate;//最后登录成功日期 Date
    }

}
