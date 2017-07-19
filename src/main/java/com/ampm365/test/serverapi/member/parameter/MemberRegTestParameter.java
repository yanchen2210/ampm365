package com.ampm365.test.serverapi.member.parameter;

import com.ampm365.test.serverapi.constants.Constants;

public class MemberRegTestParameter extends TestParameter{
	
	String parameter;
	
	public MemberRegTestParameter(TestParameter testparameter){
		super(testparameter);
	}
	
	public MemberRegTestParameter() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString(){
		parameter = "loginPwd" + getLoginPwd() + ";mobile" + getMobile() +  
				 ";promoterId" + getPromoterId() + ";pubPltmId" + getPubPltmId() + 
				 ";regchanlCde" + getChanlCde();
		return parameter;
	}
	
	public String toParameterString(){
		if(parameter != null && parameter != ""){
			parameter = Constants.MemberReg + parameter.replace(";", "&");
		}else{
			parameter = Constants.MemberReg + toString().replace(";", "&");
		}
		
		return parameter;
	}
}
