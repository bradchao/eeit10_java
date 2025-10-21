<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// ${} EL
%>    
<jsp:useBean id="member" class="tw.brad.apis.Member"></jsp:useBean>
<jsp:setProperty property="name" value="${param.name }" name="member"/>		
<jsp:setProperty property="account" value="${param.account }" name="member"/>		
<jsp:setProperty property="passwd" value="${param.passwd }" name="member"/>	  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Member: <%= member.getAccount() %>:<%= member.getPasswd() %>:<%= member.getName() %><br />
		Member:
			<jsp:getProperty property="account" name="member"/> :
			<jsp:getProperty property="passwd" name="member"/> :
			<jsp:getProperty property="name" name="member"/><br />
		${Math.random() }<br />
		${Math.PI }<br />
		${member }	
	</body>
</html>