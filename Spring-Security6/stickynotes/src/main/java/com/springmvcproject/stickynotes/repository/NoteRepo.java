package com.springmvcproject.stickynotes.repository;

import com.springmvcproject.stickynotes.model.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepo extends JpaRepository<Note, Long> {
    List<Note> findAllByStickyNoteIdOrderByIdDesc(Long id);
}
