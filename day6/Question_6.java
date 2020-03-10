package com.capgemini.quiz.day6;

public interface Question_6 {
	default void bus1() {
		System.out.println("Pick up");
		System.out.println("drop");
		System.out.println("park at kalimandir");
	}
	default void bus2() {
		System.out.println("pick up ");
		System.out.println("Drop");
		System.out.println("park at suncity");
	   }
}
