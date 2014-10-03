package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetSentMailingsForOrgResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetSentMailingsForOrg")
public class GetSentMailingsForOrgCommand implements ApiCommand {


	@XStreamAlias("DATE_START")
	private String startDate;

	@XStreamAlias("DATE_END")
	private String endDate;


	@Override
	public Class<? extends ApiResult> getResultType() {
		return GetSentMailingsForOrgResult.class;
	}
	

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
