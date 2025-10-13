package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad06 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/iii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = """
				SELECT id, name, city country, town, addr
				FROM gift
				""";
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String country = rs.getString("country");
				String town = rs.getString("town");
				String addr = rs.getString("addr");
				System.out.printf("%s : %s : %s%s%s\n", 
						id, name, country, town, addr);
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
