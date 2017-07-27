package com.ampm365.test.serverapi.member;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.enumerations.Enumerations.ParameterType;
import com.ampm365.test.serverapi.enumerations.Enumerations.RequestDomain;
import com.ampm365.test.serverapi.member.parameter.MemberRegTestParameter;
import com.ampm365.test.serverapi.member.parameterparser.MemberRegTestParameterParser;

public class MemberRegTest extends ServerApiTest{

	private static Log4jImpl logger = new Log4jImpl(MemberRegTest.class.getName());
	boolean isAuto = false;
	private MemberRegTestParameter memberRegTestParameter;
	private MemberRegTestParameterParser memberRegTestParameterParser = new MemberRegTestParameterParser();
	
	@Test
	public void NormalMemberRegTest() throws Exception {

		memberRegTestParameter = memberRegTestParameterParser.parser(ParameterType.VALID, false);
		Assert.assertNotNull(memberRegTestParameter, "memberRegTestParameter is NULL");
		logger.debug("NormalMemberRegTest Parameter is :" + memberRegTestParameter.toString());
		generateRequestUrl(RequestDomain.member, memberRegTestParameter.toParameterString());
		sendPostRequest(getHttpEntityFromParamter(memberRegTestParameter));
	  
  }
	private HttpEntity getHttpEntityFromParamter(MemberRegTestParameter memberRegTestParameter) throws UnsupportedEncodingException{
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("mobile", memberRegTestParameter.getMobile()));
		list.add(new BasicNameValuePair("promotionCde", memberRegTestParameter.getPromotionCde()));
		list.add(new BasicNameValuePair("regChanlCde", memberRegTestParameter.getChanlCde()));
		UrlEncodedFormEntity Entity = new UrlEncodedFormEntity(list);
		return Entity;
		
	}
	
}
