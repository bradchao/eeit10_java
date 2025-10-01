package com.ispan.tutor;

import java.io.File;
import java.io.IOException;

public class Brad43 {

	public static void main(String[] args) {
		File file = new File("d:/brad/test2");
		if (file.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			try {
				file.createNewFile();
				System.out.println("Create OK");
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
		
		
	}

}
