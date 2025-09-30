package com.ispan.tutor;

import java.util.HashSet;
import java.util.Set;

public class Brad37 {
	public static void main(String[] args) {
		Set<Brad371> set = new HashSet<>();
		set.add(new Brad372());
		set.add(new Brad373());
		set.add(new Brad374());
		System.out.println(set);
		for (Brad371 obj : set) {
			obj.m0();
			if (obj instanceof Brad372) {
				((Brad372)obj).m1();
			}else if (obj instanceof Brad373) {
				((Brad373)obj).m2();
			}else if (obj instanceof Brad374) {
				((Brad374)obj).m3();
			}
		}
	}
}
class Brad371 {
	void m0() {System.out.println("Brad371:m0()");}
}
class Brad372 extends Brad371{
	void m1() {System.out.println("Brad372:m1()");}
}
class Brad373 extends Brad371{
	void m2() {System.out.println("Brad373:m2()");}
}
class Brad374 extends Brad371{
	void m3() {System.out.println("Brad374:m3()");}
}