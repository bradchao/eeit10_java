package com.ispan.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad61 {

	public static void main(String[] args) {
		try (
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in))
			){
			
			String urip = socket.getInetAddress().getHostAddress();
			System.out.print(urip + ": ");
			
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
