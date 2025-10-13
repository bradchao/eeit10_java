package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Brad07 {
	private static final String url = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL = """
			SELECT id, name, city, town, addr
			FROM gift
			ORDER BY id
			LIMIT ?, ?
			""";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Page:");		// 1~
		int page = scanner.nextInt();
		
		final int rpp = 7;	// rows per page
		int start = (page - 1) * rpp;
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, start);
			pstmt.setInt(2, rpp);			
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				String town = rs.getString("town");
				String addr = rs.getString("addr");
				System.out.printf("%s : %s : %s%s%s\n", 
						id, name, city, town, addr);
			}			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
