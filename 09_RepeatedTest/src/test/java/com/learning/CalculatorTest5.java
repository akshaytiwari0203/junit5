package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest5 {

	private Calculator calculator = null;

	@BeforeEach
	void init() {
		calculator = new Calculator();
	}

	@RepeatedTest(value = 3)
	void testAddPositiveNumbers() throws Exception {

		int result = calculator.multiply(1, 3);
		assertEquals(3, result);

	}

}
