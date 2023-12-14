package com.springbootstr.springstr.controller;

import com.springbootstr.springstr.dto.ContactsDto;
import com.springbootstr.springstr.dto.RegistrationDto;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


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

        List<ContactsDto> contacts = new ArrayList<>();

        contacts.add(new ContactsDto("Work" , "078888888888"));
        contacts.add(new ContactsDto("Home" , "099999999"));
        contacts.add(new ContactsDto("Other" , "05555555"));

        subObject.put("work", "test work address");
        subObject.put("home", "my home address");

        object.put("firstName", "Abd");
        object.put("lastName", "AbuGhazaleh");
        object.put("mobile", "055555");
        object.put("address", subObject);
        object.put("contacts", contacts);

        return object;
    }

}
