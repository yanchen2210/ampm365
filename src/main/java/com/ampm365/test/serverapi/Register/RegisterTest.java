package com.ampm365.test.serverapi.Register;

import java.io.InputStream;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ampm365.test.serverapi.Register.parameter.RegisterLoginParameter;
import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.constants.Constants;
import com.ampm365.test.serverapi.utility.StaticDataManager;
import com.ampm365.test.serverapi.utility.TestDataGenerator;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RegisterTest extends ServerApiTest {
    private static Log4jImpl logger = new Log4jImpl(RegisterTest.class.getName());
    private RegisterLoginParameter registerLoginParameter;

    @Test
    public void checkPhoneExistTest() throws Exception{
        registerLoginParameter = new RegisterLoginParameter();
        registerLoginParameter.setPhoneNumber(TestDataGenerator.generatorMobile());

        List<NameValuePair> Parameterlist = new ArrayList<NameValuePair>();
        Parameterlist.add(new BasicNameValuePair("phoneNumber",registerLoginParameter.getPhoneNumber()));
        sendPostRequest(Constants.CheckPhoneExist,Parameterlist,StaticDataManager.generatorHeaders());
        HttpEntity entity = response.getEntity();
        InputStream in = entity.getContent();
        byte[] result = new byte[2048];
        in.read(result);
        String resp = new String(result, "utf-8");
        JSONObject jsonObject = JSON.parseObject(resp);
        logger.debug("Json is: " + jsonObject);
    }



}
