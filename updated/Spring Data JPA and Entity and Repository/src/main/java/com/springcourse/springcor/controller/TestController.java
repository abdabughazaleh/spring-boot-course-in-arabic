package com.springcourse.springcor.controller;

import com.springcourse.springcor.dao.TestDao;
import com.springcourse.springcor.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController {


    @Autowired
    private TestDao testDao;


    @GetMapping("/test")
    public String getName() {
        return this.testDao.getName();
    }


    @GetMapping(path = "/get-users")
    public Iterable<TestEntity> getUsers() {
        return this.testDao.getUsers();
    }

    @GetMapping(path = "/find-user")
    // localhost?id=10
    public String getUserById(@RequestParam Integer userId) {
        Optional<TestEntity> user = this.testDao.getUserById(userId);
        if (user.isPresent()) {
            return "Full Name : " + user.get().getFullName()
                    + " Username : " + user.get().getUsername();
        } else {
            return "User ID Not Exist ! ";
        }
    }

    @GetMapping(path = "/delete-user")
    public String deleteUserById(@RequestParam Integer userId) {
        return this.testDao.deleteUserById(userId);
    }

    @PostMapping("/save-user")
    public TestEntity saveUser(@RequestBody TestEntity user) {
        return this.testDao.saveUser(user);
    }
    @PostMapping("/update-user")
    public TestEntity updateUser(@RequestBody TestEntity user) {
        return this.testDao.updateUser(user);
    }


}
