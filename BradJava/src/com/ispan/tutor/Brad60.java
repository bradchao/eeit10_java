package com.ispan.tutor;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad60 {
	public static void main(String[] args) {
		String mesg = "Hello, World";
		try (
			Socket socket = new Socket(InetAddress.getByName("10.0.103.238"), 9999);
			OutputStream out = socket.getOutputStream();
			BufferedOutputStream bout = new BufferedOutputStream(out);
			){
			bout.write(mesg.getBytes());
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
