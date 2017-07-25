package com.ampm365.test.serverapi.base;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.ibatis.logging.log4j.Log4jImpl;

import com.ampm365.test.serverapi.entity.TestProperties;
import com.ampm365.test.serverapi.utility.PropertyHandler;
import com.ampm365.test.serverapi.constants.Constants;
import com.ampm365.test.serverapi.enumerations.Enumerations.*;

public class ServerApiTest {
	
	private static TestProperties testProperties = PropertyHandler.getProperties();
	private static String cookie;
	
	public Log4jImpl logger = new Log4jImpl(ServerApiTest.class.getName());
	public final Environment environment = testProperties.getEnvironment();
	public static String requesturl;
	public CloseableHttpResponse response;
	
	public CloseableHttpClient httpClient = HttpClients.createDefault();
	
	public void sendGetRequest() throws ClientProtocolException, IOException{
		if (httpClient !=null){
			HttpGet getRequest = new HttpGet(requesturl);
			if (getRequest != null){
				response = httpClient.execute(getRequest);
			}
		}
		response.close();
	}
	
	public void sendPostRequest(HttpEntity httpEntity) throws ClientProtocolException, IOException{
		sendPostRequest(httpEntity, cookie);
	}
	
	public void sendPostRequest(HttpEntity httpEntity,String cookie) throws ClientProtocolException, IOException{
		if(httpClient != null){
			HttpPost postRequest = new HttpPost(requesturl);
			if(cookie != null){
				postRequest.setHeader("Cookie", cookie);
			}
			if(postRequest != null){
				postRequest.setEntity(httpEntity);
				response = httpClient.execute(postRequest);
			}
		}
	}
	
	private void printRequestURL(){
		logger.debug("Request URL is :"+  requesturl);
	}
	
	public static String generateRequestUrl(RequestDomain requestDomain){
		String domain;
		switch (requestDomain){
		case member:
			domain = testProperties.getMember_hostname() + ":" + testProperties.getMember_port();
			break;
		case weixin:
			domain = testProperties.getWeixin_hostName() + ":" + testProperties.getWeixin_port();
			break;
		default:
			domain = "";
			break;
		}	
		return Constants.HTTPPRIFIX + domain;		
	}
	
	public void generateRequestUrl(RequestDomain requestDomain,String parameterString){
		requesturl = generateRequestUrl(requestDomain) + parameterString;
		printRequestURL();
	}
}
