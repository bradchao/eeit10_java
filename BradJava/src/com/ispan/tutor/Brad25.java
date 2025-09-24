package com.ispan.tutor;

import com.ispan.apis.Bike;
import com.ispan.apis.Scooter;

public class Brad25 {

	public static void main(String[] args) {
		String s0 = new String();
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1.equals(s4));
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		
		
		

	}

}
