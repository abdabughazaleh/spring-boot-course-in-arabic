package com.springbootstr.springstr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMethod(){
        return "testMethod executed !";
    }

    @GetMapping(path = "/print-name")
    public String printName(){
        return "Abd AbuGhazaleh";
    }

    @GetMapping(path = "/print-void")
    public void printVoid(){
        System.out.println("printed .....") ;
    }
    @PostMapping(path = "/print-post")
    public String printPosted(){
        return "printPosted";
    }
}
