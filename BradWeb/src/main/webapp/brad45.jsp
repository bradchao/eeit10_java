<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if (request.getMethod().equals("POST")){
		try{
			String maxString = request.getParameter("max");
			int max = Integer.parseInt(maxString);
			out.print((int)(Math.random()*max+1));
		}catch(Exception e){
			System.out.println(e.toString());
			out.print("ERROR:2");
		}
	}else{
		out.print("ERROR:1");
	}
%>