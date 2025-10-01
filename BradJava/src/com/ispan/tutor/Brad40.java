package com.ispan.tutor;

public class Brad40 {
	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;
		try {
			c = a / b;
		}catch(ArithmeticException e) {
			c = 0;
		}
		System.out.println(c);
	}
}
