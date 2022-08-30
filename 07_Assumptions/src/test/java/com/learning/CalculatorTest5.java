package com.learning;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest5 {
	
	private Calculator calculator = null;
	
	@BeforeEach
	void init() {
		calculator = new Calculator();
	}

	@Test
	void testAddPositiveNumbers() throws Exception {
		assumeTrue(isScriptPresent());
		String result = calculator.add(1, 2);
		assertTrue(result.contains("3"));
		
	}
	
	private boolean isScriptPresent() {
		File file = new File ("./src/main/resources/addNumbers.sh");
		return file.exists();
		
	}
	
	

}
