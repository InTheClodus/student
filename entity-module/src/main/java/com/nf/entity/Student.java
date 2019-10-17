package com.nf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class Student {
	 
	private Integer id;
	private String userName;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birt;
	private Integer age;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getBirt() {
		return birt;
	}
	public void setBirt(Date birt) {
		this.birt = birt;
	}
	
	
	
}
