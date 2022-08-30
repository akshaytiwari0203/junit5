package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest5 {

	@Test
	@Order(value = 3)
	void testMultiplyPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 3);
		assertEquals(15, result);
	}

	@Test
	@Order(value = 1)
	void testMultiplyByOne() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 1);
		assertEquals(5, result);
	}

	@Test
	@Order(value = 2)
	void testMultiplyByZero() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 0);
		assertEquals(0, result);
	}

}
