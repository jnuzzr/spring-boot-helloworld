package com.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/except")
    public String except(){
        int i = 1/0;
        return "Hello World!";
    }

    @RequestMapping("/longTime/{longTime}")
    public String longTime(@PathVariable("longTime") int longTime){
        System.out.println("longTime:"+longTime);
        try {
            Thread.sleep(longTime);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Hello World!";
    }

}
