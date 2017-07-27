package com.ampm365.test.serverapi.member;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.testng.annotations.Test;

import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.enumerations.Enumerations.RequestDomain;
import com.ampm365.test.serverapi.enumerations.Enumerations.GetMemberInfo;
import com.ampm365.test.serverapi.member.parameter.GetInfoTestParameter;

public class GetInfoByAccountTest extends ServerApiTest{
	private Log4jImpl logger = new Log4jImpl(GetInfoByAccountTest.class.getName());
	private GetInfoTestParameter getInfoTestParameter;
	@Test
	public void GetMemberInfo() throws ClientProtocolException, IOException {
		getInfoTestParameter = new GetInfoTestParameter();
		logger.debug("NormalMemberRegTest Parameter is :" + getInfoTestParameter.toParameterString(GetMemberInfo.INFO,"13699996666"));
		generateRequestUrl(RequestDomain.member, getInfoTestParameter.toParameterString(GetMemberInfo.INFO,"13699996666"));
		sendGetRequest();
	}
	@Test
	public void GetLvInfo() throws ClientProtocolException, IOException {
		getInfoTestParameter = new GetInfoTestParameter();
		logger.debug("NormalMemberRegTest Parameter is :" + getInfoTestParameter.toParameterString(GetMemberInfo.LvINFO,"13699996666"));
		generateRequestUrl(RequestDomain.member, getInfoTestParameter.toParameterString(GetMemberInfo.LvINFO,"13699996666"));
		sendGetRequest();
	}
	@Test
	public void GetGrowthValInfo() throws ClientProtocolException, IOException {
		getInfoTestParameter = new GetInfoTestParameter();
		logger.debug("NormalMemberRegTest Parameter is :" + getInfoTestParameter.toParameterString(GetMemberInfo.GrowthVal,"13699996666"));
		generateRequestUrl(RequestDomain.member, getInfoTestParameter.toParameterString(GetMemberInfo.GrowthVal,"13699996666"));
		sendGetRequest();
	}
}
