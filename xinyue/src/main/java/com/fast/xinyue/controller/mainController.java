package com.fast.xinyue.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class mainController {

    /**
     * 返回首页信息
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
