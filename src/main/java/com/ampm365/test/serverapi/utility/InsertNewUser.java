package com.ampm365.test.serverapi.utility;

import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.entity.TestProperties;
import com.ampm365.test.serverapi.entity.UserInfo;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;


public class InsertNewUser extends ServerApiTest{
    public Log4jImpl logger = new Log4jImpl(InsertNewUser.class.getName());
    private static TestProperties testProperties = PropertyHandler.getProperties();
    @Test
    public void InsertSql(){
        //UserInfo userinfo = DatabaseUtility.getSqlSession().selectOne("DatabaseMapper.user_info.getUserInfoByMobile","13699281256");
        DatabaseUtility.getSqlSession().insert("DatabaseMapper.user_info.insertNewMember");


    }

}
