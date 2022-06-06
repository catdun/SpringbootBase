package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    int deleteById(Long id);

    int save(User user);

    int update(User user);

    User findById(Long id);
}
