package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest4 {
	
	@Test
	void testMultiplyPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 3);
		assertEquals(15, result);
	}
	
	@Test
	void testMultiplyByOne() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 1);
		assertEquals(5, result);
	}
	
	@Test
	void testMultiplyByZero() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 0);
		assertEquals(0, result);
	}
	
	@Test
	void testAddPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 3);
		assertEquals(8, result);
	}
	
	@Test
	void testAddwithOne() {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 1);
		assertEquals(6, result);
	}
	
	@Test
	void testAddWithZeroZero() {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 0);
		assertEquals(5, result);
	}

}
