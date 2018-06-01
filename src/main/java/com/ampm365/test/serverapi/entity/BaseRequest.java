package com.ampm365.test.serverapi.entity;



import java.io.Serializable;

/**
 * 请求系统参数
 * Created by zml on 2017/11/23.
 */

public class BaseRequest implements Serializable {

    private static final long serialVersionUID = -5115310150438597486L;

    private String appId;   // 接入方的appId

    private String sign;    // 签名

    private Long timestamp; // 请求时间戳

    private Integer platform;   // 平台类型


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
2
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
}
