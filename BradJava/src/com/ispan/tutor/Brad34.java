package com.ispan.tutor;

public class Brad34 {
	public static void main(String[] args) {
		Order order1 = new Order1("P001", 200);
		Order order2 = new Order2("P002", 210);
		order1.paid(); order1.notifyCust(); order1.process();
		System.out.println("---");
		order2.paid(); order2.notifyCust(); order2.process();
	}
}
interface Shipable {
	void ship();
}
abstract class Order {
	private String orderId;
	private int amount;
	Order(String orderId, int amount){
		this.orderId=orderId; this.amount = amount; 
	}
	void paid() {System.out.println("付款了");}
	void notifyCust() {System.out.println("通知客戶");}
	abstract void process();
}
class Order1 extends Order {
	Order1(String orderId, int amount){
		super(orderId,amount);
	}
	@Override
	void process() {
		System.out.println("數位商品出貨了");
	}	
}
class Order2 extends Order implements Shipable{
	Order2(String orderId, int amount){
		super(orderId,amount);
	}
	@Override
	void process() {
		ship();
		System.out.println("實體商品出貨了");
	}
	@Override
	public void ship() {
		System.out.println("實體商品寄出");
	}	
}



