package com.ampm365.test.serverapi.Register;

import java.io.InputStream;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ampm365.test.serverapi.Register.parameter.RegisterLoginParameter;
import com.ampm365.test.serverapi.base.ServerApiTest;
import com.ampm365.test.serverapi.utility.TestDataGenerator;
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
        String requestUrl = "http://appapi.ohtest.quanshishequ.com/api/checkPhoneExist";
        //CloseableHttpClient httpClient = HttpClients.createDefault();
        //HttpPost postRequest = new HttpPost(requestUrl);
        registerLoginParameter.setPassword("13699281256");
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("phoneNumber", TestDataGenerator.generatorMobile()));
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

    }



}
