package com.springbootstr.springstr.controller;

import com.springbootstr.springstr.dto.RegistrationDto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
public class TestController {


    @PostMapping(path = "/test-post")
    public RegistrationDto testPost(@RequestBody RegistrationDto form) {
        return form;
    }

    @GetMapping("/test-json-object")
    public HashMap<String, Object> testJson() {

        HashMap<String, Object> object = new HashMap<>();
        HashMap<String, Object> subObject = new HashMap<>();

        subObject.put("work", "test work address");
        subObject.put("home", "my home address");

        object.put("firstName", "Abd");
        object.put("lastName", "AbuGhazaleh");
        object.put("mobile", "055555");
        object.put("address", subObject);

        return object;
    }

}
