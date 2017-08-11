package com.cc.entity;

/**
 * 
 * @Description 
 * @author chenchen
 * @Date 2017年8月10日 上午10:00:38
 * @version 1.0.0
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
