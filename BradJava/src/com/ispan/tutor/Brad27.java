package com.ispan.tutor;

import com.ispan.apis.TWId;

public class Brad27 {

	public static void main(String[] args) {
		double rand = Math.random();
		System.out.println(rand);
		boolean isRightID = TWId.isRight("B423456789");
		System.out.println(isRightID);
		
		String id = "@223456789";
		System.out.println(id.matches("[A-Z][12][0-9]{8}"));
		
		
	}

}
