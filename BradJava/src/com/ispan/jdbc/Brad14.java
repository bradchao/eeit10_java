package com.ispan.jdbc;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.ispan.apis.Bike;

public class Brad14 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_QUERY = """
			SELECT id, account, bike
			FROM member
			WHERE id = ?
		""";	
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(URL, prop);) {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY);
			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				InputStream in = rs.getBinaryStream("bike");
				ObjectInputStream oin = new ObjectInputStream(in);
				Object obj = oin.readObject();
				Bike bike = (Bike)obj;
				System.out.println(obj);
				
				oin.close();
				
				System.out.println("OK");
				
			}else {
				System.out.println("NOT FOUND!");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
