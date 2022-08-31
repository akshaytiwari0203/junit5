package com.learning;



import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CalculatorTest4 {
	
	@Test
	public void testMultiplyPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 3);
		assertEquals(15, result);
	}
	
	@Test
	public void testMultiplyByOne() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 1);
		assertEquals(5, result);
	}
	
	@Test
	public void testMultiplyByZero() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 0);
		assertEquals(0, result);
	}

}
