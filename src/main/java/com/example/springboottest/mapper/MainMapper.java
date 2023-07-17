package com.example.springboottest.mapper;

import com.example.springboottest.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {

    @Select("select * from users where username = #{username}")
    Student findByUsername(String username);
}
