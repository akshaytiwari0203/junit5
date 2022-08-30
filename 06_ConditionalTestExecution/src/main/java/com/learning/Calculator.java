package com.learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Calculator {

	public String add(int number1, int number2) throws Exception {
		return callScript(number1, number2);
	}

	private String callScript(int num1, int num2) throws Exception {
		String result = null;
		ProcessBuilder processBuilder = new ProcessBuilder();
		//processBuilder.inheritIO();
		processBuilder.redirectError();

		ProcessBuilder command = processBuilder.command(
				Arrays.asList("./src/main/resources/addNumbers.sh", String.valueOf(num1), String.valueOf(num2)));

		Process process = command.start();

		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

		String line = "";
		while ((line = br.readLine()) != null) {
			result += line;
		}

		process.waitFor();
		System.out.println(result);
		return result;

	}

}
