package com.ampm365.test.serverapi.Member.Verfication;

import com.ampm365.test.serverapi.enumerations.Enumerations;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.testng.Assert;

public class TestVerfication {
    private static Log4jImpl logger = new Log4jImpl(TestVerfication.class.getName());
    private static String ResponseContent;

    public static void VerfyResponseStatus(CloseableHttpResponse response,Enumerations.HttpResponseCode expectedStatusCode){
        if(response == null){
            logger.debug("Response is NULL");
            return;
        }
        else{
            int ActualStatusCode = response.getStatusLine().getStatusCode();
            Assert.assertEquals(ActualStatusCode,expectedStatusCode.value(),String.format("HTTP Status Code is",ActualStatusCode));
        }
    }
}
