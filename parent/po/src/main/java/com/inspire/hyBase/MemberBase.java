package com.inspire.hyBase;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.inspire.entity.BaseEntity;

@MappedSuperclass
public class MemberBase extends BaseEntity {

    private Integer bismembercert = 0; //是否通过企业认证 int
    private String smemberno; //企业编号 String
    private String scnname; //企业名称 String
    private String senname; //英文名称 String
    private String sshortname; //中文简称 String
    private Long icredit = 0l; //信用值 long
    private Integer imembertype = 0; //会员类型 int
    private String sbusinessmode; //经营模式 String
    private String smemberkind; //企业性质 String
    private String sbusinessno; //工商执照号 String
    private String sorgcode; //组织机构代码 String
    private String slegalpersoncode; //法定代表人身份证 String
    private String staxno; //税务登记号 String
    private String slegalperson; //法人 String
    private String sareaid; //地区区号 String
    private String sprovince; //省份 String
    private String scity; //城市 String
    private String sregion; //区县 String
    private String sregmoneytype; //注册资金货币种类 String
    private Long iregmoney; //注册资金 long
    private String sopenbank; //开户银行 String
    private String sopenname; //开户名称 String
    private String sopenaccount; //开户账号 String
    private String sbalancebank; //结算银行 String
    private String sbalancename; //结算户名 String
    private String sfax; //传真 String
    private String sbalanceaccount; //结算行帐号 String
    private Integer bcaflag = 0; //是否使用CA int
    private String sbusbigtype; //主营行业大类 String
    private String sbussmalltype; //主营行业小类 String
    private String sbussmallname; //主营小类名称 String
    private String sregaddress; //注册地址 String
    private String sbusaddress; //经营地址 String
    private String slinkman; //联系人 String
    private String szipcode; //邮编 String
    private String sphone; //电话 String
    private String smobile; //手机 String
    private String semail; //Email String
    private String scompanydesc; //公司简介 String
    private Date dvaliddate; //有效期 Date
    private Integer imemberstatus = 3; //状态 int
    private Integer iscope = 0; //服务范围 int
    private Date dapplydate; //申请日期 Date
    private String scheckuserid; //审核人 String
    private Date dcheckdate; //审核日期 Date
    private String scheckinfo; //审核意见 String
    private String sremark; //备注 String
    private Integer bdelete = 0; //是否删除 int
    private String sinvoicephone; //开票电话 String
    private String sinvoiceaddress; //开票地址 String
    private String sbanner; //店铺banner String
    private String slogo; //会员LOGO String
    private String sshortnamejpname; //简称简拼名 String
    private String sshortnamepyname; //简称全拼名 String
    private String sjpname; //简拼名 String
    private String spyname; //全拼名 String
    private Integer iauthtype = 0; //认证类型 int
    private Long isort = 0l; //排序号 long
    private String slocation; //地理位置 String
    private Integer bisstop = 0; //是否营业 int
    private Integer bisselfsaler = 0; //是否自营 int
    private Integer biscardmerged = 0; //是否三码合一 int
    private String ssocialcreditno; //统一社会信息用代码 String

    /**
     * 是否通过企业认证 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bismembercert")
    public Integer getBismembercert() {
        return bismembercert;//是否通过企业认证 int
    }

    /**
     * 是否通过企业认证 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBismembercert(Integer bismembercert) {
        this.bismembercert = bismembercert;//是否通过企业认证 int
    }

    /**
     * 企业编号 String
     */
    @Column(name = "smemberno", length = 50)
    public String getSmemberno() {
        return smemberno;//企业编号 String
    }

    /**
     * 企业编号 String
     */
    public void setSmemberno(String smemberno) {
        this.smemberno = smemberno;//企业编号 String
    }

    /**
     * 企业名称 String
     */
    @Column(name = "scnname", length = 100)
    public String getScnname() {
        return scnname;//企业名称 String
    }

