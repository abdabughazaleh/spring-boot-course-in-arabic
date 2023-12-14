package com.springbootstr.springstr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMethod(@RequestParam String name,
                             @RequestParam String type,
                             @RequestParam String color) {
        return "Search for :  " + name + " and Type : " + type + " Color : "+ color;
    }

    @GetMapping(path = "/print-name")
    public String printName() {
        return "Abd AbuGhazaleh";
    }

    @GetMapping(path = "/print-void")
    public void printVoid() {
        System.out.println("printed .....");
    }

    @PostMapping(path = "/print-post")
    public String printPosted() {
        return "printPosted";
    }
}
