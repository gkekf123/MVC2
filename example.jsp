<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- .test가 붙으면 다 실행 된다 -->
	<a href="add.test" >회원 추가기능</a>
	<a href="login.test">로그인 기능</a>
	<a href="/JSPBasic/controller/update.test">회원 수정기능</a>
	<a href="<%=request.getContextPath() %>/controller/getPw.test">비밀번호 찾기기능</a>

</body>
</html>