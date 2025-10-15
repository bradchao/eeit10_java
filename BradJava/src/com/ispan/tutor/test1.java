package com.ispan.tutor;

public class test1 {

	public static void main(String[] args) {
		String sname = "Hello.java";
		if (sname.indexOf('.') != -1) {
			String[] aa = sname.split("\\.");
			System.out.println(aa.length);
		}
	}

}
