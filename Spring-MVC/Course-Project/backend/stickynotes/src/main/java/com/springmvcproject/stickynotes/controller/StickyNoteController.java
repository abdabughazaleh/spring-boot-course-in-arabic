package com.springmvcproject.stickynotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StickyNoteController {
    @GetMapping("")
    public String test() {
        return "test";
    }
}
