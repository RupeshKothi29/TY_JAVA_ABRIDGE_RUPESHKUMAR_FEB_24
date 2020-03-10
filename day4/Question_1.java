package com.capgemini.quiz.day4;

public class Question_1 {
	public int getData() {//For method overloading,methods must have different 
		// signatures
		return 0;
	}

	public long getData() {
		return 1;
	}

	public static void main(String[] args) {
		Question_1 q = new Question_1();
		System.out.println(q.getData());
	}
}
