package com.learning;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest4 {

	private int numberA;
	private int numberB;
	private CalcOutput expected;

	public CalculatorTest4(int numberA, int numberB, CalcOutput expected) {
		super();
		this.numberA = numberA;
		this.numberB = numberB;
		this.expected = expected;
	}

	@Parameters(name = "multipying and adding {0} and {1} to expect result {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 5, 3, new CalcOutput(15, 8) }, { 5, 1, new CalcOutput(5, 6) },
				{ 5, 0, new CalcOutput(0, 5) }

		});
	}

	private Calculator calculator = null;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test
	public void testMultiplyAndAdd() throws Exception {

		CalcOutput result = calculator.multiplyAndAdd(numberA, numberB);
		assertEquals(expected.getMultiplicationResult(), result.getMultiplicationResult());
		assertEquals(expected.getAdditionResult(), result.getAdditionResult());

	}

}
