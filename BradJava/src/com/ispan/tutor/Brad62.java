package com.ispan.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad62 {
	public static void main(String[] args) {
		File file = new File("dir1/coffee.webp");
		
		try (
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));	
			
			Socket socket = new Socket(InetAddress.getByName("10.0.103.238"), 9999);
			OutputStream out = socket.getOutputStream();
			BufferedOutputStream bout = new BufferedOutputStream(out);
			){
			
			byte[] buf = bin.readAllBytes();
			bout.write(buf);
			
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
