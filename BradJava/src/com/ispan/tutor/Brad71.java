package com.ispan.tutor;

public class Brad71 {
	public static void main(String[] args) {
		Brad711 obj1 = new Brad711("A", 10);
		Brad711 obj2 = new Brad711("B", 20);
		obj1.start();
		obj2.start();
		System.out.println("main start");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		
		try {
			obj1.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("main finish");

	}
}
class Brad711 extends Thread {
	private String name;
	private int counter;
	
	Brad711(String name, int counter){
		this.name = name; this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i=0; i<counter; i++) {
			System.out.printf("%s: %d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
