package com.ispan.tutor;

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

		for (int[]  player : players) {
			for (int card : player) {
				System.out.print(card + "  " );
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
