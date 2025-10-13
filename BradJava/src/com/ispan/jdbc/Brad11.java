package com.ispan.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.ispan.apis.BCrypt;

public class Brad11 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_UPDATE = """
			UPDATE member
			SET icon = ?
			WHERE id = ?
		""";	
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (	FileInputStream fin = new FileInputStream("dir1/ball2.png");
				Connection conn = DriverManager.getConnection(URL, prop);) {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setBinaryStream(1, fin);
			pstmt.setInt(2, 2);
			int n = pstmt.executeUpdate();
			System.out.println(n);
		} catch (IOException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
