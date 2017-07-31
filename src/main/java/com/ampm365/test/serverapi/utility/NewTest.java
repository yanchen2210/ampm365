package com.ampm365.test.serverapi.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.velocity.runtime.directive.Foreach;
import org.testng.annotations.Test;

import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.constants.Constants;
import com.ampm365.test.serverapi.entity.Member;
import com.ampm365.test.serverapi.enumerations.Enumerations.RequestDomain;

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
	  List<NameValuePair> list = new ArrayList<NameValuePair>();
	  Map<String, String> map = new HashMap<String, String>();
	  map.put("1", "1");
	  map.put("2", "2");
	  map.put("3", "3");
	  for(Entry<String, String> item : map.entrySet()){
		  list.add(new BasicNameValuePair(item.getKey(),item.getValue()));
		  logger.debug(list.toString());
	  }
  }
}
