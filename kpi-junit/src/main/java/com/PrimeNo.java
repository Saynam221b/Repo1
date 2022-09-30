package com;

	public class PrimeNo {
		public boolean findPrime(int num) {
			boolean flag = false;
			
		    for (int i = 2; i < (num / 2); i++) {
		      if (num % i == 0) {
		        flag = true;
		      }
		    }
		    if(flag == true)
		    	return true;
		    else
		    	return false;
		  
		  } 
	}

