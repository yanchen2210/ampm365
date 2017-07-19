package com.ampm365.test.serverapi.utility;

import java.util.Date;

import org.apache.ibatis.logging.log4j.Log4jImpl;
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
//	  memberinfo1.setSales_sms_acpt_indc("1");
//	  memberinfo1.setVerson(1);
//	  memberinfo1.setCreate_date(nowTime);
//	  memberinfo1.setUpdate_date(nowTime);
//	  memberinfo1.setDel_flag("0");
//	  DatabaseUtility.getSqlSession().insert(Constants.INSERT_NEW_MEMBER, memberinfo1);
	  logger.debug(RedisHandler.getVerificationCode("18519702412"));
  }
}
