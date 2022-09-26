package com.kpi.vehicles;

public class Bike extends Vehicle{

	@Override
	void type() {
		System.out.println("This is a bike");
	}

	@Override
	int seats() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	String breakType() {
		// TODO Auto-generated method stub
		return "abs";
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
