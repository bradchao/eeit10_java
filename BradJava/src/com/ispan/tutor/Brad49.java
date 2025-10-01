package com.ispan.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Brad49 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			InputStreamReader isr = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(isr);
			
			String line; int i = 1;
			while ( (line = br.readLine()) != null) {
				System.out.println(i++ + ":" + line);
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
