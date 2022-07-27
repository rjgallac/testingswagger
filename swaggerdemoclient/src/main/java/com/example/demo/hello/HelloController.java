package com.example.demo.hello;

import io.swagger.client.api.HelloControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloController {

    @Autowired
    HelloControllerApi helloControllerApi;

    @GetMapping
    public String get(){
        return helloControllerApi.getUsingGET();
    }
}
