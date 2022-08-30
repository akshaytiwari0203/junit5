package com.learning;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculatorTest5 {

	private Calculator calculator = null;

	@BeforeEach
	void init() {
		calculator = new Calculator();
	}

	@Test
	@Timeout(6)
	void testAddPositiveNumbers() throws Exception {

		String result = calculator.add(1, 2);
		assertTrue(result.contains("3"));

	}

}
