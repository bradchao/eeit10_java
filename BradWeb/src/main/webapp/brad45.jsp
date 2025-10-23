<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	try{
		String maxString = request.getParameter("max");
		int max = Integer.parseInt(maxString);
		out.print((int)(Math.random()*max+1));
	}catch(Exception e){}
%>