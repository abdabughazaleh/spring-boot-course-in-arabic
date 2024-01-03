package com.springsecurity.jwttoken.controller;

import com.springsecurity.jwttoken.config.JwtUtil;
import com.springsecurity.jwttoken.model.dto.UserLoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginDTO dto) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtUtil.generateToken(dto.getUsername());
        }
        return null;
    }

    @GetMapping("/test")
    public String test() {
        return "test working fine.";
    }

    @GetMapping("/api/only-admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String onlyAdmin() {
        return "only-admin ---> work.";
    }

    @GetMapping("/api/all-users")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public String allUsers() {
        return "all-users ---> work.";
    }

    @GetMapping("/api/only-users")
    @PreAuthorize("hasRole('USER')")
    public String onlyUser() {
        return "only-users ---> work.";
    }


}
