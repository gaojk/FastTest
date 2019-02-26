package com.fast.xinyue.controller;


import com.fast.xinyue.domain.Request;
import com.fast.xinyue.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@EnableAutoConfiguration
public class TestController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RequestRepository requestRepository;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/Test")
    public String Test(@PathParam("username") String username, @PathParam("password") String password){
        logger.info("用户名称：{}",username);
        logger.info("用户密码：{}",password);
        return "show";
    }

    @GetMapping("/show/request")
    public String itemList(Model model){
        List<Request> requestList = requestRepository.findAll();
        model.addAttribute("request",requestList);
        for(Request req :requestList){
            System.out.println(req.toString());
        }
        return "show";
    }

    @GetMapping("/layui")
    public String layui(){
        System.out.println("layui在执行");
        return "layui";
    }
}
