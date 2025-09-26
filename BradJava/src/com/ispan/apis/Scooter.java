package com.ispan.apis;

public class Scooter extends Bike {
	private int gear;
	
	public Scooter(){
		System.out.println("Scooter()");
	}
	
	
	public Scooter upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.8 * gear;
		return this;
	}
	
	public void upSpeed(int level) {
		speed = speed < 1 ? 1 : speed * 1.8 * level;
	}	

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		if (gear >=0 && gear <= 4) {
			this.gear = gear;
		}
		//return this.gear;
	}
	


	



}
