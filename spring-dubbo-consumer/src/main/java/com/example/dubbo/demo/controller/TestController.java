package com.example.dubbo.demo.controller;

import com.example.dubbo.demo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author leimbag
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.hello(name);
    }

    @PostConstruct
    public void init(){
        logger.info(helloService.hello("系统"));
    }
}
