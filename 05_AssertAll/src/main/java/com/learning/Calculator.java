package com.learning;

public class Calculator {

	public CalcOutput multiplyAndAdd(int number, int multiplier) {
		int multiplicationResult = 0;
		for (int i = 0; i < multiplier; i++) {
			multiplicationResult += number;
		}
		int additionResult = number + multiplier;

		return new CalcOutput(multiplicationResult, additionResult);
	}

}
