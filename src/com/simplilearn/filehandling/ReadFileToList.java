package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileToList {

	public static void main(String[] args) {
		
		ReadFileToList obj = new ReadFileToList();
		
		List<String> lines = obj.readFileIntoList("output.txt");
		System.out.println(lines);
		
		for(String line: lines) {
			System.out.println(line);
		}
	}

	List<String> readFileIntoList(String filename) {
		
		List<String> lines = Collections.emptyList();		
		try {
			lines = Files.readAllLines(Paths.get(filename),StandardCharsets.UTF_8);
		} catch (IOException e) {			
			System.out.println("File not found !");
		}
		
		return lines;
	}
}
