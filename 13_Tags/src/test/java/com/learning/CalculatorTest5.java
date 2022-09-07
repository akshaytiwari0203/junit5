package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


public class CalculatorTest5 {

	@Test
	@Tag("CRITICAL")
	@Tag("FAST")
	void testMultiplyPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 3);
		assertEquals(15, result);
	}

	@Test
	@Tag("FUNCTIONAL")
	void testMultiplyByOne() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 1);
		assertEquals(5, result);
	}

	@Test
	@Tag("SLOW")
	void testMultiplyByZero() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 0);
		assertEquals(0, result);
	}

}
