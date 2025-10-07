package com.ispan.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad64 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ispan.com.tw");
			URLConnection conn =  url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			br.close();
			System.out.println("OK:" + sb.length());
			System.out.println(sb.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
