package com.ispan.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad51 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try (
				FileInputStream fin = new FileInputStream("dir1/coffee.webp");
				FileOutputStream fout = new FileOutputStream("dir3/coffee.webp")
			){
			
			int len; byte[] buf = new byte[4096];
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			System.out.println("OK:" + (System.currentTimeMillis() - start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
