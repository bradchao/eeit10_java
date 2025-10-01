package com.ispan.tutor;

public class Brad41 {
	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;
		int[] d = {1,2,3,4};
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[10]);
		}catch(Exception e) {
			System.out.println("Err");
		}
		System.out.println("End");
	}
}
