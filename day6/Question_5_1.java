package com.capgemini.quiz.day6;

public class Question_5_1 {
	Question_5 op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Question_5();
		int rsquare = op.square(radius);// code reusability.
		return pi * rsquare;
	}
}
