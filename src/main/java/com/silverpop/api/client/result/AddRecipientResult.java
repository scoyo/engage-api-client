package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class AddRecipientResult implements ApiResult{

	@XStreamAlias("RecipientId")
	private Long recipientId;

	@XStreamAlias("SUCCESS")
	private boolean success;

	public Long getRecipientId() {
		return recipientId;
	}

	public boolean getSuccess() {
		return success;
	}
}