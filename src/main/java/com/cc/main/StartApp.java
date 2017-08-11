package com.cc.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @Description 
 * @author chenchen
 * @Date 2017年8月10日 上午9:57:20
 * @version 1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.cc")
@MapperScan(basePackages = "com.cc.dao")
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
