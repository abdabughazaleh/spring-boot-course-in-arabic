package com.springsecurity.jwttoken.config;

import com.springsecurity.jwttoken.model.entity.UserEntity;
import com.springsecurity.jwttoken.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;
    private final static String ROLE_PREFIX = "ROLE_";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("username {} ", username);
        Optional<UserEntity> user = this.userRepo.findByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        log.info("user {} ", user.get());
        String password = user.get().getPassword();
        log.info("password {} ", password);
        String role = user.get().getRole();
        log.info("before role {} ", role);
        role = ROLE_PREFIX + role;
        log.info("role with ROLE_PREFIX {} ", role);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(role));
        log.info("roles {} ", roles);
        return new CustomUserDetails(username, password, roles);
    }
}
