package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {
	  @Test
	     public void ans() {
		  Palindrome p = new Palindrome();
			boolean ans = p.findPalindrome(121);
		    assertEquals(true, ans);
	     }
	
	

}
