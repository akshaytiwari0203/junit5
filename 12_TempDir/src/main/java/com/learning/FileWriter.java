package com.learning;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class FileWriter {

	public void write(File file) throws IOException {
		
		List<String> lines = Arrays.asList("Hello", "World");
		Files.write(file.toPath(), lines);
	}

}
