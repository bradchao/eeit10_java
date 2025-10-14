package com.ispan.apis;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class GiftDB {
	private static Connection conn = null;
	private static final String QUERY_ALL = """
			SELECT id 編號, name 名稱, city 縣市, town 鄉鎮, addr 地址, feature 特色
			FROM gift
			""";
	private static ResultSet rs;
	private String[] fieldNames;
	 
	public GiftDB() throws Exception {
		conn = BradUtils.getConnection();
		queryDB();
	}
	
	public void queryDB() throws Exception{queryDB(QUERY_ALL);}
	
	public void queryDB(String sql) throws Exception{
		Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE
				);
		rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		fieldNames = new String[rsmd.getColumnCount()];
		for (int i=0; i<fieldNames.length; i++) {
			fieldNames[i] = rsmd.getColumnLabel(i+1);
		}
	}
	
	public int getRows() throws Exception{
		rs.last();
		return rs.getRow();
	}
	
	public int getCols() {
		return fieldNames.length;
	}
	
	public String getData(int row, int col) {
		try {
			rs.absolute(row + 1);
			return rs.getString(col + 1);
		}catch(Exception e) {
			System.out.println(e);
			return "ERROR";
		}
	}
	
	public String getColName(int col) {
		return fieldNames[col];
	}
	
	public void setData(Object aValue, int row, int column) throws Exception {
		rs.absolute(row + 1);
		rs.updateString(column +1, (String)aValue);
		rs.updateRow();
	}
	
	public void delData(int row) {
		try {
			rs.absolute(row + 1);
			rs.deleteRow();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
