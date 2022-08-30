package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest5 {

	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		
		ArithmeticException exception = assertThrows(ArithmeticException.class, ()->calculator.divide(5, 0));
		assertEquals("/ by zero", exception.getMessage());
	}

}
