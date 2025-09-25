package com.ispan.tutor;

public class Brad28 {
	public static void main(String[] args) {
		Brad281 obj1 = new Brad281();
		obj1.m1();
		obj1.m1();
		obj1.m1();
	}
}
class Brad281 {
	int a = 123;
	{System.out.println("Brad281:{} a = " + a);}
	static {System.out.println("Brad281:static{}");}
	Brad281(){System.out.println("Brad281()");}
	void m1() {System.out.println("Brad281.m1()");}
	static void m2() {System.out.println("Brad281.m2()");}
}
