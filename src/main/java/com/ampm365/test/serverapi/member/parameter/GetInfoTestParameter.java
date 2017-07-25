package com.ampm365.test.serverapi.member.parameter;

import com.ampm365.test.serverapi.constants.Constants;
import com.ampm365.test.serverapi.enumerations.Enumerations.GetMemberInfo;

public class GetInfoTestParameter {
	private String parameter;
	public String toParameterString(GetMemberInfo getMemberInfo,String mobile){
		switch (getMemberInfo){
		case INFO:
		parameter = Constants.FindMemberInfoByMobile.replace("{mobile}", mobile);
		break;
		case LvINFO:
		parameter = Constants.FindMemberLvChangeByMobile.replace("{mobile}", mobile);
		break;
		case GrowthVal:
		parameter = Constants.FindMemberGrowChangeByMobile.replace("{mobile}", mobile);
		}		
		return parameter;
	}
}
