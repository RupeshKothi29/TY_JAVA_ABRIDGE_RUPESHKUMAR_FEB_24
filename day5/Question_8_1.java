package com.capgemini.quiz.day5;

public class Question_8_1 {
	public static void main(String[] args) {
		Question_8 q=new Question_8();
		q.cal(2, 3);
		System.out.println(q.x+" "+q.y);//the field access.y is not visible
	}
}
