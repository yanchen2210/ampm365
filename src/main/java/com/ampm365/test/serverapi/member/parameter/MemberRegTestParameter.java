package com.ampm365.test.serverapi.member.parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.ampm365.test.serverapi.constants.Constants;

public class MemberRegTestParameter extends TestParameter{
	
	String parameter;
	HttpEntity toParameterEntity;
	public MemberRegTestParameter(TestParameter testparameter){
		super(testparameter);
	}
	
	public MemberRegTestParameter() {
		// TODO Auto-generated constructor stub
		
	}
	public String toString(){
		parameter = "loginPwd=" + getLoginPwd() + ";mobile=" + getMobile() +  
				 ";promoterId=" + getPromoterId() + ";pubPltmId=" + getPubPltmId() + 
				 ";regchanlCde=" + getChanlCde();
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
	
	public HttpEntity toParameterEntity(Map<String, String> parameterMap){
		  List<NameValuePair> list = new ArrayList<NameValuePair>();
//		  Map<String, String> map = new HashMap<String, String>();
		  for(Entry<String, String> item : parameterMap.entrySet()){
			  list.add(new BasicNameValuePair(item.getKey(),item.getValue()));
		  }
		return toParameterEntity;
	}
}
