package com.kpi.overloadingoverriding;

public class Bike extends Car{

	@Override
	String work() {
		// TODO Auto-generated method stub
		return "Bike is working";
	}
	public static void main(String args[]) {
		//overriding
		Car v = new Bike();
		System.out.println(v.work());
		//overriding
		Vehicles c = new Car();
		System.out.println(c.work());
		
	}
	
}
