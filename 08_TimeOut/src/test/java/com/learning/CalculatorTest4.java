package com.learning;



import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest4 {

	private Calculator calculator = null;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test(timeout = 4000)
	public void testAddPositiveNumbers() throws Exception {

		String result = calculator.add(1, 2);
		assertTrue(result.contains("3"));

	}

}
