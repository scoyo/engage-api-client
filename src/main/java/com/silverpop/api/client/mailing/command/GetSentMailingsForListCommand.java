package com.silverpop.api.client.mailing.command;

import java.util.Date;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.converters.ApiDateParameterWithoutAMPMConverter;
import com.silverpop.api.client.mailing.result.GetSentMailingsForListResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XmlApiProperties("GetSentMailingsForList")
public class GetSentMailingsForListCommand implements ApiCommand {

    // TODO implement INCLUDE_CHILDREN which is an empty tag

    @XStreamAlias("DATE_START")
    @XStreamConverter(ApiDateParameterWithoutAMPMConverter.class)
    private Date startDate;

    @XStreamAlias("DATE_END")
    @XStreamConverter(ApiDateParameterWithoutAMPMConverter.class)
    private Date endDate;

    @XStreamAlias("LIST_ID")
    private Long listId;

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetSentMailingsForListResult.class;
    }
}
