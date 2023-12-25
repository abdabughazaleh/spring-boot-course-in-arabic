package com.springmvcproject.stickynotes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoteDTO {
    private Long id;
    private String note;
    private Long stickyNoteId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
