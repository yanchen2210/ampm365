package com.ampm365.test.serverapi.member.parameter;

import com.ampm365.test.serverapi.constants.Constants;

public class MemberRegTestParameter extends TestParameter{
	
	String parameter;
	
	public MemberRegTestParameter(TestParameter testparameter){
		super(testparameter);
	};
	@Override
	public String toString(){
		parameter = "idCard" + getIdCard() + ";loginPwd" + getLoginPwd() + ";mobile" + getMobile() + ";name" + getName() 
				+ ";promoterId" + getPromoterId() + ";pubPltmId" + getPubPltmId() + ";regchanlCde" + getChanlCde()
				+ ";regIp" + getRegIp() + ";salesSmsAcptIndc" + getSalesSmsAcptIndc() + ";sex" + getSex();
		return parameter;
	}
	
	public String toParameterString(){
		if(parameter != null && parameter != ""){
			parameter = Constants.MemberReg + parameter.replaceAll(";", "&");
		}else{
			parameter = Constants.MemberReg + toString().replaceAll(";", "&");
		}
		
		return parameter;
	}
}
