package com.keerthana.selenium;

public class Car extends Motor {
// field
	public int seatcount;
// constructor
	public Car(int gear, int speed, int seatcount) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		this.seatcount = seatcount;

	}
// method
	public void setcount(int count) {
		seatcount = count;

	}

}
