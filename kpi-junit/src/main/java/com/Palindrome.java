package com;

public class Palindrome {

	public boolean findPalindrome(int num) {

		int rem, temp;
		int ans = 0;

		temp = num;

		while (num > 0) {
			rem = num % 10;
			ans = (ans * 10) + rem;
			num = num / 10;
		}
		if (temp == ans)
			return true;
		else
			return false;

	}
}
