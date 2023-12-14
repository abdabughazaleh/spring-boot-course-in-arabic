package com.udemycourse.springboot.demo2.repository;

import com.udemycourse.springboot.demo2.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    List<UserEntity> findAllByLastName(String lastName);

    List<UserEntity> findAllByFirstNameStartingWith(String firstName);

    List<UserEntity> findAllByFirstNameEndingWith(String firstName);

    List<UserEntity> findAllByFirstNameContaining(String firstNameLike);

    List<UserEntity> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<UserEntity> findAllByOrderByFirstNameDesc();

    List<UserEntity> findAllByOrderByFirstNameAsc();

    List<UserEntity> getAllByFirstName(String firstName);

    List<UserEntity> findAllByFirstName(String firstName);

    List<UserEntity> readAllByFirstName(String firstName);





}
