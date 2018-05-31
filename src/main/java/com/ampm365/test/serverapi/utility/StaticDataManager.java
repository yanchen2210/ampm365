package com.ampm365.test.serverapi.utility;

import java.util.HashMap;
import java.util.Map;

public class StaticDataManager {
    public static Map generatorHeaders(){
        Map headersMap = new HashMap();
        headersMap.put("platform","1");
        headersMap.put("device","ApiTest");
        headersMap.put("networkType","LAN");
        headersMap.put("smartLoading","1");
        headersMap.put("screen","ApiTest");
        headersMap.put("device","1920*1080");
        headersMap.put("uuid","none");
        headersMap.put("currentTime",TestDataGenerator.generatorTimeStamp());
        headersMap.put("installTime",TestDataGenerator.generatorTimeStamp());
        headersMap.put("channelId","appstore");
        headersMap.put("version","1.0.0");
        headersMap.put("apiVersion","2.0.0");
        headersMap.put("session","");
        headersMap.put("storeId","10001000100");
        headersMap.put("vendorId","10001");
        return headersMap;
    }

	
}
