package com.fast.xinyue.controller;

import com.fast.xinyue.domain.Request;
import com.fast.xinyue.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping("/request")
public class RequestController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private RequestService requestService;

    /**
     * {@link Autowired} 可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
     * 这意味着要获取名为userRepository的bean,由Spring自动产生，我们将使用它来处理数据
     */
    @Autowired
    public RequestController(RequestService requestService){
        this.requestService =requestService;
    }

    @RequestMapping(path = "/add",method = RequestMethod.POST)
    public String add(Request request){
        logger.info("请求名称: {}",request.getRequestName());
        requestService.addRequest(request);

//        return "redirect:/show/request";
        return "redirect:/layui";
    }
}
