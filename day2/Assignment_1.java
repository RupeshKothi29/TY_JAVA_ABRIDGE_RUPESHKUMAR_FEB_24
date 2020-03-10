package com.capgemini.assignment.day2;

import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) {
		String name ;
		int age;
		long phoneno;
		String address;
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Choose 1 to Enter your Name");
			System.out.println("Choose 2 to Enter your Age");
			System.out.println("Choose 3 to Enter your phoneno");
			System.out.println("Choose 4 to Enter your Address");
			System.out.println("Choose 5 to Exit");
			int n=s.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter Your Name: ");
				name=s.next();
				System.out.println("");
				break;
			case 2:
				System.out.println("Enter your Age: ");
				age=s.nextInt();
				System.out.println("");
				break;
			case 3:
				System.out.println("Enter your Phoneno: ");
				phoneno=s.nextLong();
				System.out.println("");
				break;
			case 4:
				System.out.println("Enter your Address: ");
				address=s.next();
				System.out.println("");
				break;
			case 5:
				System.exit(0);
		}
			
	}
}
}