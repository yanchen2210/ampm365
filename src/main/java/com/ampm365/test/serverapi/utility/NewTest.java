package com.ampm365.test.serverapi.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.File;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.logging.log4j.Log4jImpl;

import org.testng.annotations.Test;

import com.ampm365.test.serverapi.base.ServerApiTest;

public class NewTest extends ServerApiTest {
    public Log4jImpl logger = new Log4jImpl(NewTest.class.getName());
  @Test
  public void f() throws Exception {
	  logger.debug("test start");
	  //请求的url
      String Login = "http://appapi.ohtest.quanshishequ.com/api/login";
	  String RegrequestUrl = "http://appapi.ohtest.quanshishequ.com/api/register";
	  String AddaddressrequestUrl = "http://appapi.ohtest.quanshishequ.com/api/address/add";
	  String AddresslistrequestUrl ="http://appapi.ohtest.quanshishequ.com/api/address/list";


	  //需要用到的变量
      String token = "";
      String UserId = "";
      String Phone = "";
      String AddressId = "";


      //调用用户注册接口
      for(int i = 0 ;i < 500;i++) {
          //写入的文件
          File WriteFile = new File("D:\\output.txt");
          WriteFile.createNewFile();
          BufferedWriter file = new BufferedWriter(new FileWriter(WriteFile,true));

          CloseableHttpClient httpClient = HttpClients.createDefault();
          HttpPost postRequest = new HttpPost(RegrequestUrl);
          String jsonString = "{\n" + "\"platform\": \"1\",\n" + "\"device\": \"MEIZU-MX3\",\n" + "\"networkType\": \"4G\",\n" + "\"smartLoading\": \"1\",\n" + "\"screen\": \"1920*1080\",\n" + "\"uuid\": \"sadfsadfasdf\",\n" + "\"currentTime\": \"12345\",\n" + "\"installTime\": \"12345\",\n" + "\"channelId\": \"appstore\",\n" + "\"version\": \"1.0.0\",\n" + "\"apiVersion\": \"1.0.0\",\n" + "\"storeId\": \"10001000100\",\n" + "\"vendorId\": \"10001\"\n" + "}";
          Map<String, String> jsonMap = (Map) JSON.parse(jsonString);
//	  logger.debug(jsonMap.toString());
          for (Entry<String, String> item : jsonMap.entrySet()) {
              postRequest.addHeader(item.getKey(), item.getValue());
          }
          List<NameValuePair> list = new ArrayList<NameValuePair>();
          list.add(new BasicNameValuePair("phoneNumber", TestDataGenerator.generatorMobile()));
          list.add(new BasicNameValuePair("phoneCode", "123456"));
          list.add(new BasicNameValuePair("password", "123456"));
          UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
          postRequest.setEntity(uefEntity);
          response = httpClient.execute(postRequest);
          HttpEntity entity = response.getEntity();
          InputStream in = entity.getContent();
          byte[] result = new byte[2048];
          in.read(result);
          String resp = new String(result, "utf-8");
          JSONObject jsonObject = JSON.parseObject(resp);
          logger.debug("Json is: " + jsonObject);
          Phone = jsonObject.getJSONObject("data").getString("phone");
          UserId = jsonObject.getJSONObject("data").getString("userId");
          logger.debug("Phone is :" + Phone + "UserId is :" + UserId);
          file.write(Phone + "," + UserId + ",");


          //用户登录接口
          postRequest = new HttpPost(Login);
          jsonString = "{\n" + "\"platform\": \"1\",\n" + "\"device\": \"MEIZU-MX3\",\n" + "\"networkType\": \"4G\",\n" + "\"smartLoading\": \"1\",\n" + "\"screen\": \"1920*1080\",\n" + "\"uuid\": \"sadfsadfasdf\",\n" + "\"currentTime\": \"12345\",\n" + "\"installTime\": \"12345\",\n" + "\"channelId\": \"appstore\",\n" + "\"version\": \"1.0.0\",\n" + "\"apiVersion\": \"1.0.0\",\n" + "\"storeId\": \"10001000100\",\n" + "\"vendorId\": \"10001\"\n" + "}";
          jsonMap = (Map) JSON.parse(jsonString);
//	  logger.debug(jsonMap.toString());
          for (Entry<String, String> item : jsonMap.entrySet()) {
              postRequest.addHeader(item.getKey(), item.getValue());
          }
          list = new ArrayList<NameValuePair>();
          list.add(new BasicNameValuePair("phoneNumber", Phone));
          list.add(new BasicNameValuePair("password", "123456"));
          uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
          postRequest.setEntity(uefEntity);
          response = httpClient.execute(postRequest);
          entity = response.getEntity();
          in = entity.getContent();
          result = new byte[2048];
          in.read(result);
          resp = new String(result, "utf-8");
          jsonObject = JSON.parseObject(resp);
          logger.debug("Json is: " + jsonObject);
          token = jsonObject.getJSONObject("data").getString("token");
          file.write(token + ",");
          response.close();


          //调用增加地址接口
          postRequest = new HttpPost(AddaddressrequestUrl);
          jsonString = "{\n" + "\"platform\": \"1\",\n" + "\"device\": \"MEIZU-MX3\",\n" + "\"networkType\": \"4G\",\n" + "\"smartLoading\": \"1\",\n" + "\"screen\": \"1920*1080\",\n" + "\"uuid\": \"sadfsadfasdf\",\n" + "\"currentTime\": \"12345\",\n" + "\"installTime\": \"12345\",\n" + "\"channelId\": \"appstore\",\n" + "\"version\": \"1.0.0\",\n" + "\"apiVersion\": \"1.0.0\",\n" + "\"storeId\": \"10001000100\",\n" + "\"vendorId\": \"10001\",\n" + "}";
          jsonMap = (Map) JSON.parse(jsonString);
//	  logger.debug(jsonMap.toString());
          for (Entry<String, String> item : jsonMap.entrySet()) {
              postRequest.addHeader(item.getKey(), item.getValue());
          }
          postRequest.addHeader("token", token);
          list = new ArrayList<NameValuePair>();
          list.add(new BasicNameValuePair("name", "测试"));
          list.add(new BasicNameValuePair("mobile", Phone));
          list.add(new BasicNameValuePair("sex", "0"));
          list.add(new BasicNameValuePair("address", "接口测试用地址"));
          list.add(new BasicNameValuePair("signArea", "博瑞大厦"));
          list.add(new BasicNameValuePair("latitude", "39.933420075562005"));
          list.add(new BasicNameValuePair("longitude", "116.46912999999994"));
          uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
          postRequest.setEntity(uefEntity);
          response = httpClient.execute(postRequest);
          entity = response.getEntity();
          in = entity.getContent();
          result = new byte[2048];
          in.read(result);
          logger.debug("Response is :" + new String(result, "utf-8"));
          response.close();
          //调用查找地址接口
          HttpGet getRequest = new HttpGet(AddresslistrequestUrl);
          String headers = "{\n" + "\"platform\": \"1\",\n" + "\"device\": \"MEIZU-MX3\",\n" + "\"networkType\": \"4G\",\n" + "\"smartLoading\": \"1\",\n" + "\"screen\": \"1920*1080\",\n" + "\"uuid\": \"sadfsadfasdf\",\n" + "\"currentTime\": \"12345\",\n" + "\"installTime\": \"12345\",\n" + "\"channelId\": \"appstore\",\n" + "\"version\": \"1.0.0\",\n" + "\"apiVersion\": \"1.0.0\",\n" + "\"storeId\": \"10001000100\",\n" + "\"vendorId\": \"10001\",\n" + "}";
          Map<String, String> AddresslistheadsMap = (Map) JSON.parse(headers);
          for (Entry<String, String> item : AddresslistheadsMap.entrySet()) {
              getRequest.addHeader(item.getKey(), item.getValue());
          }
          getRequest.addHeader("token", token);
          response = httpClient.execute(getRequest);
          HttpEntity Addresslistentity = response.getEntity();
          InputStream Addresslistin = Addresslistentity.getContent();
          byte[] addlistresult = new byte[2048];
          Addresslistin.read(addlistresult);
          logger.debug("Response is :" + new String(addlistresult, "utf-8"));
          resp = new String(addlistresult, "utf-8");
          jsonObject = JSON.parseObject(resp);
          logger.debug("Json is: " + jsonObject);
          JSONArray AddressIdArray = jsonObject.getJSONArray("data");
          AddressId = AddressIdArray.getJSONObject(0).getString("id");
          logger.debug("AddressId is :" + AddressId);
          file.write(AddressId + "\r\n");
          file.flush();
          file.close();
          response.close();
      }




  }











  public static String OrderSeq;
  @Test
  public void GenOrderSeq(){
	logger.debug("test start");
	SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
	OrderSeq = formater.format(new Date()) + "0000000";
	for(int i = 1;i <= 10; i++){
	Long ordersn = Long.valueOf(OrderSeq);
    ordersn = ordersn + 1;
	OrderSeq = String.valueOf(ordersn);
	logger.debug(OrderSeq);
	}
  }


}
