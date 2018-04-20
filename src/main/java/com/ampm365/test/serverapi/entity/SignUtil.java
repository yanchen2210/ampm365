package com.ampm365.test.serverapi.entity;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;


import java.util.*;

/**
 * 签名工具类
 * Created by zml on 2017/11/23.
 */

public class SignUtil {


    private static String apiUrl = "http://mms.ohtest.quanshishequ.com/api";


    /**
     * 生成签名
     * @param appId
     * @param secret
     * @param signRequest
     * @return
     */
    public static Map<String,String> buildParams(String appId, String secret, SignRequest signRequest) {
        Map<String,String> params = new TreeMap<>();
        params.put("appId", appId);
        params.put("timestamp", String.valueOf(System.currentTimeMillis()/1000));
        if(signRequest.getPlatform() != null) {
            params.put("platform", signRequest.getPlatform().toString());
        }
        Map<String,Object> appParams = signRequest.getAppParams();
        for(String key : appParams.keySet()) {
            if(appParams.get(key) == null) {
                continue;
            }
            params.put(key, appParams.get(key).toString());
        }
        params.put("sign", sign(secret, signRequest.getCmd(), params));
        return params;
    }


    /**
     * 验证签名
     * @param appId
     * @param secret
     * @param signRequest
     * @return
     */
    public static boolean verifySign(String appId, String secret, SignRequest signRequest) {
        Map<String,String> params = new TreeMap<>();
        params.put("appId", appId);
        params.put("timestamp", signRequest.getTimestamp().toString());
        if(signRequest.getPlatform() != null) {
            params.put("platform", signRequest.getPlatform().toString());
        }
        Map<String,Object> appParams = signRequest.getAppParams();
        for(String key : appParams.keySet()) {
            if(appParams.get(key) == null) {
                continue;
            }
            params.put(key, appParams.get(key).toString());
        }
        String sign = sign(secret, signRequest.getCmd(), params);
        if(!signRequest.getSign().equals(sign)) {
            return false;
        }
        return true;
    }

    public static String sign(String appSecret, String appPath, Map<String,String> params){
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, String> entry : params.entrySet()){
            list.add(entry.getKey()+"="+entry.getValue());
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append(getAppUrl(appPath));
        buffer.append("?").append(StringUtils.join(list,"&"));
        buffer.append(appSecret);
        return DigestUtils.md5Hex(buffer.toString());
    }

    public static String getAppUrl(String appPath){
        while(StringUtils.startsWith(appPath, "/")){
            appPath = StringUtils.removeFirst(appPath, "/");
        }
        return apiUrl + "/" + appPath;
    }

    public static void main(String[] args) {
        String appId = "1012";
        String appSecret = "019ce236c96223481b3e48a2ef86af06";

        SignRequest signRequest = new SignRequest();
        signRequest.setAppId(appId);
        signRequest.setTimestamp(System.currentTimeMillis()/1000);
        signRequest.setPlatform(6);
        signRequest.setCmd("vendor/info");
        Map<String, Object> appParams = new HashMap<>();
//        appParams.put("dynamicCode", "2741820819152453");
//        appParams.put("dynamicCode", "4852931944789060");
//        appParams.put("phone", "15652483102");
        appParams.put("vendorId", "10001");
        signRequest.setAppParams(appParams);

        Map<String,String> params = SignUtil.buildParams(appId, appSecret, signRequest);
        System.out.println("sign: "+params.get("sign"));
        System.out.println("timestamp: "+params.get("timestamp"));
        System.out.println(params);
    }
}
