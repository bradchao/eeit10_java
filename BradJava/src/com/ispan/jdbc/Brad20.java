package com.ispan.jdbc;

public class Brad20 {
	public static void main(String[] args) {
		Brad201 obj = new Brad201();
		obj.m1();
	}
}
class Brad201 {
	void m1() {
		try {
			System.out.println(10 / 0);
			//return;
		}catch(Exception e) {
			System.out.println("XX");
			return;
		}finally {
			System.out.println("finally");
		}
		System.out.println("finish");
	}
}
