package com.learning;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileWriterTest5 {

	@TempDir
	private File directory;

	@Test
	public void testWrite() throws IOException {
		FileWriter writer = new FileWriter();
		File output = new File(directory, "abc.txt");
		writer.write(output);
		
		List<String> allLines = Files.readAllLines(output.toPath());
		
		assertEquals(Arrays.asList("Hello", "World"), allLines);
	}

}
