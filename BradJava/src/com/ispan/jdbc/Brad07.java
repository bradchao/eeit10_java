package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad07 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/iii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sqlInsert = """
				INSERT INTO cust 
					(cname, tel, birthday) 
				VALUES 
					(?,?,?)
				""";
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			
			PreparedStatement pstmt = conn.prepareStatement(sqlInsert);
			
			pstmt.setString(1, "Mark");
			pstmt.setString(2, "222");
			pstmt.setString(3, "1999-10-10");
			int n = pstmt.executeUpdate();
			System.out.println("OK:" + n);
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
