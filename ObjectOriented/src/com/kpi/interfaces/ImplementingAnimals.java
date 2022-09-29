package com.kpi.interfaces;

public class ImplementingAnimals implements Animals {

	@Override
	public String name() {
		System.out.println("Name of animal");
		return null;
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		System.out.println("Clr of animal");
		return null;
	}
	public static void main(String args[]) {
		
	Animals a = new ImplementingAnimals();	
	a.color();
	a.name();
}
			
}
