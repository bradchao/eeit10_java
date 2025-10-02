package com.ispan.apis;

import java.io.Serializable;

public class Bike extends Object implements Serializable{
	protected double speed;
	
	public Bike upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;
		return this;
	}
	public Bike downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
		return this;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	@Override
	public String toString() {
		return String.format("Speed = %f", speed);
	}
	
}
