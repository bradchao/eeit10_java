package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad03 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/iii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sqlInsert = """
				INSERT INTO cust 
					(cname, tel, birthday) 
				VALUES 
					('Tony','123','1999-04-05'),
					('Amy','123','1999-04-05'),
					('Peter','123','1999-04-05')
				""";
		String sqlUpdate = """
				UPDATE cust
				SET 
					cname = 'Vivian',
					tel = '333'
				WHERE id = 3
				""";
		String sqlDel = """
				DELETE FROM cust
				WHERE id >= 5
				""";
		
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate(sqlDel);
			
			System.out.println("OK:" + n);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
