package com.fast.xinyue.controller;


import com.fast.xinyue.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class RestController {

    private final TestService testService;

    @Autowired
    public RestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/ones")
    public String test(){
        testService.httpReq();
        return "one";
    }

}
