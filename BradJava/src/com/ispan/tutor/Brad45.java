package com.ispan.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad45 {

	public static void main(String[] args) {
		String mesg = "Hello, Brad\n";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt", true);
			fout.write(mesg.getBytes());
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
