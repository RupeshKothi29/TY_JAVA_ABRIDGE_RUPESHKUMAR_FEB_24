package com.capgemini.quiz.day4;

public class Question_3 {
	private String function() {
		return ("Question_2");
	}
	public final static String function(int data) {
		return("This is Question_2");
	}
	public static void main(String[] args) {
		Question_3 q=new Question_3();
		System.out.println(q.function());
	}
}
