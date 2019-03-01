package com.fast.xinyue.httpclient;


import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

/**
 * 使用apache http client
 */
public class TestHttpClient {

    public static void main(String[] args) {
        // 创建一个客户端
        HttpClient client = new DefaultHttpClient();

        // 创建一个Get请求
        HttpGet get = new HttpGet("http://www.baidu.com");

        // 客户端执行请求
        HttpResponse response=null;
        try {
            response = client.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取协议版本・・・「HTTP/1.1」
        System.out.println(response.getProtocolVersion());

        //获取完整的StatusLine・・・「HTTP/1.1 200 OK」
        System.out.println(response.getStatusLine());

        for(Header header:response.getAllHeaders()){
            System.out.println(header);
        }
    }

}
