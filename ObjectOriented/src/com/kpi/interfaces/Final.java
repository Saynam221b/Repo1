package com.kpi.interfaces;

public class Final extends AddAbstract {



	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("This is a abstract class");
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Final();
		System.out.println("Addition of number is "+a.sum(3, 4));
		
		AddAbstract ab = new Final();
		ab.name();
		
	}

}
