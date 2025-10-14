package com.ispan.apis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class BradUtils {
	private static final String url = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	
	public static Connection getConnection() throws Exception {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		return DriverManager.getConnection(url, prop);
	}
}
