package com.ampm365.test.serverapi.enumerations;

public class Enumerations {
	public static enum Environment{
		Test(0),Online(1);
		private Integer environment;
		Environment(Integer environment) {
			this.environment = environment;
		}
		
		public Integer value() {
			return environment;
		}		
	}
	
	public static enum ParameterType {
		VALID,INVALID,CUSTOM
	}
	
	public static enum RequestDomain{
		member,weixin;
	}
	
	
	//MemberRelations
	public static enum IdCard{
		VALID(),INVALID(),EMPTY();
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
