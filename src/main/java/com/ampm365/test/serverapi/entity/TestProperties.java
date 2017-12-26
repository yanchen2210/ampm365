package com.ampm365.test.serverapi.entity;

import com.ampm365.test.serverapi.enumerations.Enumerations.Environment;;

public class TestProperties {
	
	//test weixin20 environment
	private String weixin_hostName;
	private String weixin_port;
	//test member environment
	private String member_hostname;
	private String member_port;
	private Environment environment = Environment.Test;
	//DB infomation
	private String databaseHostname;
	private String databasePort;
	private String databaseUsername;
	private String databasePassword;
	
	//Redis environment
	private String redisHostname;
	private String redisPassword;
	private int redisPort;
	
	public String getRedisHostname() {
		return redisHostname;
	}
	public void setRedisHostname(String redisHostname) {
		this.redisHostname = redisHostname;
	}
	public String getRedisPassword() {
		return redisPassword;
	}
	public void setRedisPassword(String redisPassword) {
		this.redisPassword = redisPassword;
	}
	public int getRedisPort() {
		return redisPort;
	}
	public void setRedisPort(int redisPort) {
		this.redisPort = redisPort;
	}
	public String getWeixin_hostName() {
		return weixin_hostName;
	}
	public void setWeixin_hostName(String weinxin_hostName) {
		this.weixin_hostName = weinxin_hostName;
	}
	public String getWeixin_port() {
		return weixin_port;
	}
	public void setWeixin_port(String weixin_port) {
		this.weixin_port = weixin_port;
	}
	public String getMember_hostname() {
		return member_hostname;
	}
	public void setMember_hostname(String member_hostname) {
		this.member_hostname = member_hostname;
	}
	public String getMember_port() {
		return member_port;
	}
	public void setMember_port(String member_port) {
		this.member_port = member_port;
	}
	public Environment getEnvironment() {
		return environment;
	}
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	public String getDatabaseHostname() {
		return databaseHostname;
	}
	public void setDatabaseHostname(String databaseHostname) {
		this.databaseHostname = databaseHostname;
	}
	public String getDatabasePort() {
		return databasePort;
	}
	public void setDatabasePort(String databasePort) {
		this.databasePort = databasePort;
	}
	public String getDatabaseUsername() {
		return databaseUsername;
	}
	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}
	public String getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
}
