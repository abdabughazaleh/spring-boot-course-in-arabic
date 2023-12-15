package com.udemycourse.springboot.demo2.dao;

import com.udemycourse.springboot.demo2.entity.UserEntity;
import com.udemycourse.springboot.demo2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserDao {
    @Autowired
    private UserRepo userRepo;



    public List<UserEntity> getAllUsers() {
        return this.userRepo.findAll();
    }

    public List<UserEntity> getAllByLastName(String lastName) {
        return this.userRepo.findAllByLastName(lastName);
    }

    public List<UserEntity> getAllByLastNameAndFirstName(String firstName, String lastName) {
        return this.userRepo.findAllByFirstNameAndLastName(firstName, lastName);
    }

    public List<UserEntity> findAllByFirstNameStartingWith(String firstName) {
        return this.userRepo.findAllByFirstNameStartingWith(firstName);
    }

    public List<UserEntity> findAllByFirstNameEndingWith(String firstName) {
        return this.userRepo.findAllByFirstNameEndingWith(firstName);
    }

    public List<UserEntity> findAllByFirstNameContaining(String firstNameLike) {
        return this.userRepo.findAllByFirstNameContaining(firstNameLike);
    }

    public List<UserEntity> findAllByOrderByFirstNameDesc() {
        return this.userRepo.findAllByOrderByFirstNameDesc();
    }

    public List<UserEntity> findAllByOrderByFirstNameAsc() {
        return this.userRepo.findAllByOrderByFirstNameAsc();
    }

    public List<UserEntity> getAllUsersBySortClass(){
        return this.userRepo.findAll(Sort.by(Sort.Direction.ASC , "firstName","lastName"));
    }
    public List<UserEntity> getAllByFirstName(String firstName){
        return this.userRepo.getAllByFirstName(firstName);
    }
    public List<UserEntity> findAllByLastName(String firstName){
        return this.userRepo.findAllByLastName(firstName);
    }
    public List<UserEntity> findAllByFirstName(String firstName){
        return this.userRepo.findAllByFirstName(firstName);
    }
    public List<UserEntity> readAllByFirstName(String firstName){
        return this.userRepo.readAllByFirstName(firstName);
    }




}
