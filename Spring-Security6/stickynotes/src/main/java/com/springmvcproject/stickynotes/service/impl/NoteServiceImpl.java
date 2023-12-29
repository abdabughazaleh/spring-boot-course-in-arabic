package com.springmvcproject.stickynotes.service.impl;

import com.springmvcproject.stickynotes.model.dto.AddNoteDTO;
import com.springmvcproject.stickynotes.model.dto.NoteDTO;
import com.springmvcproject.stickynotes.model.entity.Note;
import com.springmvcproject.stickynotes.model.mapper.NoteMapper;
import com.springmvcproject.stickynotes.repository.NoteRepo;
import com.springmvcproject.stickynotes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepo noteRepo;
    private final NoteMapper noteMapper;

    @Override
    public NoteDTO add(AddNoteDTO dto, Long stickyNoteId) {
        Note entity = this.noteMapper.toEntity(dto);
        entity.setStickyNoteId(stickyNoteId);
        Note savedEntity = this.noteRepo.save(entity);
        return this.noteMapper.toDTO(savedEntity);
    }

    @Override
    public List<NoteDTO> getAllNotes(Long stickyNoteId) {
        List<Note> notes = this.noteRepo.findAllByStickyNoteIdOrderByIdDesc(stickyNoteId);
        return this.noteMapper.toDTOs(notes);
    }

    @Override
    public void delete(Long id) {
        this.noteRepo.deleteById(id);
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        List<Note> notes = this.noteRepo.findAll();
        return this.noteMapper.toDTOs(notes);
    }
}