    /**
     * 企业名称 String
     */
    public void setScnname(String scnname) {
        this.scnname = scnname;//企业名称 String
    }

    /**
     * 英文名称 String
     */
    @Column(name = "senname", length = 50)
    public String getSenname() {
        return senname;//英文名称 String
    }

    /**
     * 英文名称 String
     */
    public void setSenname(String senname) {
        this.senname = senname;//英文名称 String
    }

    /**
     * 中文简称 String
     */
    @Column(name = "sshortname", length = 50)
    public String getSshortname() {
        return sshortname;//中文简称 String
    }

    /**
     * 中文简称 String
     */
    public void setSshortname(String sshortname) {
        this.sshortname = sshortname;//中文简称 String
    }

    /**
     * 信用值 long
     */
    @Column(name = "icredit")
    public Long getIcredit() {
        return icredit;//信用值 long
    }

    /**
     * 信用值 long
     */
    public void setIcredit(Long icredit) {
        this.icredit = icredit;//信用值 long
    }

    /**
     * 会员类型 int
     * MemberType:
     * 0:EXCHANGE:交易中心
     * 1:MEMBER:交易会员
     * 3:BANK:资方
     * 8:CHARGE:代理公司
     */
    @Column(name = "imembertype")
    public Integer getImembertype() {
        return imembertype;//会员类型 int
    }

    /**
     * 会员类型 int
     * MemberType:
     * 0:EXCHANGE:交易中心
     * 1:MEMBER:交易会员
     * 3:BANK:资方
     * 8:CHARGE:代理公司
     */
    public void setImembertype(Integer imembertype) {
        this.imembertype = imembertype;//会员类型 int
    }

    /**
     * 经营模式 String
     */
    @Column(name = "sbusinessmode", length = 50)
    public String getSbusinessmode() {
        return sbusinessmode;//经营模式 String
    }

    /**
     * 经营模式 String
     */
    public void setSbusinessmode(String sbusinessmode) {
        this.sbusinessmode = sbusinessmode;//经营模式 String
    }

    /**
     * 企业性质 String
     */
    @Column(name = "smemberkind", length = 50)
    public String getSmemberkind() {
        return smemberkind;//企业性质 String
    }

    /**
     * 企业性质 String
     */
    public void setSmemberkind(String smemberkind) {
        this.smemberkind = smemberkind;//企业性质 String
    }

    /**
     * 工商执照号 String
     */
    @Column(name = "sbusinessno", length = 50)
    public String getSbusinessno() {
        return sbusinessno;//工商执照号 String
    }

    /**
     * 工商执照号 String
     */
    public void setSbusinessno(String sbusinessno) {
        this.sbusinessno = sbusinessno;//工商执照号 String
    }

    /**
     * 组织机构代码 String
     */
    @Column(name = "sorgcode", length = 50)
    public String getSorgcode() {
        return sorgcode;//组织机构代码 String
    }

    /**
     * 组织机构代码 String
     */
    public void setSorgcode(String sorgcode) {
        this.sorgcode = sorgcode;//组织机构代码 String
    }

    /**
     * 法定代表人身份证 String
     */
    @Column(name = "slegalpersoncode", length = 50)
    public String getSlegalpersoncode() {
        return slegalpersoncode;//法定代表人身份证 String
    }

    /**
     * 法定代表人身份证 String
     */
    public void setSlegalpersoncode(String slegalpersoncode) {
        this.slegalpersoncode = slegalpersoncode;//法定代表人身份证 String
    }

    /**
     * 税务登记号 String
     */
    @Column(name = "staxno", length = 50)
    public String getStaxno() {
        return staxno;//税务登记号 String
    }

    /**
     * 税务登记号 String
     */
    public void setStaxno(String staxno) {
        this.staxno = staxno;//税务登记号 String
    }

    /**
     * 法人 String
     */
    @Column(name = "slegalperson", length = 50)
    public String getSlegalperson() {
        return slegalperson;//法人 String
    }

