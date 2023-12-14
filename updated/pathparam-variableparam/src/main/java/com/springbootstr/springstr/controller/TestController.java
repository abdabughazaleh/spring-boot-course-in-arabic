package com.springbootstr.springstr.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMethod(@RequestParam String name,
                             @RequestParam String type,
                             @RequestParam String color) {
        return "Search for :  " + name + " and Type : " + type + " Color : " + color;
    }

    @GetMapping("/test-path/{name}/{type}/{color}/{id}")
    public String testPath(@PathVariable("name") String name,
                           @PathVariable("type") String type,
                           @PathVariable("color") String color,
                           @PathVariable("id") Integer id) {
        return "Name : " + name + " Type : " + type + " Color : " + color + " Id : " + id;
    }
}
