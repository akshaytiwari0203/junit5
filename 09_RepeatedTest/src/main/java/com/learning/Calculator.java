package com.learning;

public class Calculator {

	public int multiply(int number, int multiplier) {
		int result = 0;
		for (int i = 0; i < multiplier; i++) {
			result += number;
		}
		return result;
	}

}
