<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="delete" method="get">
		<input type = "hidden" name = "action" value ="delete">
		비밀번호<input type="password" name="password">
		<input type="hidden" name="no" value="${param.no }">
		<button type="submit">확인</button>
		<a href="./addList">메인으로 돌아가기</a>
	</form>
</body>
</html>