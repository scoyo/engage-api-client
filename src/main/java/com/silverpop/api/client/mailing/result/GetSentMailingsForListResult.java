package com.silverpop.api.client.mailing.result;


import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.mailing.result.elements.Mailing;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class GetSentMailingsForListResult implements ApiResult {

    @XStreamImplicit(itemFieldName="Mailing")
    private List<Mailing> mailings;


    public List<Mailing> getMailings() {
        return mailings;
    }

    public void setMailings(List<Mailing> mailings) {
        this.mailings = mailings;
    }
}
