package com.ispan.jdbc;

public class Brad01 {
	public static void main(String[] args) {
		// Load Driver(skip)
		try {
			// com.microsoft.sqlserver.jdbc.SQLServerDriver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		// Connection
		
		// SQL
	}
}
