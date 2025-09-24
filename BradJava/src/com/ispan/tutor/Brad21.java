package com.ispan.tutor;

import com.ispan.apis.Bike;
import com.ispan.apis.Scooter;

public class Brad21 {
	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		System.out.println(s1.getSpeed());
		s1.setGear(20);
		s1.upSpeed();s1.upSpeed();s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
		
		Bike b1 = new Bike();
		System.out.println(b1.getSpeed());
		
		
	}
}
