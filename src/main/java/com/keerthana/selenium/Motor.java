package com.keerthana.selenium;

public class Motor {
	public int gear;
	public int speed;

	public Motor(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void speeddowm(int decrease) {
		speed -=decrease;
	}
	public void speedup(int increase) {
		speed +=increase;
	}
	 
	

	@Override
	public String toString() {
		return "Motor [gear=" + gear + ", speed=" + speed + "]";
	}

}
      