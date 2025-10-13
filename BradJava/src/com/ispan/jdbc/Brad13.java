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
import com.ispan.apis.Bike;

public class Brad13 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_UPDATE = """
			UPDATE member
			SET bike = ?
			WHERE id = ?
		""";	
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.upSpeed().upSpeed().upSpeed().upSpeed();
		System.out.println(b1);
		
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(URL, prop);) {
			PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE);
			
			pstmt.setObject(1, b1);
			pstmt.setInt(2, 1);
			int n = pstmt.executeUpdate();
			System.out.println(n);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
