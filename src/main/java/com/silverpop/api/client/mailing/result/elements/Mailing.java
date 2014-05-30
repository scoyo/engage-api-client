package com.silverpop.api.client.mailing.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("MAILING")
public class Mailing {

    @XStreamAlias("MailingId")
    private String mailingId;

    @XStreamAlias("ReportId")
    private String reportid;

    /** Returns the scheduled date and time in the following format: "mm/dd/yy hh:mm AMPM" */
    @XStreamAlias("ScheduledTS")
    private String scheduleTimestamp;

    @XStreamAlias("MailingName")
    private String mailingName;

    @XStreamAlias("ListName")
    private String listName;

    @XStreamAlias("ListId")
    private String listId;

    @XStreamAlias("UserName")
    private String userName;

    /** Returns the date/time when Engage sent the mailing. */
    @XStreamAlias("SentTS")
    private String sentTimestamp;

    /** Returns the number of contacts to whom Engage sent the mailing. */
    @XStreamAlias("NumSent")
    private Long numSent;

    /** Returns the number of sent mailings. */
    @XStreamAlias("SentMailingsCount")
    private Long sentMailingsCount;

    @XStreamAlias("Subject")
    private String subject;

    @XStreamAlias("Visibility")
    private String visibility;

    @XStreamAlias("QueryId")
    private String queryId;

    @XStreamAlias("QueryName")
    private String queryName;

    // TODO TAGS


    public String getMailingId() {
        return mailingId;
    }

    public void setMailingId(String mailingId) {
        this.mailingId = mailingId;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getScheduleTimestamp() {
        return scheduleTimestamp;
    }

    public void setScheduleTimestamp(String scheduleTimestamp) {
        this.scheduleTimestamp = scheduleTimestamp;
    }

    public String getMailingName() {
        return mailingName;
    }

    public void setMailingName(String mailingName) {
        this.mailingName = mailingName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSentTimestamp() {
        return sentTimestamp;
    }

    public void setSentTimestamp(String sentTimestamp) {
        this.sentTimestamp = sentTimestamp;
    }

    public Long getNumSent() {
        return numSent;
    }

    public void setNumSent(Long numSent) {
        this.numSent = numSent;
    }

    public Long getSentMailingsCount() {
        return sentMailingsCount;
    }

    public void setSentMailingsCount(Long sentMailingsCount) {
        this.sentMailingsCount = sentMailingsCount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }
}
