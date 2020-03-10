package com.capgemini.quiz.day5;

public class Question_10_1 {
	public static void main(String[] args) {
		Question_10 q=new Question_10();
		Question_10 q1=new Question_10();
		int a=2;
		q.add(a, a+1);
		q1.add(5, a);
		System.out.println(q.x+" "+q1.y);
	}
}
