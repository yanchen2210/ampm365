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
	private static final String MemberBaseUrl = "/api/";
	public static final String VendorInfo = MemberBaseUrl + "api/vendor/info?";
	public static final String UserInfo = MemberBaseUrl + "user/info?";
	public static final String UserLevel = MemberBaseUrl + "user/level?";
	public static final String TradePush = MemberBaseUrl + "user/trade/push?";
	public static final String TradeReverse = MemberBaseUrl + "user/trade/reverse?";
	public static final String ScorePay = MemberBaseUrl + "user/score/pay?";
	public static final String ScoreCancle = MemberBaseUrl + "user/score/cancel?";
	public static final String ScoreRefund = MemberBaseUrl + "user/score/refund?";
	public static final String ScorePaymentQuery = MemberBaseUrl + "user/score/payment/query?";
	public static final String ScoreRatio = MemberBaseUrl + "user/score/ratio?";
}
