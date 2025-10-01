package com.ispan.tutor;

import java.math.MathContext;

import com.ispan.apis.TWId;

public class Brad27 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		System.out.println(id1.getId());
		TWId id2 = new TWId('L');
		System.out.println(id2.getId());
		TWId id3 = new TWId(false);
		System.out.println(id3.getId());
		TWId id4 = new TWId(true, 'Y');
		System.out.println(id4.getId());
		
		TWId id5 = TWId.createTWId("Y120239840");
		if (id5 != null) {
			System.out.println(id5.getId());
		}
		
		try {
			TWId id6 = TWId.createTWIdV2("Y120239840");
		} catch (Exception e) {
			System.out.println("XX");
		}
		
	}

}
