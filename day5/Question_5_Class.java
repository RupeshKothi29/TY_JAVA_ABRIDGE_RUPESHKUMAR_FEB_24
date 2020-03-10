package com.capgemini.quiz.day5;

public class Question_5_Class implements Question_5{
	public void methodA() {
		interface c{//interfaces cannot be local members of a method
			int i=123;
		}
	}
}
