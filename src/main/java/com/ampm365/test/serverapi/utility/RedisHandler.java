package com.ampm365.test.serverapi.utility;

import org.apache.ibatis.logging.log4j.Log4jImpl;

import com.ampm365.test.serverapi.base.ServerApiTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisHandler {

	private static Jedis RedisClient;
	private static Log4jImpl logger = new Log4jImpl(RedisHandler.class.getName());
	
//	public static Jedis getRedisConnect(){
//		JedisPool jedisPool = new JedisPool(PropertyHandler.getProperties().getRedisHostname(), PropertyHandler.getProperties().getRedisPort());
//		RedisClient = jedisPool.getResource();
//		RedisClient.auth(PropertyHandler.getProperties().getRedisPassword());
//		jedisPool.destroy();
//		return RedisClient;
//	}
//	private static Jedis getRedisConnect(){
//		RedisClient = new Jedis(PropertyHandler.getProperties().getRedisHostname(),PropertyHandler.getProperties().getRedisPort());
//		RedisClient.auth(PropertyHandler.getProperties().getRedisPassword());
//		return RedisClient;
//	}
	
//	private static void closeRedisConnect(){
//		RedisClient.close();
//		if(RedisClient.isConnected()){
//			logger.debug("RedisClient Closed Exception");
//		}
//	}
//
//	public static String getVerificationCode(String mobile){
//		String VerificationCode = null;
//		getRedisConnect();
//		String RedisVerificationString = RedisClient.get(mobile);
//		if(getRedisConnect()!= null){
//			if(RedisVerificationString != null && RedisVerificationString != ""){
//				VerificationCode = RedisVerificationString.substring(7, 13);
//			}else{
//				logger.debug("VerificationCode is NULL");
//			}
//		}
//		closeRedisConnect();
//		return VerificationCode;
//	}
}
