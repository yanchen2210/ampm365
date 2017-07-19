package com.ampm365.test.serverapi.member.parameterparser;

import com.ampm365.test.serverapi.enumerations.Enumerations.ParameterType;
import com.ampm365.test.serverapi.member.parameter.TestParameter;

public class TestParameterParser {
	TestParameter testParameter;

	public TestParameter getTestParameter() {
		return testParameter;
	}

	public void setTestParameter(TestParameter testParameter) {
		this.testParameter = testParameter;
	}
	
	public TestParameter parser(ParameterType parameterType, Boolean isAuto){
		return testParameter;
	}
}
