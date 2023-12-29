package com.springmvcproject.stickynotes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddStickyNoteDTO {
    private String description;
    private String name;
    private String color;
}
