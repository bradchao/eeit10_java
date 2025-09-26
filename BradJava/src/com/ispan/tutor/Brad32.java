package com.ispan.tutor;

public class Brad32 {
	public static void main(String[] args) {
		//Brad321 obj1 = new Brad321();
		Brad321 obj2 = new Brad322();
		obj2.m1();obj2.m2();obj2.m3();
		
		Brad321 obj3 = new Brad321() {
			void m3() {System.out.println("Brad321:m3()");}
		};
		obj3.m3();
	}
	
	static void test(Brad321 obj) {
		obj.m3();
	}
}

abstract class Brad321 {
	void m1() {System.out.println("Brad321:m1()");}
	void m2() {System.out.println("Brad321:m2()");}
	abstract void m3();
}
class Brad322 extends Brad321 {
	void m3() {System.out.println("Brad322:m3()");}
}
class Brad323 extends Brad321 {
	void m3() {System.out.println("Brad323:m3()");}
}
