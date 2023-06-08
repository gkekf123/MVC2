package com.demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 1. 확장자패턴 =.test로 끝나면 전부 다 요청을 붗여준다

@WebServlet("*.test")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doAction(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	
	// 2. get / post 요청을 하나로 모음
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글처리
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		/* System.out.println("요청 : " + uri); */
		String conPath = request.getContextPath();
		
		String command = uri.substring(conPath.length());
		System.out.println(command);
		
	//3. 요청 분기
		if(command.equals("/controller/update.test")) {
			
			// 회원 추가 기능
			
		} else if(command.equals("/controller/login.test")) {
			
			// 회원 로그인 기능
			
		}
		
		// 생략...
		
	}
	
	
}
