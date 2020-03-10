package com.capgemini.quiz.day4;

public class Question_6 {
	private String function(String temp,int data,int sum) {
		return("Question_6");
	}
	private String function(String temp,int data) {
		return("This is Question_6");
	}
	public static void main(String[] args) {
		Question_6 q=new Question_6();
		System.out.println(q.function("Question_5", 0, 20));
	}
}
