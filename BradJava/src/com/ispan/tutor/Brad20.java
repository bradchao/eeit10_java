package com.ispan.tutor;

import com.ispan.apis.Bike;

public class Brad20 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		System.out.println("----");
		
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		b2.upSpeed();b2.upSpeed();b2.downSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		
		System.out.println("----");
		System.out.println(b1);
		System.out.println(b2);
		

	}

}
