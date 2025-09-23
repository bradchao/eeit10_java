package com.ispan.tutor;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		final int nums = 52;
		int[] poker = new int[nums];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = nums - 1; i > 0; i--) {
			int r = (int)(Math.random()*(i+1));
			// poker[i] <=> poker[r]
			int temp = poker[i];
			poker[i] = poker[r];
			poker[r] = temp;
		}
		
//		for (int card: poker) {
//			System.out.println(card);
//		}
		
		//-------------------------------
		int[][] players = new int[4][13];
		for (int i=0; i<nums; i++) {
			players[i%4][i/4] = poker[i];
		}
		System.out.println("-----");

		String[] patterns = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A ","2 ", "3 ","4 ", "5 ","6 ", "7 ",
					"8 ", "9 ","10", "J ","Q ", "K "};
		
		for (int[]  player : players) {
			Arrays.sort(player);
			for (int card : player) {
				System.out.printf("%s%s  ", patterns[card/13], values[card%13] );
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
