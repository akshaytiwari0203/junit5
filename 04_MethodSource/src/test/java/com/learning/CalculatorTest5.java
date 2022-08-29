package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest5 {

	@ParameterizedTest(name = "multipying and adding {0} and {1} to expect result {2}")
	@MethodSource(value = "testData")
	void testMultiplyWithProperName(int number, int multiplier, CalcOutput expectedResult) {
		Calculator calculator = new Calculator();
		CalcOutput actualResult = calculator.multiplyAndAdd(number, multiplier);
		assertEquals(expectedResult.getMultiplicationResult(), actualResult.getMultiplicationResult());
		assertEquals(expectedResult.getAdditionResult(), actualResult.getAdditionResult());
	}

	static Stream<Arguments>  testData() {

		return Stream.of(Arguments.of(5, 3, new CalcOutput(15, 8)),
				Arguments.of(5, 1, new CalcOutput(5, 6)),
				Arguments.of(5, 0, new CalcOutput(0, 5)));

	}

}
