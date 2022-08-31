package com.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest4 {

	@Parameterized.Parameters
	public static Object[][] data() {
		return new Object[3][0];
	}

	private Calculator calculator = null;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test
	public void testAddPositiveNumbers() throws Exception {

		int result = calculator.multiply(1, 3);
		assertEquals(3, result);

	}

}
