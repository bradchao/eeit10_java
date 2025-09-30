package com.ispan.tutor;

import java.util.LinkedList;
import java.util.List;

public class Brad38 {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		names.add(0,"Brad");
		names.add(0,"Andy");
		names.add(0,"Eric");
		names.add(0,"Tony");
		names.add(0,"Mark");
		System.out.println(names);
		System.out.println("----");
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
	}

}
