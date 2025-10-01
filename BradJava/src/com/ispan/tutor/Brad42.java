package com.ispan.tutor;

public class Brad42 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
		} catch (Exception e) {
			System.out.println("OK");
		}
	}
}
class Bird {
	int leg;
	void setLeg(int leg) throws Exception {
		if (leg >= 0 && leg <=2) {
			this.leg = leg;
		}else {
			throw new Exception();
		}
	}
}
