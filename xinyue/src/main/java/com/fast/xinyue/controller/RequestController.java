package com.fast.xinyue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/")
    public String index(){
        return "欢迎来到测试首页哦！";
    }
}
