package com.capgemini.quiz.day3;

public class Question_2 {
	protected final void getDetails() {
		System.out.println("Parent Class");
	}
}
class Test1 extends Question_2{
	protected final void getDetails() {//final and static methods cannot cannot be overridden
		System.out.println("Test Class");
	}
	public static void main(String[] args) {
		Question_2 q=new Question_2();
		q.getDetails();
	}
}
