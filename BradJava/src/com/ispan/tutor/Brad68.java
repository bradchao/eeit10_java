package com.ispan.tutor;

public class Brad68 {
	public static void main(String[] args) {
		Brad681 obj1 = new Brad681();
		Brad681 obj2 = new Brad681();
		System.out.println("main start");
		obj1.start();
		obj2.start();
		System.out.println("main finish");
	}
}

class Brad681 extends Thread {
	void m1() {System.out.println("Brad681:m1()");}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
