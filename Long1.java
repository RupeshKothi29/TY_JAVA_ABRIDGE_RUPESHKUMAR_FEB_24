package com.capgemini.assignment.array;

public class Long1 {
	public static void main(String[] args) {
		System.out.println("Employee mobile numbers ");
		long[] empMobNo = employeeMobileNo();
		printMobileno(empMobNo);
		System.out.println("*********************************************");

		System.out.println("manager mobile numbers ");
		long[] mgrMobNo = managerMobileNo();
		printMobileno(mgrMobNo);

	}

	static void printMobileno(long[] n) {

		for (int i = 0; i < n.length; i++) {

			System.out.println(n[i]);
		}

	}

	static long[] managerMobileNo() {
		long[] mobileno = { 9908759395l, 9490834901l, 9989916402l };
		return mobileno;

	}

	static long[] employeeMobileNo() {
		long[] mobileno = { 8978408575l, 7013083752l, 8498076613l };
		return mobileno;

	}


}
