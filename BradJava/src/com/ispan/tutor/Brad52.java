package com.ispan.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Brad52 {
	public static void main(String[] args) {
		try(
			FileInputStream fin = new FileInputStream("dir1/ns1hosp.csv");
			InputStreamReader isr = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(isr);
			){
			
			String line;
			while ( (line = br.readLine()) != null) {
				String[] data = line.split(",");
				System.out.printf("%s : %s : %s\n", data[2], data[4], data[7]);
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
