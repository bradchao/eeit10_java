package com.ispan.apis;

public class TWId {
	private String id;
	
	public static boolean isRight(String id) {
		boolean isRight = false;
//		if (id.length() == 10) {
//			String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			char c1 = id.charAt(0);
//			if (letters.indexOf(c1) != -1) {
//				char c2 = id.charAt(1);
//				if (c2 == '1' || c2 == '2') {
//					//isRight = true;
//				}
//			}
//		}
		
		if (id.matches("[A-Z][12][0-9]{8}")) {
			String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			char c1 = id.charAt(0);
			int a12 = letters.indexOf(c1) + 10;
			int a1 = a12 / 10;
			int a2 = a12 % 10;
			String s1 = id.substring(1, 2);
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(id.substring(2, 3));
			
			
			
			
			
		}
		
		
		return isRight;
	}
	
}
