package com.capgemini.quiz.day3;

public class Question_3 {
	public void getDetails(String temp) {
		System.out.println("Parent Class "+ temp);
	}
}
class Test2 extends Question_3{
	public int getDetails(String temp) {// the overriding method must have same signature 
		//includes ,argument list and the return type
		System.out.println("Test class "+ temp);
		return 0;
	}
	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.getDetails("Text");
	}
}