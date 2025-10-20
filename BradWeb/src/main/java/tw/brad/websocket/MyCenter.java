package tw.brad.websocket;

import java.io.IOException;
import java.util.HashSet;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

//@ServerEndpoint("/mycenter")
public class MyCenter {
	private static HashSet<Session> sessions;
	private static boolean isExistTeacher = false;
	private static Session teacherSession;
	
	
	public MyCenter() {
		System.out.println("MyServer()");
		if (sessions == null) {
			sessions = new HashSet<>();
		}
	}

	@OnOpen
	public void onOpen(Session session) {
		//System.out.println("onOpen");
		if (sessions.add(session)) {
			//System.out.println("new session");
		}
	}
	
	@OnMessage
	public void onMessage(String mesg, Session session) {
		
		if (!isExistTeacher && mesg.contains("isTeacher")) {
			isExistTeacher = true;
			teacherSession = session;
			System.out.println("onMessage:" + mesg);
		}else if (session == teacherSession) {
			System.out.println("onMessage:" + mesg);
			
			for (Session userSession: sessions) {
				try {
					userSession.getBasicRemote().sendText(mesg);
				} catch (IOException e) {
					
				}
			}
		}
		
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("onClose");;
		sessions.remove(session);
	}
	
	@OnError
	public void onError(Session session, Throwable t) {
		System.out.println("onError:" + t.toString());;
	}
	
}
