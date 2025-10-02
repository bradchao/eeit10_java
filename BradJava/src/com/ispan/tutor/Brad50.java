package com.ispan.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad50 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try (
				FileInputStream fin = new FileInputStream("dir1/coffee.webp");
				FileOutputStream fout = new FileOutputStream("dir2/coffee.webp")
			){
			
			int b;
			while ( (b = fin.read()) != -1) {
				fout.write(b);
			}
			
			System.out.println("OK:" + (System.currentTimeMillis() - start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
