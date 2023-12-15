package com.udemycourse.springboot.demo2.controller;


import com.udemycourse.springboot.demo2.dao.UserDao;
import com.udemycourse.springboot.demo2.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {


    @Autowired
    private UserDao userDao;


    @GetMapping(path = "/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    @GetMapping(path = "/getAllByLastName")
    public List<UserEntity> getAllByLastName(@RequestParam String lastName) {

        return this.userDao.getAllByLastName(lastName);
    }

    @GetMapping(path = "/getAllByLastNameAndFirstName")
    public List<UserEntity> getAllByLastNameAndFirstName(
            @RequestParam String firstName,
            @RequestParam String lastName) {
        return this.userDao.getAllByLastNameAndFirstName(firstName, lastName);
    }

    @GetMapping(path = "/findAllByFirstNameStartingWith")
    public List<UserEntity> findAllByFirstNameStartingWith(
            @RequestParam String firstName) {
        return this.userDao.findAllByFirstNameStartingWith(firstName);
    }

    @GetMapping(path = "/findAllByFirstNameEndingWith")
    public List<UserEntity> findAllByFirstNameEndingWith(
            @RequestParam String firstName) {
        return this.userDao.findAllByFirstNameEndingWith(firstName);
    }

    @GetMapping(path = "/findAllByFirstNameContaining")
    public List<UserEntity> findAllByFirstNameContaining(
            @RequestParam String firstNameLke) {
        return this.userDao.findAllByFirstNameContaining(firstNameLke);
    }

    @GetMapping(path = "/findAllByLastName")
    public List<UserEntity> findAllByLastName(
            @RequestParam String firstName) {
        return this.userDao.findAllByLastName(firstName);
    }

    @GetMapping(path = "/findAllByOrderByFirstNameDesc")
    public List<UserEntity> findAllByOrderByFirstNameDesc() {
        return this.userDao.findAllByOrderByFirstNameDesc();
    }

    @GetMapping(path = "/findAllByOrderByFirstNameAsc")
    public List<UserEntity> findAllByOrderByFirstNameAsc() {
        return this.userDao.findAllByOrderByFirstNameAsc();
    }

    @GetMapping(path = "/getAllUsersBySortClass")
    public List<UserEntity> getAllUsersBySortClass() {
        return this.userDao.getAllUsersBySortClass();
    }

    @GetMapping(path = "/getAllByFirstName")
    public List<UserEntity> getAllByFirstName(@RequestParam String firstName) {
        return this.userDao.getAllByFirstName(firstName);
    }
    @GetMapping(path = "/findAllByFirstName")
    public List<UserEntity> findAllByFirstName(@RequestParam String firstName) {
        return this.userDao.findAllByFirstName(firstName);
    }
    @GetMapping(path = "/readAllByFirstName")
    public List<UserEntity> readAllByFirstName(@RequestParam String firstName) {
        return this.userDao.readAllByFirstName(firstName);
    }


}
