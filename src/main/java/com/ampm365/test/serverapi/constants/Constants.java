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
	//测试环境URL
	private static final String BaseUrl = "/api/";

	//会员相关的URL
	public static final String VendorInfo = BaseUrl + "api/vendor/info?";
	public static final String UserInfo = BaseUrl + "user/info?";
	public static final String UserLevel = BaseUrl + "user/level?";
	public static final String TradePush = BaseUrl + "user/trade/push?";
	public static final String TradeReverse = BaseUrl + "user/trade/reverse?";
	public static final String ScorePay = BaseUrl + "user/score/pay?";
	public static final String ScoreCancle = BaseUrl + "user/score/cancel?";
	public static final String ScoreRefund = BaseUrl + "user/score/refund?";
	public static final String ScorePaymentQuery = BaseUrl + "user/score/payment/query?";
	public static final String ScoreRatio = BaseUrl + "user/score/ratio?";

	//登录注册
	public static final String CheckPhoneExist = BaseUrl + "checkPhoneExist?";
    public static final String Register = BaseUrl + "register?";
    public static final String GetVerificationCode = BaseUrl + "getVerificationCode?";
    public static final String Login = BaseUrl + "login?";
    public static final String Logout = BaseUrl + "logout?";
    public static final String ForgotPassword = BaseUrl + "forgotPassword?";
    public static final String SetPassword = BaseUrl + "setPassword?";
    public static final String QuickLogin = BaseUrl + "quickLogin?";

}
