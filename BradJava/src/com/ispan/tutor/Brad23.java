package com.ispan.tutor;

public class Brad23 {
	public static void main(String[] args) {
		//Brad231 obj1 = new Brad231(2);
		Brad232 obj2 = new Brad232();
	}

}

class Brad231 extends Object {
	Brad231(int a){
		System.out.println("Brad231(int)");
	}
	Brad231(){
		this(2);
		System.out.println("Brad231()");
	}
}
class Brad232 extends Brad231 {
	Brad232(){
		System.out.println("Brad232()");
	}
}