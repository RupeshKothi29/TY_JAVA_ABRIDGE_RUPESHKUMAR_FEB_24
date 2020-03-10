package com.capgemini.assignment.array;

public class Double1 {
	public static void main(String[] args) {
		System.out.println("percentages of Ramesh");
		double[] ramesh = rameshPercentages();
		printPercentages(ramesh);
		System.out.println("**************************");
		System.out.println("percentages of Suresh");
		double[] suresh = sureshPercentages();
		printPercentages(suresh);

	}

	static void printPercentages(double[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

	static double[] rameshPercentages() {
		double[] percentages = { 64.21, 68.42, 74.31, 78.46 };
		return percentages;
	}

	static double[] sureshPercentages() {
		double[] percentages = { 68.21, 74.42, 98.01, 89.46 };
		return percentages;
	}

}
