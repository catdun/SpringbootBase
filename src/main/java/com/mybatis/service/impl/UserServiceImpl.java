package com.mybatis.service.impl;

import com.mybatis.entity.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void saveOrUpdate(User user) {
        if (findById(user.getId())!=null){
            userMapper.update(user);
        }else {
            user.setCreateTime(new Date());
            userMapper.save(user);
        }
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteById(id);
    }


}
