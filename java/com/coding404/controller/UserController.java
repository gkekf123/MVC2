package com.coding404.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coding404.user.model.UserVO;
import com.coding404.user.service.UserService;
import com.coding404.user.service.UserServiceImpl;


// 1. 확장자 패턴으로 변경
@WebServlet("*.user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UserController() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); // 모은 후 호출
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); // 모은 후 호출
	}
	
	// 2. get / post를 하나로 모은다
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	// 3. 요청 분기
	// 한글처리
	request.setCharacterEncoding("UTF-8");
	String uri = request.getRequestURI();
	String conPath = request.getContextPath();
	String command = uri.substring(conPath.length());
	
	System.out.println(command);
	
	// MVC2에서는 화면을 띄우는 요청도 controller를 거치게 만들어야 된다
	// 기본 이동이 forward형식으로 처리를 한다
	// 리다이렉트는 다시 컨트롤러를 태워 나가는 용도로 사용한다
	
	// 필요한 객체를 if문 바깥에 선언 -> 재활용 할 수 있다
	// 회원 가입 - 인터페이스도 타입이 될 수 있다
			UserService service = new UserServiceImpl();
	
	/* join */
	if(command.equals("/user/user_join.user")) {
		request.getRequestDispatcher("user_join.jsp").forward(request, response);
		
		/* login */
	} else if(command.equals("/user/user_login.user")) {
		request.getRequestDispatcher("user_login.jsp").forward(request, response);
		
		/* 회원가입 */
	} else if(command.equals("/user/joinForm.user")) {
		service.join(request, response);
		
		/* 가입 */ 
		int result = service.join(request, response);
		
		if(result == 1) { // 중복
			
			// msg = 1회성
			request.setAttribute("msg", "중복 된 아이디 입니다");
			request.getRequestDispatcher("user_join.jsp").forward(request, response);
			
		} else { // 가입 성공
			/* 다시 컨트롤러로 돌아와 user_join.jsp로 나간다 */
			response.sendRedirect("user_login.user");
			
		}
		// 로그인
	} else if(command.equals("/user/loginForm.user")) {
		UserVO vo = service.login(request, response);
		
		if(vo == null) { // 로그인 실패
			
			request.setAttribute("msg", "아이디와 비밀번호를 확인 해 주세요");
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
			
		} else { // 성공
			
			// (자바에서 세션얻는 방법)sessiom에 데이터를 저장 - 현재 접속중인 세션을 반환
			HttpSession session = request.getSession();
			session.setAttribute("user_id", vo.getId());
			session.setAttribute("user_name", vo.getName());
			
			
			response.sendRedirect("user_mypage.user");
			
		}
		
		// 마이 페이지
	} else if(command.equals("/user/user_mypage.user")) {
		request.getRequestDispatcher("user_mypage.jsp").forward(request, response);
	
		// 로그아웃
	} else if(command.equals("/user/user_logout.user")) {
		HttpSession session = request.getSession();
		session.invalidate();
		request.getRequestDispatcher("user_login.user").forward(request, response);
		
	}
	
	}
	
	
	
	
	
	
}
