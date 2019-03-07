package com.fast.xinyue.study;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.Closeable;

/**
 * Apache HttpClient 4.5.7 API
 */
public class HttpClient01 {

    /**
     * {@link HttpClient} 是一个最基本的接口
     *  仅代表HTTP请求执行的最基本约定,
     *  它对请求执行过程没有任何限制或特定的细节,
     *  并将状态管理、身份验证和重定向处理的细节留给单个实现。
     *
     *  CloseableHttpClient 抽象类
     *  httpclient的基本实现，也实现closeable.
     *
     *
     */

    /**
     * {@link CloseableHttpClient} 是一个抽象类
     * Base implementation of {@link HttpClient} that also implements {@link Closeable}.
     * 它是{@link HttpClient}接口的基本实现、同时也实现了{@link Closeable}接口
     */
    /**
     * {@link java.io.Closeable} 接口
     * Closeable 是可以关闭的数据源或目标.
     * 调用close方法释放对象所持有的资源（如打开的文件）。
     *
     */
    /**
     * {@link org.apache.http.impl.client.HttpClients}
     * Factory methods for {@link CloseableHttpClient} instances.
     * CloseableHttpClient实例的 工厂方法。
     *
     */

//    HttpResponse

}
