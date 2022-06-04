package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/findByName/{name}")
    List<User> findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }

    @GetMapping("findByNameAndAge/{name}&{ageMin}&{ageMax}")
    List<User> findByNameAndAge(String name, Integer ageMin, Integer ageMax) {
        return userService.findByNameAndAge(name,ageMin,ageMax);
    }
}
