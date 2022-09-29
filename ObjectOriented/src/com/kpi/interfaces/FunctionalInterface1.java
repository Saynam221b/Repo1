package com.kpi.interfaces;
@FunctionalInterface
public interface FunctionalInterface1 {
	void u();
	
	
	static void user(){
		System.out.println("done");
	}
	
	//User <Integer> display = a -> System.out.println(a);
	
	//display.accept(10);
}
