<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="tw.brad.apis.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<c:catch var="err">
	<sql:query var="rs" dataSource="northwind">
		SELECT 
			o.OrderDate, e.LastName, e.FirstName, c.CompanyName, c.ContactName,
		    od.ProductID, p.ProductName, od.UnitPrice, od.Quantity
		FROM orders o
		JOIN customers c ON o.CustomerID = c.CustomerID
		JOIN employees e ON o.EmployeeID = e.EmployeeID
		JOIN orderdetails od ON o.OrderID = od.OrderID
		JOIN products p ON od.ProductID = p.ProductID
		WHERE o.OrderID = ?
		<sql:param>${param.orderId }</sql:param>
	</sql:query>
	${BradUtils.order2JSON(rs.rows) }
</c:catch> 
${err }