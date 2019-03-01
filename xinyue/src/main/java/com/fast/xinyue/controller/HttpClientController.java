package com.fast.xinyue.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class HttpClientController {

    /**
     * GET无参请求
     */
    @GetMapping("/get")
    public String get(){
        return "get无参请求成功";
    }

    /**
     * GET有参请求
     */
    @GetMapping("/getWithParam")
    public String getWithParam(@RequestParam String param){
        return "GET请求参数:"+param;
    }

    /**
     * POST无参数请求
     */
    @PostMapping("/post")
    public String post(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("Accept") String accept,
            @RequestHeader("Accept-Language") String acceptLanguage,
            @RequestHeader("Accept-Encoding") String acceptEncoding,
            @RequestHeader("Cookie") String cookie,
            @RequestHeader("Connection") String connection){
        // 打印请求头信息
        System.out.println("Cookie"+cookie);
        System.out.println("Connection = " + connection);
        System.out.println("Accept = " + accept);
        System.out.println("Accept-Language = " + acceptLanguage);
        System.out.println("Accept-Encoding = " + acceptEncoding);
        System.out.println("User-Agent = " + userAgent);
        return "post无参请求成功";
    }

    /**
     * POST有参数请求
     */
    @PostMapping("/postWithParam")
    public String postWithParam(@RequestParam String username, @RequestParam String password) {
        return "post带参请求成功,参数username: " + username + ",参数password: " + password;
    }
}
