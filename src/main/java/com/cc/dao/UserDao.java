package com.cc.dao;

import com.cc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 
 * @Description 
 * @author chenchen
 * @Date 2017年8月10日 上午10:00:12
 * @version 1.0.0
 */

@Mapper
public interface UserDao {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "password", column = "password")
    })
    @Select("SELECT * FROM user WHERE age = #{age}")
    List<User> get(int age);

    @Select("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
    void insert(User user);

    @Select("select * from user")
	List<User> findAll();

	@Select("select * from user where name = #{name}")
	List<User> findByName(String name);
}
