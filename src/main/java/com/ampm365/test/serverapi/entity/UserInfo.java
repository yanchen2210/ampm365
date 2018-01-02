package com.ampm365.test.serverapi.entity;

import java.util.Date;

public class UserInfo {
    private int id;
    private long userCode;
    private int growthValue;
    private int levelCode;
    private String phone;
    private String regAppId;
    private Date regTime;
    private int scoreValue;
    private String nickName;
    private String avatar;
    private String birthday;
    private int promotionCode;
    private String promotionName;
    private long promoterCode;
    private int promotionSms;
    private String frequentStore;
    private String name;
    private int sex;
    private String idCard;
    private String province;
    private String city;
    private String area;
    private String address;
    private String education;
    private int maritalStatus;
    private String loginPwd;
    private int status;
    private int sysVersion;
    private Date createTime;
    private Date updateTime;
    private String createUser;
    private String updateUser;
    private int deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserCode() {
        return userCode;
    }

    public void setUserCode(long userCode) {
        this.userCode = userCode;
    }

    public int getGrowthValue() {
        return growthValue;
    }

    public void setGrowthValue(int growthValue) {
        this.growthValue = growthValue;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(int levelCode) {
        this.levelCode = levelCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegAppId() {
        return regAppId;
    }

    public void setRegAppId(String regAppId) {
        this.regAppId = regAppId;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(int promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public long getPromoterCode() {
        return promoterCode;
    }

    public void setPromoterCode(long promoterCode) {
        this.promoterCode = promoterCode;
    }

    public int getPromotionSms() {
        return promotionSms;
    }

    public void setPromotionSms(int promotionSms) {
        this.promotionSms = promotionSms;
    }

    public String getFrequentStore() {
        return frequentStore;
    }

    public void setFrequentStore(String frequentStore) {
        this.frequentStore = frequentStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(int maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSysVersion() {
        return sysVersion;
    }

    public void setSysVersion(int sysVersion) {
        this.sysVersion = sysVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userCode=" + userCode +
                ", growthValue=" + growthValue +
                ", levelCode=" + levelCode +
                ", phone='" + phone + '\'' +
                ", regAppId='" + regAppId + '\'' +
                ", regTime=" + regTime +
                ", scoreValue=" + scoreValue +
                ", nickName='" + nickName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", birthday='" + birthday + '\'' +
                ", promotionCode=" + promotionCode +
                ", promotionName='" + promotionName + '\'' +
                ", promoterCode=" + promoterCode +
                ", promotionSms=" + promotionSms +
                ", frequentStore='" + frequentStore + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", idCard='" + idCard + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", loginPwd='" + loginPwd + '\'' +
                ", status=" + status +
                ", sysVersion=" + sysVersion +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
