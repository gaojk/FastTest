package com.fast.xinyue.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


// @Entity 存储Request对象，注释为JPA实体; 这告诉Hibernate从这个类中创建一个表
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

    @JsonIgnore
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date requestCreateTime;

    @JsonIgnore
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    public Request() {
    }

    public Request(String requestName, String requestMethod, String requestUri,
                   String requestData, String requestDataType,
                   String requestHeader, Date requestCreateTime) {
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

    public Date getRequestCreateTime() {
        return requestCreateTime;
    }

    public void setRequestCreateTime(Date requestCreateTime) {
        this.requestCreateTime = requestCreateTime;
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
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}

