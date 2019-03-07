package com.fast.xinyue.service;


import com.fast.xinyue.domain.Request;
import com.fast.xinyue.repository.RequestRepository;
import com.sun.deploy.net.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class TestService {

    private RequestRepository requestRepository;

    @Autowired
    public TestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public void httpReq() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        List<Request> requestList = requestRepository.findAll();
        for(Request req:requestList){
            String name = req.getRequestName();
            String method = req.getRequestMethod();
            String url = req.getRequestUri();
            String data = req.getRequestData();
            if(method.equals("get")){
                HttpGet httpGet = new HttpGet(url);
                try {
                    CloseableHttpResponse response = httpClient.execute(httpGet);
                    System.out.println(response.getStatusLine());
                    HttpEntity httpEntity = response.getEntity();
                    //把内容转成字符串
                    try {
                        System.out.println(EntityUtils.toString(httpEntity));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }

}
