package com.springmvcproject.stickynotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StickyNoteController {
    @GetMapping("")
    public String home() {
        return "home";
    }
    @GetMapping("my-notes")
    public String myNotes() {
        return "my-notes";
    }
    @GetMapping("sticky-note/{id}")
    public String stickyNote(@PathVariable(name = "id") Integer id) {
        return "sticky-note";
    }

}
