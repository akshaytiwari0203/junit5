package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest5 {

	@Nested
	class MultiplicationTest {
		//@DisplayName(value = "Multiplying two positive numbers")
		@Test
		void testMultiplyPositiveNumbers() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(5, 3);
			assertEquals(15, result);
		}

		//@DisplayName(value = "Multiplying a positive number by one")
		@Test
		void testMultiplyByOne() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(5, 1);
			assertEquals(5, result);
		}

		//@DisplayName(value = "Multiplying a positive number by zero")
		@Test
		void testMultiplyByZero() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(5, 0);
			assertEquals(0, result);
		}
	}

	@Nested
	class AdditionTest {
		
		@DisplayName(value = "Adding two positive numbers")
		@Test
		void testAddPositiveNumbers() {
			Calculator calculator = new Calculator();
			int result = calculator.add(5, 3);
			assertEquals(8, result);
		}

		@DisplayName(value = "Adding a positive number with one")
		@Test
		void testAddwithOne() {
			Calculator calculator = new Calculator();
			int result = calculator.add(5, 1);
			assertEquals(6, result);
		}

		@DisplayName(value = "Adding a positive number with zero")
		@Test
		void testAddWithZeroZero() {
			Calculator calculator = new Calculator();
			int result = calculator.add(5, 0);
			assertEquals(5, result);
		}
	}

}
