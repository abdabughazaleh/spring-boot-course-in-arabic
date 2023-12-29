package com.springmvcproject.stickynotes.service.impl;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.UpdateStickyNoteDTO;
import com.springmvcproject.stickynotes.model.entity.StickyNote;
import com.springmvcproject.stickynotes.model.enums.StickyNoteStatus;
import com.springmvcproject.stickynotes.model.mapper.StickyNoteMapper;
import com.springmvcproject.stickynotes.repository.StickyNoteRepo;
import com.springmvcproject.stickynotes.service.StickyNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        List<StickyNote> all = this.stickyNoteRepo.findAllByStatus(StickyNoteStatus.ACTIVE);
        return this.stickyNoteMapper.toDtos(all);
    }

    @Override
    public StickyNoteDTO findById(Long id) {
        Optional<StickyNote> entity = this.stickyNoteRepo.findById(id);
        return this.stickyNoteMapper.toDto(entity.get());
    }

    @Override
    public void update(UpdateStickyNoteDTO dto, Long id) {
        StickyNote entity = this.stickyNoteMapper.toEntity(dto);
        entity.setId(id);
        this.stickyNoteRepo.save(entity);
    }
}
