package com.capgemini.quiz.day5;

public interface Question_7 {

	int i=222;
	interface Two{
		int i=Question_7.i+Question_7.i;
		interface Three{
			int i=Two.i+Two.i;
		}
	}
}
//to print the value of i 
//System.out.println(Question_7.Two.Three.i);
//value of i=888