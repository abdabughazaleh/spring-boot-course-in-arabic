package com.springcourse.springcor.controller;

import com.springcourse.springcor.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private TestDao testDao;


    @GetMapping("/test")
    public String getName(){
        return this.testDao.getName();
    }

}
