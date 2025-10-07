package com.ispan.tutor;

public class Brad68 {
	public static void main(String[] args) {
		Brad681 obj1 = new Brad681("A");
		Brad681 obj2 = new Brad681("B");
		Brad682 obj3 = new Brad682("C");
		Thread t1 = new Thread(obj3);
		System.out.println("main start");
		obj1.start();
		obj2.start();
		t1.start();
		
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
		}
		
		obj1.m1();
		
		System.out.println("main finish");
		
	}
}

class Brad681 extends Thread {
	private String name;
	Brad681(String name){this.name = name;}
	void m1() {System.out.println("Brad681:m1()");}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Brad682 implements Runnable {
	private String name;
	Brad682(String name){this.name = name;}
	void m1() {System.out.println("Brad682:m1()");}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

