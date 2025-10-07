package com.ispan.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad63 {

	public static void main(String[] args) {
		while (true) {
			try (
				ServerSocket server = new ServerSocket(9999);
				Socket socket = server.accept();
				BufferedInputStream bin = new BufferedInputStream(socket.getInputStream())
				){
				
				String urip = socket.getInetAddress().getHostAddress();
				byte[] buf = bin.readAllBytes();
				
				String filename = String.format("dir3/IP%s.jpg", urip);
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(filename));
				
				bout.write(buf);
				
				bout.flush();
				bout.close();
				
				System.out.println(urip + ": OK");
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
