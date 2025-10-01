package com.ispan.tutor;

import java.io.File;
import java.io.FileInputStream;

public class Brad47 {
	public static void main(String[] args) {
		try {
			File file = new File("dir1/file1.txt");
			FileInputStream fin = new FileInputStream(file);
			
			byte[] buf = new byte[(int)file.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("err2:" + e.toString());
		}
	}
}
