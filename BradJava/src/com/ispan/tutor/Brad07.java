package com.ispan.tutor;

public class Brad07 {

	public static void main(String[] args) {
		double temp = Math.random();
		//System.out.println(temp);
		
		int score = (int)(temp * 101);
		System.out.println(score);
		
		if (score >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}

	}

}
