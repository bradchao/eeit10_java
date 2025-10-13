package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.ispan.apis.BCrypt;

public class Brad10 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_LOGIN = """
			SELECT id, account,passwd,name FROM member
			WHERE account = ?
		""";	
	
	
	public static void main(String[] args) {
		System.out.println("Member Login");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Account:");
		String account = scanner.next();
		System.out.print("Password:");
		String passwd = scanner.next();
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(URL, prop);) {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL_LOGIN);
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String hashPasswd = rs.getString("passwd");
				if (BCrypt.checkpw(passwd, hashPasswd)) {
					System.out.printf("Welcome, %s\n", rs.getString("name"));
				}else {
					System.out.println("Login Failure(2)");
				}
			}else {
				System.out.println("Login Failure(1)");
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
