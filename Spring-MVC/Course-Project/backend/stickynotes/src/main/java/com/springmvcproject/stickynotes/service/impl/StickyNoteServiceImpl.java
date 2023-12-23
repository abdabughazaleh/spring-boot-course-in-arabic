package com.springmvcproject.stickynotes.service.impl;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;

import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.entity.StickyNote;
import com.springmvcproject.stickynotes.model.enums.StickyNoteStatus;
import com.springmvcproject.stickynotes.model.mapper.StickyNoteMapper;
import com.springmvcproject.stickynotes.repository.StickyNoteRepo;
import com.springmvcproject.stickynotes.service.StickyNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StickyNoteServiceImpl implements StickyNoteService {

    private final StickyNoteRepo stickyNoteRepo;
    private final StickyNoteMapper stickyNoteMapper;
    @Override
    public AddStickyNoteDTO addStickyNote(AddStickyNoteDTO dto) {
        StickyNote entity = this.stickyNoteMapper.toEntity(dto);
        entity.setStatus(StickyNoteStatus.ACTIVE);
        StickyNote savedEntity = this.stickyNoteRepo.save(entity);
        AddStickyNoteDTO addStickyNoteDTO = this.stickyNoteMapper.toAddDto(savedEntity);
        return addStickyNoteDTO;
    }

    @Override
    public List<StickyNoteDTO> allStickyNotes() {
        List<StickyNote> all = this.stickyNoteRepo.findAll();
        return this.stickyNoteMapper.toDtos(all);
    }
}
