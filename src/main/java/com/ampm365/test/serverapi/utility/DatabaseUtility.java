package com.ampm365.test.serverapi.utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class DatabaseUtility {
	private static Log4jImpl logger = new Log4jImpl(DatabaseUtility.class.getName());
	
	private static String url;
	private static Connection connection;
	private static SqlSession sqlSession;
	
	public static String getUrl(){
		if(url != null){
			url = "jdbc:mysql://" + PropertyHandler.getProperties().getDatabaseHostname() + ":" +PropertyHandler.getProperties().getDatabasePort();
		}
		return url;
	}
	
	public static Connection getConnection(){
		if(connection != null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, PropertyHandler.getProperties().getDatabaseUsername(), PropertyHandler.getProperties().getDatabasePassword());
				if(connection.isClosed()){
					logger.debug("Connect to the test db successfully.");
				}
			} catch (ClassNotFoundException e) {
				logger.debug("ClassNotFoundException is Found");
				e.printStackTrace();
			}catch (SQLException e) {
				logger.debug("SQL Exception is Found");
				e.printStackTrace();
			}	
		}
		return connection;
	}
	
	public static void CloseDatabaseConnect(){
		if(connection != null){
			try{
				if(!connection.isClosed()){
					connection.close();
				}				
			}catch (SQLException e){
				logger.debug("Close SQL Connection Exception is Found");
				e.printStackTrace();
			}
		}
	}
	
	public static SqlSession getSqlSession(){
		if(sqlSession == null){
			InputStream inputStream = DatabaseUtility.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sessionFactory.openSession(true);
		}
		else{
			sqlSession.clearCache();
		}
		return sqlSession;
	}
}