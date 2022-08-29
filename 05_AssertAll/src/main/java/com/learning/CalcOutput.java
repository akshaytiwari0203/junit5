package com.learning;

public class CalcOutput {

	private int multiplicationResult;
	private int additionResult;

	public CalcOutput(int multiplicationResult, int additionResult) {
		super();
		this.multiplicationResult = multiplicationResult;
		this.additionResult = additionResult;
	}

	public int getMultiplicationResult() {
		return multiplicationResult;
	}

	public int getAdditionResult() {
		return additionResult;
	}

	@Override
	public String toString() {
		return "CalcOutput [multiplicationResult=" + multiplicationResult + ", additionResult=" + additionResult + "]";
	}

}
