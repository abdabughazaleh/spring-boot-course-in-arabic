package com.springmvcproject.stickynotes.controller;

import com.springmvcproject.stickynotes.model.dto.AddNoteDTO;
import com.springmvcproject.stickynotes.model.dto.NoteDTO;
import com.springmvcproject.stickynotes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/note")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("/add/{stickyNoteId}")
    public String addNote(@ModelAttribute("dto") AddNoteDTO dto, @PathVariable("stickyNoteId") Long stickyNoteId) {
        this.noteService.add(dto, stickyNoteId);
        return "redirect:/sticky-note/" + stickyNoteId;
    }
}
