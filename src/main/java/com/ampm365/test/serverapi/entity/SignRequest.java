package com.ampm365.test.serverapi.entity;



import java.util.Map;

/**
 * 请求签名数据
 * Created by zml on 2017/11/24.
 */

public class SignRequest extends BaseRequest {

    private String cmd;             // 请求地址/命令

    private Map<String, Object> appParams;  // 请求参数


    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public Map<String, Object> getAppParams() {
        return appParams;
    }

    public void setAppParams(Map<String, Object> appParams) {
        this.appParams = appParams;
    }
}
