package com.capgemini.quiz.day4;

public class Question_4 {
	public String function(String temp,int data) {
		return("Question_4");
	}
	private String function(int data,String temp) {
		return("This is Question_4");
	}
	public static void main(String[] args) {
		Question_4 q=new Question_4();
		System.out.println(q.function(4,"Question_4"));
	}
}
