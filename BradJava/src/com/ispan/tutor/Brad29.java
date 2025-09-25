package com.ispan.tutor;

public class Brad29 {
	public static void main(String[] args) {
		Brad291 obj1 = new Brad291();
		obj1.m1();
		Brad291 obj2 = new Brad292();
		obj2.m1();
		Brad292 obj3 = (Brad292)obj2;
		obj3.m2();
		//Brad293 obj4 = (Brad293)obj2;
		//Brad293 obj4 = (Brad293)obj3;
		if (obj2 instanceof Brad294) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		Brad291 b1 = new Brad291();
		Brad292 b2 = new Brad292();
		Brad293 b3 = new Brad293();
		Brad294 b4 = new Brad294();
		test(b1);
		test(b2);
		test(b3);
		test(b4);
		
	}
	
	static void test(Brad291 obj) {
		obj.m1();
	}
	
	
}
class Brad291 {
	void m1() {System.out.println("Brad291:m1()");}
}
class Brad292 extends Brad291 {
	void m1() {System.out.println("Brad292:m1()");}
	void m2() {System.out.println("Brad292:m2()");}
}
class Brad293 extends Brad291 {
	void m1() {System.out.println("Brad293:m1()");}
}
class Brad294 extends Brad291 {
	void m1() {System.out.println("Brad294:m1()");}
}