package com.ampm365.test.serverapi.constants;

public class Constants {
	public static final String HTTPPRIFIX = "http://";
	
	
	//SQL Mapper
	//Mapper文件的根路径
	private static final String BaseMapper = "DatabaseMapper.";
	//会员系统的Mapper
	private static final String mmb_infoMapper = BaseMapper + "mmb_info.";
	public static final String GET_USER_INFO_BY_MOBILE = mmb_infoMapper + "getMemberInfoByMobile";
	public static final String GET_USER_LVCHG_BY_MOBILE = mmb_infoMapper + "getMemberLvChangeByMobile";
	public static final String INSERT_NEW_MEMBER = mmb_infoMapper + "insertNewMember";
	
	//HTTP Request URL
	//会员相关的URL
	private static final String MemberBaseUrl = "mms-customer/";
	public static final String MemberReg = MemberBaseUrl + "member/register?";
	public static final String UpdateInfo = MemberBaseUrl + "member/update?";
	public static final String ChangeGrowthVal = MemberBaseUrl + "member/change?";
	public static final String FindMemberInfoByMobile = MemberBaseUrl + "member/{mobile}/1";
	public static final String FindMemberLvChangeByMobile = MemberBaseUrl + "member/{mobile}/2";
	public static final String FIndMemberGrowChangeByMobile = MemberBaseUrl + "member/{mobile}/3";
	public static final String MemberLogin = MemberBaseUrl + "account/login?";
	public static final String ModifyPwd = MemberBaseUrl + "account/update/1";
	public static final String ResetPwd = MemberBaseUrl + "account/update/2";
	public static final String SendCaptcha = MemberBaseUrl + "account/sendCaptcha?";
}
