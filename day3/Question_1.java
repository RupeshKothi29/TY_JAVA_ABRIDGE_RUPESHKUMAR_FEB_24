package com.capgemini.quiz.day3;

public class Question_1 {
	private int data;
	private Question_1() {
		data=5;
	}
}
class Test{
	public static void main(String[] args) {
		Question_1 q=new Question_1();// a private constructor cannot be used to initialize
		//an object outside the class
		System.out.println(q.data);
	}
}
