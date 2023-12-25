package com.springmvcproject.stickynotes.advice;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalController {
    private final HttpServletRequest httpServletRequest;
    @ModelAttribute("urlPath")
    public String getPath(){
        return httpServletRequest.getServletPath();
    }

}
