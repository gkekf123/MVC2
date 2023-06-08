<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-idth, initial-scale=1">
   

    <title>Welcome to MyWorld</title>

    <!-- Bootstrap Core CSS -->
    <!-- 절대 경로로 변경 -->
    <link href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=request.getContextPath() %>/css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	<!-- jQuery -->
    <script src="<%=request.getContextPath() %>/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
    <script>
    $('.carousel').carousel({
        interval: 2000 //changes the speed
    })
    </script>
	<style>
	.abc {
		position: sticky;
		top: 0px;
		width: 100%; 
		z-index: 10;
	}
	</style>
    
    
</head>

<body>
	<!-- header -->
	<div class="brand">My Web</div>        
    <div class="address-bar">Welcome to MyWorld</div>
    
    <nav class="navbar navbar-default abc" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
                <a class="navbar-brand" href="/hong">My First Web</a>
            </div>
           
           
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                	
                    <li>
                        <a href="<%=request.getContextPath() %>/index.jsp">HOME</a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/member/member.jsp">Member</a>
                    </li>
                    <li>
                        <a href="">BOARD</a>
                    </li>
                    
                    <!-- JSTL로 변경 -->
                    <c:choose>
                    
                    	
                    	<c:when test="${sessionScope.user_id != null }"> 
                    		 <li>
                        		<a href="<%=request.getContextPath()%>/user/user_mypage.user">나의정보관리</a>
                    		</li>
                    		<!-- 컨트롤러를 거쳐서 나가야 하기 때문에 .jsp(x) / .user(o) -->
                    		<li>
                        		<a href="<%=request.getContextPath() %>/user/user_logout.user" style="color:red">로그아웃</a>
                    		</li>
                    	</c:when>
                    	
                    	
                    	<c:otherwise>
                    		<li>
                        		<a href="<%=request.getContextPath()%>/user/user_login.user">LOGIN</a>
                    		</li>
                    	<!-- 컨트롤러를 거쳐서 나가야 하기 때문에 .jsp(x) / .user(o) -->
                    		<li>
                        		<a href="<%=request.getContextPath() %>/user/user_join.user" style="color:red">JOIN</a>
                    		</li>
                    	</c:otherwise>

                    </c:choose>
                </ul>
            </div>
            
            
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
 	<!-- end header -->