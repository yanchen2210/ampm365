package com.ampm365.test.serverapi.member;

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
//	boolean isAuto = false;
	private MemberRegTestParameter memberRegTestParameter;
	private MemberRegTestParameterParser memberRegTestParameterParser = new MemberRegTestParameterParser();
	
	@Test
	public void NormalMemberRegTest() throws Exception {

		memberRegTestParameter = memberRegTestParameterParser.parser(ParameterType.VALID, false);
		Assert.assertNotNull(memberRegTestParameter, "memberRegTestParameter is NULL");
		logger.debug("NormalMemberRegTest Parameter is :" + memberRegTestParameter.toString());
		generateRequestUrl(RequestDomain.member, memberRegTestParameter.toParameterString());
//		sendPostRequest(getHttpEntityFromParameter(memberRegTestParameter));

  }

	
}