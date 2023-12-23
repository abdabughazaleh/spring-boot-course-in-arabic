package com.springmvcproject.stickynotes.service;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StickyNoteService {
    AddStickyNoteDTO addStickyNote(AddStickyNoteDTO dto);
    List<StickyNoteDTO> allStickyNotes();
}
