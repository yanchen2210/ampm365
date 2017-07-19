package com.ampm365.test.serverapi.member.parameter;

import com.ampm365.test.serverapi.enumerations.Enumerations.IdCard;
import com.ampm365.test.serverapi.utility.TestDataGenerator;

public class TestParameter {
	
	
	/**
	 * Constructor 
	 * @param TestParameter 
	 */
	public TestParameter(TestParameter testparameter){
		this.idCard = testparameter.idCard;
		this.loginPwd = testparameter.loginPwd;
		this.mobile = testparameter.mobile;
		this.name = testparameter.name;
		this.promoterId = testparameter.promoterId;
		this.promotionCde = testparameter.promotionCde;
		this.pubPltmId = testparameter.pubPltmId;
		this.chanlCde = testparameter.chanlCde;
		this.regIp = testparameter.regIp;
		this.salesSmsAcptIndc = testparameter.salesSmsAcptIndc;
		this.sex = testparameter.sex;
		this.bizCde = testparameter.bizCde;
	}
	/**
	 * Default Constructor
	 * All Parameter Is Invalid
	 */
	public TestParameter(){
		this.idCard = TestDataGenerator.generatorIdCard(IdCard.INVALID);
		this.loginPwd = "";
		this.mobile = TestDataGenerator.generatorMobile();
		this.name = "Tester";
		this.promoterId = "10000";
		this.promotionCde = "";
		this.pubPltmId = "pubPltmId";
		this.chanlCde = "Chanl002";
		this.regIp = "127.0.0.1";
		this.salesSmsAcptIndc = "1";
		this.sex ="1";
	}
	
	public String toString(){
		parameter = "idCard" + idCard + ";loginPwd" + loginPwd + ";mobile" + mobile + ";name" + name 
				+ ";promoterId" + promoterId + ";pubPltmId" + pubPltmId + ";regchanlCde" + chanlCde
				+ ";regIp" + regIp + ";salesSmsAcptIndc" + salesSmsAcptIndc + ";sex" + sex;
		return parameter;
	}
	
	public String toParameterString(String parameter){
		if (parameter != null && parameter != ""){
			parameter.replace(";", "&");
		}else{
			toString().replace(";", "&");
		}
		return parameter;
	}
	
	private String parameter;
	private String idCard;//身份证号 
	private String loginPwd;//登录密码 必填 ;在登录接口中，密码登录时值为：登陆密码 短信登录时值为： 短信验证码 , 密码登录时，密码要RSA加密 然后base64传后台
	private String mobile;//手机号 
	private String name;//姓名 
	private String promoterId;//推广ID 
	private String promotionCde;//推广方式 
	private String pubPltmId;//公众平台ID 
	private String chanlCde;//会员渠道  必填,请求参数名为regchanlCde
	private String regIp;//注册IP 选填
	private String salesSmsAcptIndc;//是否接受促销短信 	
	private String sex;//性别  
	private String loginIp; //登录IP
	private String loginModeCde;//必填项：1:密码 2:短信快捷 3:微信 目前只支持 密码和快捷登录
	private String tmnlAppVerson;//终端App版本
	private String tmnlNbr;//终端号
	private String tmnlTypeCde;//终端类型代码
	private String cmnuPayMode;//常用支付方式 
	private String cmnuStore;//常用门店  
	private String id;//会员信息标识 必填
	private String newLoginPwd;//新密码 先RSA加密，然后Base64编码 再传给后台
	private String oldLoginPwd;//新密码 先RSA加密，然后Base64编码 再传给后台
	private String bizCde;//业务单号:订单号/退单号
	private String chgGrowthVal;//实际变更值,整数，正数代表发放，负数代表扣减
	private String chgResn;//变更原因,购物/会员保级，会员渠道自己填写原因
	private String remarks;//描述,备注信息
	private String captcha;//手机验证码
	
	
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getChanlCde() {
		return chanlCde;
	}
	public void setChanlCde(String chanlCde) {
		this.chanlCde = chanlCde;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getLoginModeCde() {
		return loginModeCde;
	}
	public void setLoginModeCde(String loginModeCde) {
		this.loginModeCde = loginModeCde;
	}
	public String getTmnlAppVerson() {
		return tmnlAppVerson;
	}
	public void setTmnlAppVerson(String tmnlAppVerson) {
		this.tmnlAppVerson = tmnlAppVerson;
	}
	public String getTmnlNbr() {
		return tmnlNbr;
	}
	public void setTmnlNbr(String tmnlNbr) {
		this.tmnlNbr = tmnlNbr;
	}
	public String getTmnlTypeCde() {
		return tmnlTypeCde;
	}
	public void setTmnlTypeCde(String tmnlTypeCde) {
		this.tmnlTypeCde = tmnlTypeCde;
	}
	public String getCmnuPayMode() {
		return cmnuPayMode;
	}
	public void setCmnuPayMode(String cmnuPayMode) {
		this.cmnuPayMode = cmnuPayMode;
	}
	public String getCmnuStore() {
		return cmnuStore;
	}
	public void setCmnuStore(String cmnuStore) {
		this.cmnuStore = cmnuStore;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNewLoginPwd() {
		return newLoginPwd;
	}
	public void setNewLoginPwd(String newLoginPwd) {
		this.newLoginPwd = newLoginPwd;
	}
	public String getOldLoginPwd() {
		return oldLoginPwd;
	}
	public void setOldLoginPwd(String oldLoginPwd) {
		this.oldLoginPwd = oldLoginPwd;
	}
	public String getBizCde() {
		return bizCde;
	}
	public void setBizCde(String bizCde) {
		this.bizCde = bizCde;
	}
	public String getChgGrowthVal() {
		return chgGrowthVal;
	}
	public void setChgGrowthVal(String chgGrowthVal) {
		this.chgGrowthVal = chgGrowthVal;
	}
	public String getChgResn() {
		return chgResn;
	}
	public void setChgResn(String chgResn) {
		this.chgResn = chgResn;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPromoterId() {
		return promoterId;
	}
	public void setPromoterId(String promoterId) {
		this.promoterId = promoterId;
	}
	public String getPromotionCde() {
		return promotionCde;
	}
	public void setPromotionCde(String promotionCde) {
		this.promotionCde = promotionCde;
	}
	public String getPubPltmId() {
		return pubPltmId;
	}
	public void setPubPltmId(String pubPltmId) {
		this.pubPltmId = pubPltmId;
	}
	public String getRegIp() {
		return regIp;
	}
	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}
	public String getSalesSmsAcptIndc() {
		return salesSmsAcptIndc;
	}
	public void setSalesSmsAcptIndc(String salesSmsAcptIndc) {
		this.salesSmsAcptIndc = salesSmsAcptIndc;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
