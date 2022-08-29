package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class CalculatorTest5 {
	
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/testData.csv" )
	void testMultiply(int number, int multiplier, int result) {
		Calculator calculator = new Calculator();
		int output = calculator.multiply(number, multiplier);
		assertEquals(result, output);
	}
	
	@Disabled
	@ParameterizedTest(name="multipying {0} and {1} to expect result {2}")
	@CsvFileSource(files = "src/test/resources/testData.csv" )
	void testMultiplyWithProperName(int number, int multiplier, int result) {
		Calculator calculator = new Calculator();
		int output = calculator.multiply(number, multiplier);
		assertEquals(result, output);
	}

}
