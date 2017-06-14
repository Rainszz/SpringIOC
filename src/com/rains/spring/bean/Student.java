package com.rains.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * 对象的封装
 */

@Component
public class Student {
	private int sid;
	private String name;
	private String sex;
	private String address;
	private String idcard;
	
	public Student(int sid, String name, String sex, String address, String idcard) {
		super();
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.idcard = idcard;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
}
