<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../include/header.jsp" %>

<section>
	<div align="center">
	<h1>회원가입 연습</h1>
		<form action="joinForm.user" method="post">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" required="required" pattern="\w{3,}"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pw" required="required" pattern="\w{4,}"></td>
				</tr>
				<tr>
					<td>닉네임</td>
					<td><input type="text" name="name" ></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email" ></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
					<input type="radio" name="gender" value="M" checked="checked"> 남자
					<input type="radio" name="gender" value="F"> 여자
					</td>
				</tr>
			</table>
			
			<div style="color : red;">${msg }</div>
			
			<input type="submit" value="가입">
			<input type="reset" value="정보 초기화">
		</form>
	</div>
</section>

<%@ include file="../include/footer.jsp" %>