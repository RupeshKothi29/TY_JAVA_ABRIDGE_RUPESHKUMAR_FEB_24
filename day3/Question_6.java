package com.capgemini.quiz.day3;

public class Question_6 {
	public void getDetails() {
		System.out.println("Parent Class");
	}
}

class Test5 extends Question_6 {
	public void getDetails() {
		System.out.println("Test Class");
		super.getDetails();
	}

	public static void main(String[] args) {
		Question_6 q = new Test5();
		q.getDetails();
	}
}