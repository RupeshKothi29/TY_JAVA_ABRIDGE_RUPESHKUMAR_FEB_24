package com.capgemini.assignment.day1;

public class Factorial {
	static int factorial(int j) {
		int fact = 1;
		for (int i = 1; i <= j; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int value = factorial(5);
		System.out.println(value);
	}
}
