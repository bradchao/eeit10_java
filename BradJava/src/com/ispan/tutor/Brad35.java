package com.ispan.tutor;

import java.util.HashSet;
import java.util.Set;

public class Brad35 {

	public static void main(String[] args) {
		Set set = new HashSet();
		System.out.println(set.size());
		set.add(123);	// int 123 => auto-boxing => new Integer(123)
		set.add(12.3);
		set.add("Brad");
		set.add(123);
		System.out.println(set.size());
		System.out.println(set);
		 
	}

}
