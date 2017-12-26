package com.ampm365.test.serverapi.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

import com.ampm365.test.serverapi.enumerations.Enumerations.IdCard;
import com.baomidou.kisso.common.encrypt.RSA;
import com.baomidou.kisso.common.encrypt.base64.Base64;

public class TestDataGenerator {
	private static String baseString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRTUVWXYZ0123456789";
	private static String baseNum = "0123456789";
	private static DateFormat baseDate = new SimpleDateFormat("yyyyMMddHHmmss");
	public static String publickey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCQvtRGoBYo9y4k1D/7hgDZN/6r5dj8PY66obhg1I+mkMVPxPVZHtS4mWAoJotvtW+ZnOvEQQ07G5szNCGQNnEPbxjlietnZlzYFI4u1ljGpx9FcBhon3QQ2s+oxQKA6jhTB1bytevWhIcqC3+BJ6SkMLzCQDnzQO456djc9Ez/jwIDAQAB";
	public static String generatorString(int length){
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i = 0;i < length;i++){
			int position = random.nextInt(baseString.length());
			sb.append(baseString.charAt(position));
		}
		return sb.toString();
	}
	
	public static String generatorNum(int length){
		StringBuffer sb= new StringBuffer();
		Random random = new Random();
		for(int i = 0;i < length;i++){
			int position = random.nextInt(baseNum.length());
			sb.append(baseNum.charAt(position));
		}
		return sb.toString();
	}
	
	public static String generatorMobile(){
		Random random = new Random();
		String[] mobilePrefix = new String[]{"199","198"};
		int position = random.nextInt(mobilePrefix.length);
		String Mobile = mobilePrefix[position] + generatorNum(8);
		return Mobile;
	}
	
	
	public static String generatorIdCard(IdCard idcard){
		String idCard = null;	
		switch(idcard){
			case VALID:
				idCard = "110101198805050521";
				break;
			case INVALID:
				idCard = "110101122222222222";
				break;
			case EMPTY:
				idCard = "";		
				}
		return idCard;
	}
	
	public static String generatorPassword(String password) throws Exception{
		String loginPwd = null;
		byte[] encodedData = RSA.encryptByPublicKey(password.getBytes(), publickey);
		loginPwd = Base64.toBase64String(encodedData);
		return loginPwd;
	}
}