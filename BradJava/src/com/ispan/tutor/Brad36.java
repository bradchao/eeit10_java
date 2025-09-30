package com.ispan.tutor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Brad36 {
	public static void main(String[] args) {
		Set<Integer> lottery = new TreeSet<>();
		while (lottery.size() < 6) {
			lottery.add((int)(Math.random()*49+1));
		}
		System.out.println(lottery);
		System.out.println("----");
		Iterator<Integer> it = lottery.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----");
		for (Integer value : lottery) {
			System.out.println(value);
		}
	}
}
