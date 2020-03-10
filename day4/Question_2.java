package com.capgemini.quiz.day4;

public class Question_2 {
	public int getData(String temp) throws IOException{
		//methods that throws different exceptions are not overloaded
		//as their signature are still the same
		return 0;
	}
	public int getData(String temp) throws Exception{
		return 1;
	}
	public static void main(String[] args) {
		Question_2 q= new Question_2();
		System.out.println("Question_2");
	}
}
