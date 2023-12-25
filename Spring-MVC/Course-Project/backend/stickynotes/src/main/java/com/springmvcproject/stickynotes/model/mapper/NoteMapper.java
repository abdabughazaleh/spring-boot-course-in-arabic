package com.springmvcproject.stickynotes.model.mapper;

import com.springmvcproject.stickynotes.model.dto.AddNoteDTO;
import com.springmvcproject.stickynotes.model.dto.NoteDTO;
import com.springmvcproject.stickynotes.model.entity.Note;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NoteMapper {
    NoteDTO toDTO(Note entity);

    Note toEntity(NoteDTO dto);

    List<NoteDTO> toDTOs(List<Note> entities);

    Note toEntity(AddNoteDTO dto);
}
