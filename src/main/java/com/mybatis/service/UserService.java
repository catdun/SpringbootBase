package com.mybatis.service;

import com.mybatis.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findByName(String name);

    List<User> findByNameAndAge(String name,
                                   Integer ageMin,
                                   Integer ageMax);
}
