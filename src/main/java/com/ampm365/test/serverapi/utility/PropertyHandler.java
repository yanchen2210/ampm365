package com.ampm365.test.serverapi.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.logging.log4j.Log4jImpl;

import com.ampm365.test.serverapi.entity.TestProperties;
import com.ampm365.test.serverapi.enumerations.Enumerations.Environment;

public final class PropertyHandler {
	
	private static Log4jImpl logger = new Log4jImpl(PropertyHandler.class.getName());
	private static TestProperties testProperties = null;

	public static TestProperties getProperties(){
		logger.debug("Start set the Environment from property file");
		if(testProperties == null){
			testProperties = new TestProperties();
			Properties properties = new Properties();
			testProperties.setEnvironment(getEnvironment("test"));
			InputStream inputStream = getPropertiesFileInputStream(testProperties.getEnvironment());
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			setDomians(properties, testProperties.getEnvironment());
			setDatbaseProperties(properties);
			//setRedisProperties(properties);
		}
		return testProperties;
	}
		
	
 	private static void setDatbaseProperties(Properties properties){
		testProperties.setDatabaseHostname(properties.getProperty("databaseHostname"));
		testProperties.setDatabasePort(properties.getProperty("databasePort"));
		testProperties.setDatabaseUsername(properties.getProperty("databaseUsername"));
		testProperties.setDatabasePassword(properties.getProperty("databasePassword"));
	}

// 	private static void setRedisProperties(Properties properties){
// 		testProperties.setRedisHostname(properties.getProperty("redis_Hostname"));
// 		testProperties.setRedisPassword(properties.getProperty("redis_Password"));
// 		testProperties.setRedisPort(Integer.parseInt(properties.getProperty("redis_Port")));
// 	}
	
	private static InputStream getPropertiesFileInputStream(Environment environment){
		InputStream inputStream = null;
		if(environment == Environment.Test){
			inputStream = PropertyHandler.class.getClassLoader().getResourceAsStream("test.properties");
		}
		else if(environment == Environment.Online){
			inputStream = PropertyHandler.class.getClassLoader().getResourceAsStream("online.properties");
		}			
		return inputStream;
	}

	private static Environment getEnvironment(String environment){
		Environment env = Environment.Test;
		if(environment != null && environment !="")
		{
			String temp = environment.trim().toLowerCase();
			if(temp.equals("test")){
				env = Environment.Test;
			}
			else if(temp.equals("online")){
				env = Environment.Online;
			}
		}
		return env;
	}

	private static void setDomians(Properties properties, Environment environment) {
		String OurHours30_url;
		String OurHours30_port;
		if (environment == Environment.Test) {
			OurHours30_url = properties.getProperty("OurHours30_url");
			OurHours30_port = properties.getProperty("OurHours30_port");
		}

	}
}
