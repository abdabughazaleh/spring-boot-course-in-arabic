package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("")
    public String test(Model model){
        model.addAttribute("username" , "abd");
        return "index";
    }
}
