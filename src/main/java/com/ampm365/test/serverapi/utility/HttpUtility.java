package com.ampm365.test.serverapi.utility;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.ibatis.logging.log4j.Log4jImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpUtility {
    public Log4jImpl logger = new Log4jImpl(HttpUtility.class.getName());

    public static HttpPost SetPostRequestHeadersByJsonString(HttpPost Request, String HeaderjsonString){
        Map<String, String> headerMap = (Map)JSON.parse(HeaderjsonString);
        SetPostRequestHeaderByMap(Request,headerMap);
        return Request;
    }

    public static HttpPost SetPostRequestHeaderByMap(HttpPost Request, Map<String, String> headerMap){
        for (Map.Entry<String, String> item : headerMap.entrySet()){
            Request.addHeader(item.getKey(), item.getValue());
        }
        return Request;
    }

    public static HttpPost SetPostRequestHeader(HttpPost Request, String HeaderName, String Value){
        Request.setHeader(HeaderName,Value);
        return Request;
    }

    public static HttpGet SetGetRequestHeadersByJsonString(HttpGet Request, String HeaderjsonString){
        Map<String, String> headerMap = (Map)JSON.parse(HeaderjsonString);
        SetGetRequestHeaderByMap(Request,headerMap);
        return Request;
    }

    public static HttpGet SetGetRequestHeaderByMap(HttpGet Request, Map<String, String> headerMap){
        for (Map.Entry<String, String> item : headerMap.entrySet()){
            Request.addHeader(item.getKey(), item.getValue());
        }
        return Request;
    }

    public static HttpGet SetGetRequestHeader(HttpGet Request, String HeaderName, String Value){
        Request.setHeader(HeaderName,Value);
        return Request;
    }

//    String jsonString = "{\n" + "\"platform\": \"1\",\n" + "\"device\": \"MEIZU-MX3\",\n" + "\"networkType\": \"4G\",\n" + "\"smartLoading\": \"1\",\n" + "\"screen\": \"1920*1080\",\n" + "\"uuid\": \"sadfsadfasdf\",\n" + "\"currentTime\": \"12345\",\n" + "\"installTime\": \"12345\",\n" + "\"channelId\": \"appstore\",\n" + "\"version\": \"1.0.0\",\n" + "\"apiVersion\": \"1.0.0\",\n" + "\"storeId\": \"10001000100\",\n" + "\"vendorId\": \"10001\"\n" + "}";
//    Map<String, String> jsonMap = (Map) JSON.parse(jsonString);
////	  logger.debug(jsonMap.toString());
//          for (Map.Entry<String, String> item : jsonMap.entrySet()) {
//        postRequest.addHeader(item.getKey(), item.getValue());
//    }
//    List<NameValuePair> list = new ArrayList<NameValuePair>();
//          list.add(new BasicNameValuePair("phoneNumber", TestDataGenerator.generatorMobile()));
//          list.add(new BasicNameValuePair("phoneCode", "123456"));
//          list.add(new BasicNameValuePair("password", "123456"));
//    UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
//          postRequest.setEntity(uefEntity);


}
