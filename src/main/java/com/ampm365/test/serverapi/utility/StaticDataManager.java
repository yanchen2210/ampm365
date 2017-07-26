package com.ampm365.test.serverapi.utility;

public class StaticDataManager {
	private static String mobile;
	private static String loginPwd;
	private static String id;//会员信息标识 必填
	private static String newLoginPwd;//新密码 先RSA加密，然后Base64编码 再传给后台
	private static String oldLoginPwd;//新密码 先RSA加密，然后Base64编码 再传给后台
	private static String bizCde;//业务单号:订单号/退单号
	private static String chgGrowthVal;//实际变更值,整数，正数代表发放，负数代表扣减
	private static String chgResn;//变更原因,购物/会员保级，会员渠道自己填写原因
	private static String captcha;//手机验证码
	public static String getMobile() {
		return mobile;
	}
	public static void setMobile(String mobile) {
		StaticDataManager.mobile = mobile;
	}
	public static String getLoginPwd() {
		return loginPwd;
	}
	public static void setLoginPwd(String loginPwd) {
		StaticDataManager.loginPwd = loginPwd;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		StaticDataManager.id = id;
	}
	public static String getNewLoginPwd() {
		return newLoginPwd;
	}
	public static void setNewLoginPwd(String newLoginPwd) {
		StaticDataManager.newLoginPwd = newLoginPwd;
	}
	public static String getOldLoginPwd() {
		return oldLoginPwd;
	}
	public static void setOldLoginPwd(String oldLoginPwd) {
		StaticDataManager.oldLoginPwd = oldLoginPwd;
	}
	public static String getBizCde() {
		return bizCde;
	}
	public static void setBizCde(String bizCde) {
		StaticDataManager.bizCde = bizCde;
	}
	public static String getChgGrowthVal() {
		return chgGrowthVal;
	}
	public static void setChgGrowthVal(String chgGrowthVal) {
		StaticDataManager.chgGrowthVal = chgGrowthVal;
	}
	public static String getChgResn() {
		return chgResn;
	}
	public static void setChgResn(String chgResn) {
		StaticDataManager.chgResn = chgResn;
	}
	public static String getCaptcha() {
		return captcha;
	}
	public static void setCaptcha(String captcha) {
		StaticDataManager.captcha = captcha;
	}
	
}
