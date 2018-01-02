package com.ampm365.test.serverapi.utility;

import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.entity.UserInfo;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class InsertNewUser extends ServerApiTest{
    public Log4jImpl logger = new Log4jImpl(InsertNewUser.class.getName());
    @Test
    public void InsertSql(){
        //UserInfo userInfo = DatabaseUtility.getSqlSession().selectOne("DatabaseMapper.user_info.getUserInfoByMobile","13699281256");
        UserInfo user = new UserInfo();
        user.setPhone("13699281256");
        UserInfo userInfo = DatabaseUtility.getSqlSession().selectOne("DatabaseMapper.user_info.getUserInfo", user);

    }

}
