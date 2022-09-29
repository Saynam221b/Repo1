package com.kpi.overloadingoverriding;

public class AdditionOfTwo {
	//overloading
		public int add(int x, int y) {
			
			return (x+y);
		}
		//overloading
		public int add(int x, int y, int z) {
			
			return (x+y+z);
		}
		//overloading
		public int add(int x, int y, int z, int a) {
			
			return (x+y+z+a);
	}
		
public static void main(String args[]) {
	AdditionOfTwo a1 = new AdditionOfTwo();
	
	System.out.println(a1.add(2,3));
	System.out.println(a1.add(2,3,4));
	System.out.println(a1.add(1,2,3,4));
}

	}


