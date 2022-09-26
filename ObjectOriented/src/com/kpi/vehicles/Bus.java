package com.kpi.vehicles;

public class Bus extends Vehicle {

	@Override
	void type() {
		System.out.println("This is a us");
		
	}

	@Override
	int seats() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	String breakType() {
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
