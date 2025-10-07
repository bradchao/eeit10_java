package com.ispan.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad65 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/HL0K4PxM9M0SHMSn1qOztg--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTY0OTtjZj13ZWJw/https://media.zenfs.com/en/mook__193/f0dc6c57397ff59400af60ae64aa357e");
			URLConnection conn =  url.openConnection();
			
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] data =  bin.readAllBytes();
			bin.close();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir3/star.jpg"));
			bout.write(data);
			bout.flush();
			bout.close();
			
			System.out.println("OK");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
