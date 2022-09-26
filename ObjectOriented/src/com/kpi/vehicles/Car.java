package com.kpi.vehicles;

public class Car extends Vehicle {

	@Override
	void type() {
		System.out.println("This is a Car");
		
	}

	@Override
	int seats() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	String breakType() {
		// TODO Auto-generated method stub
		return "power";
	}
	
	int height;
	String color;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
