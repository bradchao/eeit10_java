package com.ispan.apis;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int ch, eng, math;
	private Bike bike;
	
	public Student(String name, int ch, int eng, int math) {
		this.name = name;
		this.ch = ch;
		this.eng = eng;
		this.math = math;
		bike = new Bike();
	}
	public int score() {return ch+eng+math;}
	public double avg() {return score()/3.0;}
	
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return String.format("%s : %d : %f", name, score(), avg());
	}
}
