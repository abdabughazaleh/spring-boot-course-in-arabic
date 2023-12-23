package com.springmvcproject.stickynotes.controller;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.service.StickyNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StickyNoteController {
    private final StickyNoteService stickyNoteService;
    @GetMapping("")
    public String home(Model model) {
        List<StickyNoteDTO> stickyNoteDTOS = this.stickyNoteService.allStickyNotes();
        model.addAttribute("stickyNotes", stickyNoteDTOS);
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

    @GetMapping("edit-sticky-note/{id}")
    public String editStickyNote(@PathVariable(name = "id") Integer id) {
        return "edit-sticky-note";
    }

    @PostMapping("/save")
    public String addNewStickyNote(@ModelAttribute("dto") AddStickyNoteDTO dto){
        this.stickyNoteService.addStickyNote(dto);
        return "redirect:/";
    }

}
