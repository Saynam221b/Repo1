package com.kpi.interfaces;

public interface Addition {
	
	default int sum(int a, int b) {
		
		//System.out.println(a*b);
		return (a+b);
	}

}
