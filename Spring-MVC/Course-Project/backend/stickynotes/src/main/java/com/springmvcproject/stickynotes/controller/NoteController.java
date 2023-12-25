package com.springmvcproject.stickynotes.controller;

import com.springmvcproject.stickynotes.model.dto.AddNoteDTO;
import com.springmvcproject.stickynotes.model.dto.NoteDTO;
import com.springmvcproject.stickynotes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/delete/{noteId}/{stickyNoteId}")
    public String delete(@PathVariable("noteId") Long noteId, @PathVariable("stickyNoteId") Long stickyNoteId) {
        this.noteService.delete(noteId);
        return "redirect:/sticky-note/" + stickyNoteId;
    }

    @GetMapping("")
    public String myNotes(Model model) {
        List<NoteDTO> allNotes = this.noteService.getAllNotes();
        model.addAttribute("notes" , allNotes);
        return "my-notes";
    }
}
