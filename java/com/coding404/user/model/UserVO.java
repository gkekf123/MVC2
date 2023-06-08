package com.coding404.user.model;

import java.sql.Timestamp;

public class UserVO {

	/*
	 * 자바빈과 동일
	 * 데이터베이스의 값을 처리하기 위한 클래스 	
	 */
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String gender;
	private Timestamp refdate;
	
	// 생성자 2개
	public UserVO() {
		
	}

	public UserVO(String id, String pw, String name, String email, String gender, Timestamp refdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.refdate = refdate;
	}

	// getter / setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getRefdate() {
		return refdate;
	}

	public void setRefdate(Timestamp refdate) {
		this.refdate = refdate;
	}
	
	
	
	
}
