package com.learning;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class FileWriterTest4 {
	
	private File file = new File("abc.txt");

	@Test
	public void testWrite() throws IOException {
		FileWriter writer = new FileWriter();
		
		writer.write(file);
		
		List<String> allLines = Files.readAllLines(file.toPath());
		
		assertEquals(Arrays.asList("Hello", "World"), allLines);
	}
	
	@After
	public void cleanUp() {
		file.delete();
	}

}
