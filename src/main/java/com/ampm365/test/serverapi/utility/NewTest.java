package com.ampm365.test.serverapi.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.FormattedHeader;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.testng.annotations.Test;

import com.ampm365.test.serverapi.base.ServerApiTest;

public class NewTest extends ServerApiTest {
	public Log4jImpl logger = new Log4jImpl(NewTest.class.getName());
  @Test
  public void f() throws Exception {
	  logger.debug("test start");
//	  generateRequestUrl(RequestDomain.weixin, "/member");
//	  //Member memberinfo = DatabaseUtility.getSqlSession().selectOne(Constants.GET_USER_INFO_BY_MOBILE, "13813801380");
//	  Member memberinfo1 = new Member();
//	  //(mobile,mmb_sts_indc,reg_time,sales_sms_acpt_indc,verson,create_date,update_date,del_flag)
//	  Date nowTime = new Date();
//	  memberinfo1.setMobile("13699999999");
//	  memberinfo1.setMmb_sts_indc("1");
//	  memberinfo1.setReg_time(nowTime);
//	  memberinfo1.setSales_sms_acpt_indc("1");6
//	  memberinfo1.setVerson(1);
//	  memberinfo1.setCreate_date(nowTime);
//	  memberinfo1.setUpdate_date(nowTime);
//	  memberinfo1.setDel_flag("0");
//	  DatabaseUtility.getSqlSession().insert(Constants.INSERT_NEW_MEMBER, memberinfo1);
//	  List<NameValuePair> list = new ArrayList<NameValuePair>();
//	  Map<String, String> map = new HashMap<String, String>();
//	  map.put("1", "1");
//	  map.put("2", "2");
//	  map.put("3", "3");
//	  for(Entry<String, String> item : map.entrySet()){
//		  list.add(new BasicNameValuePair(item.getKey(),item.getValue()));
//		  logger.debug(list.toString());
//	  }
	  CloseableHttpClient httpClient = HttpClients.createDefault();
	  String requestUrl = "http://test.appapi.quanshishequ.com/api/login";
	  HttpPost postRequest = new HttpPost(requestUrl);
	  String jsonString = "{\"platform\":\"1\",\"device\":\"MEIZU-MX3\",\"networkType\":\"4G\",\"smartLoading\":\"1\",\"screen\":\"1920*1080\",\"uuid\":\"862679033583558\",\"currentTime\":\"12345\",\"installTime\":\"12345\",\"channelId\":\"appstore\",\"version\":\"1.0.0\",\"apiVersion\":\"1.0.0\",\"token\":\"\",\"storeId\":\"101\",\"vendorId\":\"1\"}";
	  Map jsonMap = (Map)JSON.parse(jsonString);
	  logger.debug(jsonMap.toString());

  }
}
