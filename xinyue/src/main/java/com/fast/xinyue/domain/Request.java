package com.fast.xinyue.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


/**
 * 该实体类表示的是HTTP接口测试的接口Request请求实体类
 * <p>
 *     实体类的主要职责是存储和管理系统内部的信息.
 *     它也可以有行为，甚至很复杂的行为，但这些行为必须与它所代表的实体对象密切相关
 *     实体类主要是作为数据管理和业务逻辑处理层面上存在的类别.
 *     实体类是用于对必须存储的信息和相关行为建模的类.
 *     实体类表示系统中的信息存储，它们一般用于表示系统所管理的核心概念.
 * </p>
 * {@link Entity} 存储Request对象，注释为JPA实体;这告诉Hibernate从这个类中创建一个表
 *
 */
@Entity
public class Request {

    /**
     * 请求的编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requestId;

    /**
     * 请求名称
     */
    private String requestName;

    /**
     * 请求方法
     */
    private String requestMethod;

    /**
     * 请求路径
     */
    private String requestUri;

    /**
     * 请求数据
     */
    private String requestData;

    /**
     * 请求数据类型
     */
    private String requestDataType;

    /**
     * 请求标头
     */
    private String requestHeader;

    /**
     * 请求创建时间
     */
    @JsonIgnore
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date requestCreateTime;

    /**
     * 请求更新时间
     */
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

