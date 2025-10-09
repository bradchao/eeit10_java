package com.ispan.tutor;

public class Brad73 {
	public static void main(String[] args) {
		StoreV2 store = new StoreV2();
		ProducerV2 p = new ProducerV2(store);
		ConsumerV2 c1 = new ConsumerV2(store, "A");
		ConsumerV2 c2 = new ConsumerV2(store, "B");
		ConsumerV2 c3 = new ConsumerV2(store, "C");
		p.start();
		c1.start();
		c2.start();
		c3.start();
	}
}
class StoreV2 {
	private int qty;
	private final int MAX = 10;
	
	synchronized void add(int add) throws InterruptedException{
		System.out.printf("進貨中...%d\n", add);
		while (qty + add > MAX) {
			// wait...
			System.out.println("等候進貨中...");
			wait();
		}
		
		qty += add;
		System.out.printf("完成進貨(%d)....目前庫存量 %d\n", add, qty);
		notifyAll();
		
	}
	synchronized void buy(int buy, String name)  throws InterruptedException {
		System.out.printf("%s 買貨中...%d\n", name, buy);
		while (buy > qty) {
			// wait...
			System.out.println("等候買貨中...");
			wait();
		}
		qty -= buy;
		System.out.printf("%s 完成買貨(%d)....目前庫存量 %d\n", name, buy, qty);
		notifyAll();
	}
}

class ProducerV2 extends Thread {
	private StoreV2 store;
	public ProducerV2(StoreV2 store) {this.store = store;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
			try {
				store.add(5);
			} catch (InterruptedException e) {
			}
		}
	}
}
class ConsumerV2 extends Thread {
	private StoreV2 store;
	private String name;
	public ConsumerV2(StoreV2 store, String name) {this.store = store; this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
			
			try {
				store.buy((int)(Math.random()*5+1), name);
			} catch (InterruptedException e) {
			}
		}
	}
}






