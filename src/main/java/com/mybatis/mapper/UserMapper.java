package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    User findById(Long id);


    void update(User user);

    void save(User user);

    void deleteById(Long id);
}
