package com.mybatis.service;

import com.mybatis.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void saveOrUpdate(User user);

    void deleteById(Long id);
}