    /**
     * 法人 String
     */
    public void setSlegalperson(String slegalperson) {
        this.slegalperson = slegalperson;//法人 String
    }

    /**
     * 地区区号 String
     */
    @Column(name = "sareaid", length = 30)
    public String getSareaid() {
        return sareaid;//地区区号 String
    }

    /**
     * 地区区号 String
     */
    public void setSareaid(String sareaid) {
        this.sareaid = sareaid;//地区区号 String
    }

    /**
     * 省份 String
     */
    @Column(name = "sprovince", length = 50)
    public String getSprovince() {
        return sprovince;//省份 String
    }

    /**
     * 省份 String
     */
    public void setSprovince(String sprovince) {
        this.sprovince = sprovince;//省份 String
    }

    /**
     * 城市 String
     */
    @Column(name = "scity", length = 50)
    public String getScity() {
        return scity;//城市 String
    }

    /**
     * 城市 String
     */
    public void setScity(String scity) {
        this.scity = scity;//城市 String
    }

    /**
     * 区县 String
     */
    @Column(name = "sregion", length = 50)
    public String getSregion() {
        return sregion;//区县 String
    }

    /**
     * 区县 String
     */
    public void setSregion(String sregion) {
        this.sregion = sregion;//区县 String
    }

    /**
     * 注册资金货币种类 String
     */
    @Column(name = "sregmoneytype", length = 50)
    public String getSregmoneytype() {
        return sregmoneytype;//注册资金货币种类 String
    }

    /**
     * 注册资金货币种类 String
     */
    public void setSregmoneytype(String sregmoneytype) {
        this.sregmoneytype = sregmoneytype;//注册资金货币种类 String
    }

    /**
     * 注册资金 long
     */
    @Column(name = "iregmoney")
    public Long getIregmoney() {
        return iregmoney;//注册资金 long
    }

    /**
     * 注册资金 long
     */
    public void setIregmoney(Long iregmoney) {
        this.iregmoney = iregmoney;//注册资金 long
    }

    /**
     * 开户银行 String
     */
    @Column(name = "sopenbank", length = 50)
    public String getSopenbank() {
        return sopenbank;//开户银行 String
    }

    /**
     * 开户银行 String
     */
    public void setSopenbank(String sopenbank) {
        this.sopenbank = sopenbank;//开户银行 String
    }

    /**
     * 开户名称 String
     */
    @Column(name = "sopenname", length = 50)
    public String getSopenname() {
        return sopenname;//开户名称 String
    }

    /**
     * 开户名称 String
     */
    public void setSopenname(String sopenname) {
        this.sopenname = sopenname;//开户名称 String
    }

    /**
     * 开户账号 String
     */
    @Column(name = "sopenaccount", length = 50)
    public String getSopenaccount() {
        return sopenaccount;//开户账号 String
    }

    /**
     * 开户账号 String
     */
    public void setSopenaccount(String sopenaccount) {
        this.sopenaccount = sopenaccount;//开户账号 String
    }

    /**
     * 结算银行 String
     */
    @Column(name = "sbalancebank", length = 50)
    public String getSbalancebank() {
        return sbalancebank;//结算银行 String
    }

    /**
     * 结算银行 String
     */
    public void setSbalancebank(String sbalancebank) {
        this.sbalancebank = sbalancebank;//结算银行 String
    }

    /**
     * 结算户名 String
     */
    @Column(name = "sbalancename", length = 50)
    public String getSbalancename() {
        return sbalancename;//结算户名 String
    }

