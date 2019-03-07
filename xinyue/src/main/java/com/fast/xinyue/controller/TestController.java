package com.fast.xinyue.controller;


import com.alibaba.fastjson.JSONObject;
import com.fast.xinyue.domain.Request;
import com.fast.xinyue.repository.RequestRepository;
import com.fast.xinyue.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 接口测试业务逻辑实现类
 */
@Controller
@EnableAutoConfiguration
public class TestController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private final RequestRepository requestRepository;



    @Autowired
    public TestController(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }


    @RequestMapping("/add")
    public String add(){
        return "add";
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

    /**
     *Json 格式数据返回
     * {
     *   "code": 0,
     *   "msg": "",
     *   "count": 1000,
     *   "data": [{}, {}]
     * }
     *
     *  com.alibaba.fastjson.JSONObject;  用于构建json对象并返回
     */
    @GetMapping("/show/requests")
    @ResponseBody
    public String itemLists(Model model){
        List<Request> requestList = requestRepository.findAll();
        JSONObject obj = new JSONObject();
        obj.put("code",0);
        obj.put("msg","success!");
        obj.put("count",requestList.size());
        obj.put("data",requestList);
        return obj.toJSONString();
    }


    @GetMapping("/layui")
    public String layui(){
        return "layui";
    }


    @GetMapping("/show_form")
    public String showForm(){
        return "form";
    }


    @RequestMapping("/one")
    public String showOne(){
        return "one";
    }




}
