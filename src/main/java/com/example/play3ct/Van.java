package com.example.play3ct;

class Car{
	void state(){
		System.out.println("Car is runing...");
	}
}


public class Van extends Car {
	@Override
	void state(){
		System.out.println("Van is stop");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.state();
		
		car = new Van();
		car.state();
	}
}
