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

    @Test
    public void findByNameTest() {
        String name = "%李%";
        List<User> users = userMapper.findByName(name);
        System.out.println(users);
    }

    @Test
    public void findByNameAndAgeTest() {
        String name = "李";
        Integer min = 18;
        Integer max = 23;
        List<User> userList = userMapper.findByNameAndAge(name, min, max);
        System.out.println(userList);
    }
}
