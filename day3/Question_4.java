package com.capgemini.quiz.day3;

public class Question_4 {
	public void getDetails() {
		System.out.println("Parent Class");
	}
}
class Test3 extends Question_4{
	protected void getDetails() {
		System.out.println("Test Class");
	}
	public static void main(String[] args) {
		Question_4 q=new Test3();
		q.getDetails();
	}
}
