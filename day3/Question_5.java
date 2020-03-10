package com.capgemini.quiz.day3;

import java.io.IOException;

public class Question_5 {
	public void getDetails() throws IOException{
		System.out.println("Parent Class");
	}
}
class Test4 extends Question_5{
	public void getDetails() throws Exception{//Exception is More broader class of checked exception than IOException
		//so, this results in compilation error
		System.out.println("Test Class");
	}
	public static void main(String[] args) throws IOException {
		Question_5 q=new Test4();
		q.getDetails();
	}
}