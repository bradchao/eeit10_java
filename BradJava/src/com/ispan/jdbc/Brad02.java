package com.ispan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Brad02 {
	public static void main(String[] args) {
		String url = "";
		try {
			Connection conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
