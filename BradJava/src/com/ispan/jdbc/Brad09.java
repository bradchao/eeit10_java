package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Brad09 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_CHECK = """
			SELECT account FROM member
			WHERE account = ?
		""";	
	private static final String SQL_INSERT = """
				INSERT INTO member 
					(account,passwd,name)
				VALUES 
					(?,?,?)
			""";	
	
	
	public static void main(String[] args) {
		System.out.println("Member Register");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Account:");
		String account = scanner.next();
		System.out.print("Password:");
		String passwd = scanner.next();
		System.out.print("Name:");
		String name = scanner.next();
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(URL, prop);) {
			
			//PreparedStatement pstmt = conn.prepareStatement(sql);
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
