package com.ispan.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Brad66 {

	public static void main(String[] args) {
		String urlString = "https://www.gamer.com.tw";
		try {
			URL url = new URL(String.format("https://pdfmyurl.com/?url=%s", urlString));
			HttpsURLConnection conn =  (HttpsURLConnection)url.openConnection();
			
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(3*1000);
			conn.setReadTimeout(10*1000);
			
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] data =  bin.readAllBytes();
			bin.close();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir3/gamer.pdf"));
			bout.write(data);
			bout.flush();
			bout.close();
			
			System.out.println("OK2");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
