package com.ampm365.test.serverapi.enumerations;

import java.util.Enumeration;

public class Enumerations {
	public static enum Environment {
		Test(0),Pre(1),Online(2);
		private Integer environment;

		Environment(Integer environment){
			this.environment = environment;
		}
		public Integer value() {
			return environment;
		}
	}

	public static enum ParameterType {
		VALID,FULL,CUSTOM
	}
	
	public static enum RequestDomain {
		ourHours30
	}

	public enum HttpResponseCode{
		Success(200),NOTFOUND(404),FAILURE(500);
		private int code;

		HttpResponseCode(int temp) {
			code = temp;
		}

		public int value() {
			return this.code;
		}
	}
	
	//MemberRelations
	public static enum IdCard{
		VALID(),INVALID(),EMPTY();
	}
	
	public static enum GetMemberInfo{
		INFO(),LvINFO(),GrowthVal()
	}
	/**
	 * @category  User Phone OS
	 */
	public static enum Platform {
		iOS("iOS"), android("android"), none("none");

		private String platform;

		Platform(String platform) {
			this.platform = platform;
		}

		public String value() {
			return platform;
		}
	}
}
