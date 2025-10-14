package com.ispan.jdbc;

import java.awt.geom.RectangularShape;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Brad18 {
	private static final String url = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL = """
			SELECT id, name, city, town, addr, feature
			FROM gift
			""";
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			PreparedStatement pstmt = conn.prepareStatement(SQL,
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE
					);
			ResultSet rs = pstmt.executeQuery();

			rs.next();
			System.out.println(rs.getString("name"));
			rs.next();
			System.out.println(rs.getString("name"));
			rs.previous();
			System.out.println(rs.getString("name"));
			rs.absolute(10);
			System.out.println(rs.getString("name"));
			
			rs.updateString("feature", "很好吃, 不買後悔");
			rs.updateString("addr", "海邊");
			rs.updateRow();
			
			rs.absolute(12);
			System.out.println(rs.getString("name"));
			rs.deleteRow();
			
			rs.moveToInsertRow();
			rs.updateString("name", "不來的禮盒");
			rs.updateString("feature", "報難吃, 不買後悔");
			rs.insertRow();
			
			
			
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
