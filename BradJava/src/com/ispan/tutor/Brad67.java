package com.ispan.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad67 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			URLConnection conn =  url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			System.out.println("OK:" + sb.length());
			//System.out.println(sb.toString());
			
			parseJSON(sb.toString());
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void parseJSON(String json) {
		JSONArray root = new JSONArray(json);
		for (int i=0; i<root.length(); i++) {
			JSONObject obj = root.getJSONObject(i);
			String name = obj.getString("Name");
			System.out.println(name);
		}
		
		
	}
	
	
	

}
