package com.ispan.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad05 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx");
			URLConnection conn =  url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			//System.out.println("OK:" + sb.length());
			//System.out.println(sb.toString());
			
			parseJSON(sb.toString());
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void parseJSON(String json) {

		//-----------------------------
		String url = "jdbc:mysql://localhost:3306/iii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sqlInsert = """
				INSERT INTO gift 
					(name, feature, city, town, addr, lat, lng, picurl) 
				VALUES 
					(?,?,?,?,?,?,?,?)
				""";
		try (Connection conn = DriverManager.getConnection(url, prop);) {
			PreparedStatement pstmt = conn.prepareStatement(sqlInsert);

			JSONArray root = new JSONArray(json);
			System.out.println(root.length());
			for (int i=0; i<root.length(); i++) {
				JSONObject obj = root.getJSONObject(i);
				String name = obj.getString("Name");
				String feature = obj.getString("Feature");
				String city = obj.getString("County");
				String town = obj.getString("Township");
				String addr = obj.getString("SalePlace");
				String lat = obj.getString("Latitude");
				String lng = obj.getString("Longitude");
				String picurl = obj.getString("Column1");
				
				
				pstmt.setString(1, name);
				pstmt.setString(2, feature);
				pstmt.setString(3, city);
				pstmt.setString(4, town);
				pstmt.setString(5, addr);
				try {
					pstmt.setDouble(6, Double.parseDouble(lat));
					pstmt.setDouble(7, Double.parseDouble(lng));
				}catch(Exception e) {
					pstmt.setDouble(6, 0.0);
					pstmt.setDouble(7, 0.0);
				}
				pstmt.setString(8, picurl);
				
				pstmt.executeUpdate();
			}			
			
			System.out.println("OK");
			
		} catch (SQLException e) {
			System.out.println(e);
		}		
		
		
		
		
		
		
	}
}
