package com.springmvcproject.stickynotes.controller;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.UpdateStickyNoteDTO;
import com.springmvcproject.stickynotes.service.StickyNoteService;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
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
    public String stickyNote(@PathVariable(name = "id") Long id, Model model) {
        StickyNoteDTO stickyNote = this.stickyNoteService.findById(id);
        model.addAttribute("stickyNote", stickyNote);
        return "sticky-note";
    }

    @GetMapping("edit-sticky-note/{id}")
    public String editStickyNote(@PathVariable(name = "id") Long id, Model model) {
        StickyNoteDTO stickyNote = this.stickyNoteService.findById(id);
        model.addAttribute("stickyNote", stickyNote);
        return "edit-sticky-note";
    }

    @PostMapping("/save")
    public String addNewStickyNote(@ModelAttribute("dto") AddStickyNoteDTO dto) {
        this.stickyNoteService.addStickyNote(dto);
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateStickyNote(@ModelAttribute("dto") UpdateStickyNoteDTO dto,
                                   @PathVariable("id") Long id) {
        this.stickyNoteService.update(dto, id);
        return "redirect:/edit-sticky-note/" + id;
    }

}
