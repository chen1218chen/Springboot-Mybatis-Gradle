package com.cc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.entity.User;
import com.cc.service.UserService;
import com.github.pagehelper.PageHelper;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Description 
 * @author chenchen
 * @Date 2017年8月10日 上午9:57:03
 * @version 1.0.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method=RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/show",method=RequestMethod.GET)
    @ResponseBody
    public String show() {
        return userService.show();
    }
    
    @ApiOperation(value="根据年龄查找用户", notes="根据age来查找")
    @ApiImplicitParam(paramType="query", name = "age", value = "用户age", required = true, dataType = "Integer")
    @RequestMapping(value="/index",method=RequestMethod.POST)  
    @ResponseBody
    public List<User> selectAge(@RequestParam(value="age", required=true) int age){  
        /*  
         * 第一个参数是第几页；第二个参数是每页显示条数。  
         */  
        PageHelper.startPage(1,2);  
        return userService.showDao(age);  
    }  
    
    @ApiOperation(value="根据姓名查找用户", notes="根据name来查找")
    @ApiImplicitParam(paramType="query", name = "name", value = "用户姓名", required = true, dataType = "String")
    @RequestMapping(value="/findByName",method=RequestMethod.POST) 
    @ResponseBody
    public List<User> findByName(@RequestParam(value="name", required=true) String name){  
        /*  
         * 第一个参数是第几页；第二个参数是每页显示条数。  
         */  
        PageHelper.startPage(1,2);  
        System.out.println(userService.fingByName(name));
        return userService.fingByName(name);  
    } 
    
    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = "/queryAll",method=RequestMethod.GET)
    @ResponseBody
    public List<User> queryAll() {
        return userService.findAll();
    }

    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String insert(String name, int age) {
        return userService.insert(name, age);
    }
}
