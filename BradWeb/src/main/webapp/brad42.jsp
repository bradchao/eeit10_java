<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="tw.brad.apis.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<c:catch var="err">
	<sql:setDataSource
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/iii"
		user="root"
		password="root" 
	/>
	
	<c:import 
		url="https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx"
		var="data"></c:import>
	<c:set var="foods" value="${BradUtils.parseFood(data) }"></c:set>
	
	<sql:update>DELETE FROM foods</sql:update>
	<sql:update>ALTER TABLE foods AUTO_INCREMENT = 1</sql:update>
	
	<c:forEach items="${foods }" var="food">
		${food.name }:${food.tel }:${food.addr }<br />
		<sql:update>
			INSERT INTO foods (name, tel, addr) VALUES (?,?,?)
			<sql:param>${food.name }</sql:param>
			<sql:param>${food.tel }</sql:param>
			<sql:param>${food.addr }</sql:param>
		</sql:update>
	</c:forEach>
			
</c:catch>    
<c:choose>
	<c:when test="${!empty err }">${err }</c:when>
	<c:otherwise>Finish</c:otherwise>
</c:choose>


