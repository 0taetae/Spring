package com.ssafy.ws;

public class Driver {

	private Car car;

	
	 public Driver() {
		super();
	}

	public void setCar(Car car) {
	 	this.car = car;
	 }

	 public void drive() {
	 	System.out.println(this.car.getInfo() + "를 운전합니다.");
	 }
}
