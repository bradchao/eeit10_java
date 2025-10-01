package com.ispan.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Brad48 {
	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("dir1/file1.txt");
			
			int c;
			while ( (c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("err2:" + e.toString());
		}
	}
}
