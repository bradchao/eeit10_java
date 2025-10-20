package tw.brad.websocket;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/myserver")
public class MyServer {

	@OnOpen
	public void onOpen(Session session) {
		System.out.println("onOpen");;
	}
	
	@OnMessage
	public void onMessage(String mesg, Session session) {
		System.out.println("onMessage");;
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("onClose");;
	}
	
	@OnError
	public void onError(Session session, Throwable t) {
		System.out.println("onError");;
	}
	
}
