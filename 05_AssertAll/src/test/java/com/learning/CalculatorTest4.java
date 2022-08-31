package com.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest4 {
	
	
	
	@Test
	public void testMultiplyAndAddPositiveNumbers() {
		Calculator calculator = new Calculator();
		CalcOutput result =calculator.multiplyAndAdd(5, 3);
		assertEquals(15, result.getMultiplicationResult());
		assertEquals(8, result.getAdditionResult());
	}
	
	@Test
	public void testMultiplyAndAddByOne() {
		Calculator calculator = new Calculator();
		CalcOutput result = calculator.multiplyAndAdd(5, 1);
		assertEquals(5, result.getMultiplicationResult());
		assertEquals(6, result.getAdditionResult());
	}
	
	@Test
	public void testMultiplyAndAddByZero() {
		Calculator calculator = new Calculator();
		CalcOutput result = calculator.multiplyAndAdd(5, 0);
		assertEquals(0, result.getMultiplicationResult());
		assertEquals(5, result.getAdditionResult());
	}
	
	@Test
	public void testMultiplyAndAddByNegative() {
		Calculator calculator = new Calculator();
		CalcOutput result = calculator.multiplyAndAdd(5, -5);
		assertEquals(-25, result.getMultiplicationResult());
		assertEquals(0, result.getAdditionResult());
	}

}
