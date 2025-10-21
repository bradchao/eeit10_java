<%@page import="tw.brad.apis.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member = new Member();
	member.setId(1);member.setAccount("brad");member.setPasswd("123456");
%>
<jsp:useBean id="member2" class="tw.brad.apis.Member"></jsp:useBean>
<jsp:setProperty property="id" value="2" name="member2"/>		
<jsp:setProperty property="account" value="mark" name="member2"/>		
<jsp:setProperty property="passwd" value="123456" name="member2"/>		

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		Member: <%= member.getId() %> :<%= member.getAccount() %>: <%= member.getPasswd() %><br />
		Member2:
			<jsp:getProperty property="id" name="member2"/> :
			<jsp:getProperty property="account" name="member2"/> :
			<jsp:getProperty property="passwd" name="member2"/> 
		<hr />
		Member2: <%= member2.getId() %> :<%= member2.getAccount() %>: <%= member2.getPasswd() %><br />
		Member: <%= member %><br />
		Member2: <%= member2 %>				
	</body>
</html>







