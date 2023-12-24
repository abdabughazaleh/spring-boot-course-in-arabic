package com.springmvcproject.stickynotes.model.mapper;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.UpdateStickyNoteDTO;
import com.springmvcproject.stickynotes.model.entity.StickyNote;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StickyNoteMapper {
    StickyNoteDTO toDto(StickyNote entity);

    StickyNote toEntity(StickyNoteDTO dto);

    List<StickyNote> toEntities(List<StickyNoteDTO> dtos);

    List<StickyNoteDTO> toDtos(List<StickyNote> entities);

    StickyNote toEntity(AddStickyNoteDTO dto);

    AddStickyNoteDTO toAddDto(StickyNote savedEntity);

    StickyNote toEntity(UpdateStickyNoteDTO dto);
}
