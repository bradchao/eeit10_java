package com.ispan.tutor;

import com.ispan.apis.Bike;

public class Brad30 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.upSpeed().upSpeed().upSpeed().upSpeed().downSpeed().downSpeed();
		System.out.println(b1.getSpeed());
	}

}
