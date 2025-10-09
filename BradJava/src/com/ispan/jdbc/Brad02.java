package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Brad02 {
	public static void main(String[] args) {
		/*
		 *  "jdbc:sqlserver://localhost:1433;databaseName=MyDatabase;user=MyUser;password=MyPassword;";
		 */
		String url1 = "jdbc:mysql://localhost:3306/iii?user=root&password=root";
		String url2 = "jdbc:mysql://localhost:3306/iii";
		try {
			//Connection conn1 = DriverManager.getConnection(url1);
			//Connection conn2 = DriverManager.getConnection(url2, "root", "root");
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn3 = DriverManager.getConnection(url2, prop);
			System.out.println("OK3");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
