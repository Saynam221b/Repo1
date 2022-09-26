package com.kpi.vehicles;

public class Truck extends Vehicle{

	@Override
	void Type() {
		System.out.println("This is a Truck");
		
	}

	@Override
	int seats() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	String BreakType() {
		// TODO Auto-generated method stub
		return "Air break";
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
