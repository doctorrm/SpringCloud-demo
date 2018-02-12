package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/consume")
    public String hi(@RequestParam String name){
    	System.out.println("你到过8760这里~~~~~~");
        return helloService.hiService(name);
    }


}