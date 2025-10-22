<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<c:set var="x" value="10"></c:set>
		x = ${x }<br />
		<c:set var="x" value="123" scope="request"></c:set>
		x = ${pageScope.x }<br />
		x = ${requestScope.x }<br />
		<c:set var="y">100</c:set>
		y = ${y }<br />
		<hr />
		<c:out value="Hello, World"></c:out><br />
		param.x = ${param.x }<br />
		param.x = <c:out value="${param.x }" default="0"></c:out>
		<hr />
		<jsp:useBean id="member" class="tw.brad.apis.Member"></jsp:useBean>
		<c:set target="${member }" property="id">1</c:set>
		<c:set target="${member }" property="account">brad</c:set>
		<c:set target="${member }" property="passwd">123456</c:set>
		<c:set target="${member }" property="name">Brad</c:set>
		${member.id }:${member.account }:${member.passwd }:${member.name }<br />
		${member }<br />
		<hr />
		<c:remove var="member"/>
		${member }<br />
		
	</body>
</html>