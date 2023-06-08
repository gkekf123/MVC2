package com.coding404.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coding404.user.model.UserVO;

public interface UserService {
	
	// interface는 클래스 연결자 역할
	// 추상메서드 - controller에서 받아오는 request, response
	
	int join(HttpServletRequest request, HttpServletResponse response);
	UserVO login(HttpServletRequest request, HttpServletResponse response);
	
	
	
}
