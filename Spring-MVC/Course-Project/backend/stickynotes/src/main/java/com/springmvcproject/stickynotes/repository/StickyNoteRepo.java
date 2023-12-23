package com.springmvcproject.stickynotes.repository;

import com.springmvcproject.stickynotes.model.entity.StickyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StickyNoteRepo extends JpaRepository<StickyNote, Long> {
}
