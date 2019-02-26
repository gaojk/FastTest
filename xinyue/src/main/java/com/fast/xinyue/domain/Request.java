package com.fast.xinyue.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requestId;

    private String requestName;

    private String requestMethod;

    private String requestUri;

    private String requestData;

    private String requestDataType;

    private String requestHeader;

    private String requestCreateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable=false, updatable=false)
    @CreationTimestamp
    protected Date createTime;

    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable=false)
    @UpdateTimestamp
    protected Date lastUpdateTime;


    public Request() {
    }

    public Request(String requestName, String requestMethod, String requestUri,
                   String requestData, String requestDataType,
                   String requestHeader, String requestCreateTime) {
        this.requestName = requestName;
        this.requestMethod = requestMethod;
        this.requestUri = requestUri;
        this.requestData = requestData;
        this.requestDataType = requestDataType;
        this.requestHeader = requestHeader;
        this.requestCreateTime = requestCreateTime;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public String getRequestDataType() {
        return requestDataType;
    }

    public void setRequestDataType(String requestDataType) {
        this.requestDataType = requestDataType;
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    public String getRequestCreateTime() {
        return requestCreateTime;
    }

    public void setRequestCreateTime(String requestCreateTime) {
        this.requestCreateTime = requestCreateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", requestName='" + requestName + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", requestUri='" + requestUri + '\'' +
                ", requestData='" + requestData + '\'' +
                ", requestDataType='" + requestDataType + '\'' +
                ", requestHeader='" + requestHeader + '\'' +
                ", requestCreateTime='" + requestCreateTime + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}

