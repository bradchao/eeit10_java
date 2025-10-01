package com.ispan.tutor;

import java.io.File;

public class Brad44 {

	public static void main(String[] args) {
		File root = new File(".");
		System.out.println(root.getAbsolutePath());
		File dir1 = new File("dir3");
		if (dir1.exists() && dir1.isDirectory()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			dir1.mkdir();
		}
	}

}
