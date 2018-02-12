package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/middle-hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
    	System.out.println("你到过8765这里~~~~~~");
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
