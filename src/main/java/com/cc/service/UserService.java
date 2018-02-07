package com.cc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cc.dao.UserDao;
import com.cc.entity.User;

/**
 * 
 * @Description 
 * @author chenchen
 * @Date 2017年8月9日 上午9:44:42
 * @version 1.0.0
 */

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String show() {
        return "Hello World!";
    }

    public List<User> showDao(int age) {
        return userDao.get(age);
    }

    public String insert(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userDao.insert(user);
        return "Insert ( \""+name+"\", age"+age+") OK!";
    }

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public List<User> fingByName(String name) {
		// TODO Auto-generated method stub
		return userDao.findByName(name);
	}


}
