package com.ispan.tutor;

public class Brad12 {

	public static void main(String[] args) {
		int a;
		int[] b;
		a = 10;
		b = new int[3];
		System.out.println(a);
		System.out.println(b);
		b[1] = 213;
		b[2] = 100;
		b[0] = 12;
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("----");
		// for-each
		for (int v : b) {
			System.out.println(v);
		}
		
		
		
	}

}
