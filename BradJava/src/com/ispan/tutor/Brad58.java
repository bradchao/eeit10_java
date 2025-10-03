package com.ispan.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad58 {

	public static void main(String[] args) {
		String mesg = "吃麥當當";
		byte[] data = mesg.getBytes();
		
		try (DatagramSocket socket = new DatagramSocket();){
			DatagramPacket packet = new DatagramPacket(data, data.length, 
					InetAddress.getByName("10.0.103.255"), 8888);
			socket.send(packet);
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
