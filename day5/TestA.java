package com.capgemini.quiz.day5;

public class TestA extends Question_1 {
	public void set(int a) {
		this.a=a;
	}
	final public void get() {//final method cannot be overridden
		System.out.println("a = "+a);
	}
	public static void main(String[] args) {
		TestA t=new TestA();
		t.set(20);
		t.get();
	}
}
