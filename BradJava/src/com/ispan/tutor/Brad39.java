package com.ispan.tutor;

import java.util.HashMap;
import java.util.Set;

import com.ispan.apis.Bike;

public class Brad39 {
	public static void main(String[] args) {
		HashMap<String, Object> person = new HashMap<>();
		person.put("name", "Brad");
		person.put("gender", true);
		person.put("age", 18);
		person.put("w", 80.4);
		person.put("bike", new Bike());
		System.out.println(person.get("name"));
		person.put("age", 28);
		System.out.println(person.get("age"));
		System.out.println("----");
		
		Set<String> keys = person.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + person.get(key));
		}
		
		
		
		
	}
}
