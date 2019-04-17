package com.neuedu.mybatisdemo.bean;

public class UserInfo {
	
	private int id;
	private String name;
	private int age;
	private String phone;
	private String email;
	
	
	public UserInfo() {
		super();
		// TODO 自动生成的构造函数存根
	}


	public UserInfo(int id, String name, int age, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}


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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
