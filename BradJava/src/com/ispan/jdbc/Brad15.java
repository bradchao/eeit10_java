package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Brad15 {
	private static final String url = "jdbc:mysql://localhost:3306/northwind";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL = """
			SELECT o.EmployeeID, e.LastName, SUM(od.UnitPrice*od.Quantity) sum
			FROM `orders` o
				JOIN employees e ON o.EmployeeID = e.EmployeeID
			    JOIN orderdetails od ON o.OrderID = od.OrderID
			GROUP BY o.EmployeeID
			ORDER BY sum DESC
			""";
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("EmployeeID");
				String name = rs.getString("LastName");
				String sum = rs.getString("sum");
				System.out.printf("%s : %s : %s\n", 
						id, name, sum);
			}			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
