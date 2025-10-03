package com.ispan.tutor;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad60 {

	public static void main(String[] args) {
		for (int i=0; i<65536; i++) {
			try {
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), i);
				System.out.println("OK:" + i);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("XX:" + i);
			}
		}
	}

}
