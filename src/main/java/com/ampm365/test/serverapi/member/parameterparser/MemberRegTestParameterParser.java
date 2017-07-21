package com.ampm365.test.serverapi.member.parameterparser;

import com.ampm365.test.serverapi.enumerations.Enumerations.ParameterType;
import com.ampm365.test.serverapi.member.parameter.MemberRegTestParameter;
import com.ampm365.test.serverapi.utility.TestDataGenerator;

public class MemberRegTestParameterParser extends TestParameterParser{
	public MemberRegTestParameter memberRegTestParameter;
	@Override
	public MemberRegTestParameter parser(ParameterType parameterType, Boolean isAuto){
		if(memberRegTestParameter == null){
			memberRegTestParameter = new MemberRegTestParameter();
		}
		switch (parameterType) {
		case VALID:
			memberRegTestParameter.setMobile(TestDataGenerator.generatorMobile());
			memberRegTestParameter.setPromotionCde("02");
			memberRegTestParameter.setChanlCde("chanl0002");
			break;
		case FULL:
			
			break;
		case CUSTOM:
			
			break;
		default:
			break;
		}
		if(isAuto){
			//TODO
		}
		return memberRegTestParameter;
		}
}
	
