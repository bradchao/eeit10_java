package com.ispan.jdbc;

import com.ispan.apis.BCrypt;

public class Brad08 {

	public static void main(String[] args) {
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPasswd);
		String input = "123457";
		if (BCrypt.checkpw(input, hashPasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		
	}

}
