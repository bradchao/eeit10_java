package com.ispan.tutor;

public class Brad33 {
	public static void main(String[] args) {

	}
}
interface Brad331 {
	void m1();
	void m2();
	void m3();
}
class Brad332 implements Brad331{
	public void m1() {}
	public void m2() {}
	public void m3() {}
}
interface Brad333 {
	void m4();
}
interface Brad334 extends Brad331, Brad333{
	void m5();
}
class Brad335 implements Brad333, Brad334{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	
}




