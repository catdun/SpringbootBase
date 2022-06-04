package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据id查用户详情
     * @param id 用户id
     * @return
     */
    User findById(Long id);

    List<User> findByName(String name);

    /**
     * 根据姓名模糊搜索和年龄阶段查用户详情
     * @param name 用户姓名模糊搜索条件
     * @param ageMin 用户最小年龄搜索条件
     * @param ageMax 用户最大年龄搜索条件
     * @return
     */
    List<User> findByNameAndAge(@Param("name") String name,
                                   @Param("ageMin") Integer ageMin,
                                   @Param("ageMax") Integer ageMax);

}
