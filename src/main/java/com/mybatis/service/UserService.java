package com.mybatis.service;

import com.mybatis.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    int deleteById(Long id);

    void saveOrUpdate(User user);

    User findById(Long id);

}
