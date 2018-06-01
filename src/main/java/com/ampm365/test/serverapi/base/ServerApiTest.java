package com.ampm365.test.serverapi.base;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import com.ampm365.test.serverapi.utility.HttpUtility;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
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
	public final Environment environment = testProperties.getEnvironment();

	public Log4jImpl logger = new Log4jImpl(ServerApiTest.class.getName());
	public static String requesturl;
	public CloseableHttpResponse response;
	public HttpEntity Entity;

	public CloseableHttpClient httpClient = HttpClients.createDefault();

	public void sendGetRequest() throws ClientProtocolException, IOException {
		if (httpClient != null) {
			HttpGet getRequest = new HttpGet(requesturl);
			if (getRequest != null) {
				response = httpClient.execute(getRequest);
			}
		}
		response.close();
	}

	public void sendPostRequest(HttpEntity httpEntity) throws ClientProtocolException, IOException {
		sendPostRequest(httpEntity, cookie);
	}

	public void sendPostRequest(HttpEntity httpEntity, String cookie) throws ClientProtocolException, IOException {
		if (httpClient != null) {
			HttpPost postRequest = new HttpPost(requesturl);
			if (cookie != null) {
				postRequest.setHeader("Cookie", cookie);
			}
			if (postRequest != null) {
				postRequest.setEntity(httpEntity);
				response = httpClient.execute(postRequest);
			}
		}
		response.close();
	}

	public void sendPostRequest(String requesturl ,List paramterList, Map headers) throws IOException {
		if(httpClient != null){
			HttpPost postRequest = new HttpPost(requesturl);
			if(headers != null){
				HttpUtility.SetPostRequestHeaderByMap(postRequest,headers);
			}
			if(paramterList != null){
				UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(paramterList, "UTF-8");
				postRequest.setEntity(uefEntity);
			}
			response = httpClient.execute(postRequest);
		}
		response.close();
	}

	private void printRequestURL() {
		logger.debug("Request URL is :" + requesturl);
	}


	public static String generateRequestUrl(RequestDomain requestDomain) {
		String domain;
		switch (requestDomain) {
			case ourHours30:
				domain = testProperties.getOurHours30_url() + ":" + testProperties.getOurHours30_port();
				break;
			default:
				domain = "";
				break;
		}
		return Constants.HTTPPRIFIX + domain;
	}

	/**
	 * Generate request url
	 * @param requestDomain
	 * @param parameterString
	 */
	public void generateRequestUrl(RequestDomain requestDomain,String parameterString){
		requesturl = generateRequestUrl(requestDomain) + parameterString;
		printRequestURL();
	}
	
	public HttpEntity generatePostEntity(){
		return Entity;
	}
}
