package com.ansul.thakur;

public class Student {
	MathCheat mathCheat;
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
	}
}
