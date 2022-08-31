package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
public class CalculatorTestDisplayNameGen {

	@Nested
	class MultiplicationTest {
		//@DisplayName(value = "Multiplying two positive numbers")
		@Test
		void test_Multiply_Positive_Numbers() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(5, 3);
			assertEquals(15, result);
		}

		//@DisplayName(value = "Multiplying a positive number by one")
		@Test
		void test_Multiply_By_One() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(5, 1);
			assertEquals(5, result);
		}

		//@DisplayName(value = "Multiplying a positive number by zero")
		@Test
		void test_Multiply_By_Zero() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(5, 0);
			assertEquals(0, result);
		}
	}

	@Nested
	
	class AdditionTest {
		
		//@DisplayName(value = "Adding two positive numbers")
		@Test
		void test_Add_Positive_Numbers() {
			Calculator calculator = new Calculator();
			int result = calculator.add(5, 3);
			assertEquals(8, result);
		}

		//@DisplayName(value = "Adding a positive number with one")
		@Test
		void test_Add_With_One() {
			Calculator calculator = new Calculator();
			int result = calculator.add(5, 1);
			assertEquals(6, result);
		}

		//@DisplayName(value = "Adding a positive number with zero")
		@Test
		void test_Add_With_Zero() {
			Calculator calculator = new Calculator();
			int result = calculator.add(5, 0);
			assertEquals(5, result);
		}
	}

}
