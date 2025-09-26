package com.ispan.tutor;

public class Brad31 {
	public static void main(String[] args) {
		Brad311 brad = new Brad311("Brad");
		brad.setCh(100)
			.setEng(100)
			.setMath(100);
		System.out.println(brad.score());
		System.out.println(brad.avg());
	}
}
class Brad311 {
	private String name;
	private int ch, eng, math;
	
	Brad311(String name){
		this.name = name;
	}
	
	public int getCh() {
		return ch;
	}
	public Brad311 setCh(int ch) {
		this.ch = ch;
		return this;
	}
	public int getEng() {
		return eng;
	}
	public Brad311 setEng(int eng) {
		this.eng = eng;
		return this;
	}
	public int getMath() {
		return math;
	}
	public Brad311 setMath(int math) {
		this.math = math;
		return this;
	}
	public String getName() {
		return name;
	}
	
	public int score() {
		return ch+eng+math;
	}
	
	public double avg() {
		return score() / 3.0;
	}
	
	
}
