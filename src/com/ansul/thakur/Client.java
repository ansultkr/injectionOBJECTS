package com.ansul.thakur;

public class Client {
	public static void main(String[] args) {
		Student s = new Student();
		MathCheat chit = new MathCheat();
		s.setMathCheat(chit);
		s.cheating();
	}
}
