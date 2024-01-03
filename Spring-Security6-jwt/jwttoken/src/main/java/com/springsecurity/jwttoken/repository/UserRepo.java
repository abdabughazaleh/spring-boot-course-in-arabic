package com.springsecurity.jwttoken.repository;

import com.springsecurity.jwttoken.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}
