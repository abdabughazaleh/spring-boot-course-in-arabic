package com.springmvcproject.stickynotes.service;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.UpdateStickyNoteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StickyNoteService {
    AddStickyNoteDTO addStickyNote(AddStickyNoteDTO dto);
    List<StickyNoteDTO> allStickyNotes();

    StickyNoteDTO findById(Long id);
    void update(UpdateStickyNoteDTO dto , Long id);
}
