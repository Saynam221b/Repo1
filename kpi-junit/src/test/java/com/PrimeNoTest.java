package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeNoTest {
     @Test
     public void checkPrimeNo() {
        PrimeNo sol = new PrimeNo();
		boolean ans = sol.findPrime(5);
        assertEquals(false, ans);
     }
}

