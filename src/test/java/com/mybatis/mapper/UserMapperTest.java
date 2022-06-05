package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUserByIdTest() {
        Long id = 8544752L;
        User user = userMapper.findById(id);
        System.out.println(user.toString());
    }
}
