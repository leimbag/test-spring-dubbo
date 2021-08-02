package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author leimbag
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
