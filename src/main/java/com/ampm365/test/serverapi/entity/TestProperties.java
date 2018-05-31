package com.ampm365.test.serverapi.entity;

import com.ampm365.test.serverapi.enumerations.Enumerations.Environment;;

public class TestProperties {

	//get environment

	//test 3.0 environment
	private String OurHours30_url;
	private String OurHours30_port;

	//DB infomation
	private String databaseHostname;
	private String databasePort;
	private String databaseUsername;
	private String databasePassword;

	public String getOurHours30_url() {
		return OurHours30_url;
	}

	public void setOurHours30_url(String ourHours30_url) {
		OurHours30_url = ourHours30_url;
	}

	public String getOurHours30_port() {
		return OurHours30_port;
	}

	public void setOurHours30_port(String ourHours30_port) {
		OurHours30_port = ourHours30_port;
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