    /**
     * 结算户名 String
     */
    public void setSbalancename(String sbalancename) {
        this.sbalancename = sbalancename;//结算户名 String
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
     * 结算行帐号 String
     */
    @Column(name = "sbalanceaccount", length = 50)
    public String getSbalanceaccount() {
        return sbalanceaccount;//结算行帐号 String
    }

    /**
     * 结算行帐号 String
     */
    public void setSbalanceaccount(String sbalanceaccount) {
        this.sbalanceaccount = sbalanceaccount;//结算行帐号 String
    }

    /**
     * 是否使用CA int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bcaflag")
    public Integer getBcaflag() {
        return bcaflag;//是否使用CA int
    }

    /**
     * 是否使用CA int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBcaflag(Integer bcaflag) {
        this.bcaflag = bcaflag;//是否使用CA int
    }

    /**
     * 主营行业大类 String
     */
    @Column(name = "sbusbigtype", length = 500)
    public String getSbusbigtype() {
        return sbusbigtype;//主营行业大类 String
    }

    /**
     * 主营行业大类 String
     */
    public void setSbusbigtype(String sbusbigtype) {
        this.sbusbigtype = sbusbigtype;//主营行业大类 String
    }

    /**
     * 主营行业小类 String
     */
    @Column(name = "sbussmalltype", length = 2000)
    public String getSbussmalltype() {
        return sbussmalltype;//主营行业小类 String
    }

    /**
     * 主营行业小类 String
     */
    public void setSbussmalltype(String sbussmalltype) {
        this.sbussmalltype = sbussmalltype;//主营行业小类 String
    }

    /**
     * 主营小类名称 String
     */
    @Column(name = "sbussmallname", length = 2000)
    public String getSbussmallname() {
        return sbussmallname;//主营小类名称 String
    }

    /**
     * 主营小类名称 String
     */
    public void setSbussmallname(String sbussmallname) {
        this.sbussmallname = sbussmallname;//主营小类名称 String
    }

    /**
     * 注册地址 String
     */
    @Column(name = "sregaddress", length = 300)
    public String getSregaddress() {
        return sregaddress;//注册地址 String
    }

    /**
     * 注册地址 String
     */
    public void setSregaddress(String sregaddress) {
        this.sregaddress = sregaddress;//注册地址 String
    }

    /**
     * 经营地址 String
     */
    @Column(name = "sbusaddress", length = 200)
    public String getSbusaddress() {
        return sbusaddress;//经营地址 String
    }

    /**
     * 经营地址 String
     */
    public void setSbusaddress(String sbusaddress) {
        this.sbusaddress = sbusaddress;//经营地址 String
    }

    /**
     * 联系人 String
     */
    @Column(name = "slinkman", length = 100)
    public String getSlinkman() {
        return slinkman;//联系人 String
    }

    /**
     * 联系人 String
     */
    public void setSlinkman(String slinkman) {
        this.slinkman = slinkman;//联系人 String
    }

    /**
     * 邮编 String
     */
    @Column(name = "szipcode", length = 10)
    public String getSzipcode() {
        return szipcode;//邮编 String
    }

    /**
     * 邮编 String
     */
    public void setSzipcode(String szipcode) {
        this.szipcode = szipcode;//邮编 String
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
     * 公司简介 String
     */
    @Column(name = "scompanydesc", length = 4000)
    public String getScompanydesc() {
        return scompanydesc;//公司简介 String
    }

    /**
     * 公司简介 String
     */
    public void setScompanydesc(String scompanydesc) {
        this.scompanydesc = scompanydesc;//公司简介 String
    }

    /**
     * 有效期 Date
     */
    @Column(name = "dvaliddate")
    public Date getDvaliddate() {
        return dvaliddate;//有效期 Date
    }

    /**
     * 有效期 Date
     */
    public void setDvaliddate(Date dvaliddate) {
        this.dvaliddate = dvaliddate;//有效期 Date
    }

    /**
     * 状态 int
     * MemberStatus:
     * 0:WAIT:待激活
     * 1:CHECK:待审核
     * 2: REJECT:被拒绝
     * 3 :NORMAL:正常
     * 4 :FLEEZE:冻结
     * 5:EDIT:待完善资料
     */
    @Column(name = "imemberstatus")
    public Integer getImemberstatus() {
        return imemberstatus;//状态 int
    }

    /**
     * 状态 int
     * MemberStatus:
     * 0:WAIT:待激活
     * 1:CHECK:待审核
     * 2: REJECT:被拒绝
     * 3 :NORMAL:正常
     * 4 :FLEEZE:冻结
     * 5:EDIT:待完善资料
     */
    public void setImemberstatus(Integer imemberstatus) {
        this.imemberstatus = imemberstatus;//状态 int
    }

    /**
     * 服务范围 int
     * ServiceArea:
     * 1:TRADE:交易:INIT
     */
    @Column(name = "iscope")
    public Integer getIscope() {
        return iscope;//服务范围 int
    }

    /**
     * 服务范围 int
     * ServiceArea:
     * 1:TRADE:交易:INIT
     */
    public void setIscope(Integer iscope) {
        this.iscope = iscope;//服务范围 int
    }

    /**
     * 申请日期 Date
     */
    @Column(name = "dapplydate")
    public Date getDapplydate() {
        return dapplydate;//申请日期 Date
    }

    /**
     * 申请日期 Date
     */
    public void setDapplydate(Date dapplydate) {
        this.dapplydate = dapplydate;//申请日期 Date
    }

    /**
     * 审核人 String
     */
    @Column(name = "scheckuserid", length = 32)
    public String getScheckuserid() {
        return scheckuserid;//审核人 String
    }

    /**
     * 审核人 String
     */
    public void setScheckuserid(String scheckuserid) {
        this.scheckuserid = scheckuserid;//审核人 String
    }

    /**
     * 审核日期 Date
     */
    @Column(name = "dcheckdate")
    public Date getDcheckdate() {
        return dcheckdate;//审核日期 Date
    }

    /**
     * 审核日期 Date
     */
    public void setDcheckdate(Date dcheckdate) {
        this.dcheckdate = dcheckdate;//审核日期 Date
    }

    /**
     * 审核意见 String
     */
    @Column(name = "scheckinfo", length = 2000)
    public String getScheckinfo() {
        return scheckinfo;//审核意见 String
    }

    /**
     * 审核意见 String
     */
    public void setScheckinfo(String scheckinfo) {
        this.scheckinfo = scheckinfo;//审核意见 String
    }

    /**
     * 备注 String
     */
    @Column(name = "sremark", length = 2000)
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
     * 是否删除 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bdelete")
    public Integer getBdelete() {
        return bdelete;//是否删除 int
    }

    /**
     * 是否删除 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBdelete(Integer bdelete) {
        this.bdelete = bdelete;//是否删除 int
    }

    /**
     * 开票电话 String
     */
    @Column(name = "sinvoicephone", length = 20)
    public String getSinvoicephone() {
        return sinvoicephone;//开票电话 String
    }

    /**
     * 开票电话 String
     */
    public void setSinvoicephone(String sinvoicephone) {
        this.sinvoicephone = sinvoicephone;//开票电话 String
    }

    /**
     * 开票地址 String
     */
    @Column(name = "sinvoiceaddress", length = 200)
    public String getSinvoiceaddress() {
        return sinvoiceaddress;//开票地址 String
    }

    /**
     * 开票地址 String
     */
    public void setSinvoiceaddress(String sinvoiceaddress) {
        this.sinvoiceaddress = sinvoiceaddress;//开票地址 String
    }

    /**
     * 店铺banner String
     */
    @Column(name = "sbanner", length = 300)
    public String getSbanner() {
        return sbanner;//店铺banner String
    }

    /**
     * 店铺banner String
     */
    public void setSbanner(String sbanner) {
        this.sbanner = sbanner;//店铺banner String
    }

    /**
     * 会员LOGO String
     */
    @Column(name = "slogo", length = 300)
    public String getSlogo() {
        return slogo;//会员LOGO String
    }

    /**
     * 会员LOGO String
     */
    public void setSlogo(String slogo) {
        this.slogo = slogo;//会员LOGO String
    }

    /**
     * 简称简拼名 String
     */
    @Column(name = "sshortnamejpname", length = 50)
    public String getSshortnamejpname() {
        return sshortnamejpname;//简称简拼名 String
    }

    /**
     * 简称简拼名 String
     */
    public void setSshortnamejpname(String sshortnamejpname) {
        this.sshortnamejpname = sshortnamejpname;//简称简拼名 String
    }

    /**
     * 简称全拼名 String
     */
    @Column(name = "sshortnamepyname", length = 100)
    public String getSshortnamepyname() {
        return sshortnamepyname;//简称全拼名 String
    }

    /**
     * 简称全拼名 String
     */
    public void setSshortnamepyname(String sshortnamepyname) {
        this.sshortnamepyname = sshortnamepyname;//简称全拼名 String
    }

    /**
     * 简拼名 String
     */
    @Column(name = "sjpname", length = 50)
    public String getSjpname() {
        return sjpname;//简拼名 String
    }

    /**
     * 简拼名 String
     */
    public void setSjpname(String sjpname) {
        this.sjpname = sjpname;//简拼名 String
    }

    /**
     * 全拼名 String
     */
    @Column(name = "spyname", length = 100)
    public String getSpyname() {
        return spyname;//全拼名 String
    }

    /**
     * 全拼名 String
     */
    public void setSpyname(String spyname) {
        this.spyname = spyname;//全拼名 String
    }

    /**
     * 认证类型 int
     * AuthenticateType:
     * 0:No:注册会员
     * 10:PERSONAL:个人认证
     * 20:Company:企业认证
     */
    @Column(name = "iauthtype")
    public Integer getIauthtype() {
        return iauthtype;//认证类型 int
    }

    /**
     * 认证类型 int
     * AuthenticateType:
     * 0:No:注册会员
     * 10:PERSONAL:个人认证
     * 20:Company:企业认证
     */
    public void setIauthtype(Integer iauthtype) {
        this.iauthtype = iauthtype;//认证类型 int
    }

    /**
     * 排序号 long
     */
    @Column(name = "isort")
    public Long getIsort() {
        return isort;//排序号 long
    }

    /**
     * 排序号 long
     */
    public void setIsort(Long isort) {
        this.isort = isort;//排序号 long
    }

    /**
     * 地理位置 String
     */
    @Column(name = "slocation", length = 300)
    public String getSlocation() {
        return slocation;//地理位置 String
    }

    /**
     * 地理位置 String
     */
    public void setSlocation(String slocation) {
        this.slocation = slocation;//地理位置 String
    }

    /**
     * 是否营业 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisstop")
    public Integer getBisstop() {
        return bisstop;//是否营业 int
    }

    /**
     * 是否营业 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisstop(Integer bisstop) {
        this.bisstop = bisstop;//是否营业 int
    }

    /**
     * 是否自营 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "bisselfsaler")
    public Integer getBisselfsaler() {
        return bisselfsaler;//是否自营 int
    }

    /**
     * 是否自营 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBisselfsaler(Integer bisselfsaler) {
        this.bisselfsaler = bisselfsaler;//是否自营 int
    }

    /**
     * 是否三码合一 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    @Column(name = "biscardmerged")
    public Integer getBiscardmerged() {
        return biscardmerged;//是否三码合一 int
    }

    /**
     * 是否三码合一 int
     * BoolType:
     * 0:NO:否
     * 1:YES:是
     */
    public void setBiscardmerged(Integer biscardmerged) {
        this.biscardmerged = biscardmerged;//是否三码合一 int
    }

    /**
     * 统一社会信息用代码 String
     */
    @Column(name = "ssocialcreditno", length = 50)
    public String getSsocialcreditno() {
        return ssocialcreditno;//统一社会信息用代码 String
    }

    /**
     * 统一社会信息用代码 String
     */
    public void setSsocialcreditno(String ssocialcreditno) {
        this.ssocialcreditno = ssocialcreditno;//统一社会信息用代码 String
    }

}
