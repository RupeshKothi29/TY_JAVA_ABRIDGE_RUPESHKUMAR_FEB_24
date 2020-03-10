package com.capgemini.assignment.day1;

public class Palindrome {
	static int palindrome(int i) {
		int rev = 0, rem;
		while (i != 0) {
			rem = i % 10;
			rev = rev * 10 + rem;
			i = i / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int val = palindrome(162);
		System.out.println(val);
	}
}
