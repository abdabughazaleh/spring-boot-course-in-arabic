package com.springmvcproject.stickynotes.repository;

import com.springmvcproject.stickynotes.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}
