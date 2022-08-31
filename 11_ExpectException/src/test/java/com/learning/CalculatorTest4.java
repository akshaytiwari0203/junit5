package com.learning;

import org.junit.Test;

public class CalculatorTest4 {

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		Calculator calculator = new Calculator();
		calculator.divide(5, 0);
	}

}
