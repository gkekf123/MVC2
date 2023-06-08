<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<section>
	<div align="center">
		<h1>회원정보 페이지</h1><!-- 로그인 성공해야지만 들어올 수 있다 -->
		${sessionScope.user_id}
		(${sessionScope.user_name}) 님의 정보를 관리중 입니다
		
		<br/>
		<a href="#">회원수정</a>
		
		<a href="user_logout.user">로그아웃</a>
		
		<a href="#">회원탈퇴</a>
		
		
	</div>
</section>

<%@ include file="../include/footer.jsp" %>