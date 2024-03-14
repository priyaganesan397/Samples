package org.Deserialization;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader fileReader = new FileReader(new File ("C:\\Users\\priya\\eclipse-workspace\\JSONSamp\\src\\test\\java\\org\\json\\Sample1.java"));
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader,Root.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getType());
		System.out.println(readValue.getName());
		
		
		ArrayList<String> topping2 = readValue.getTopping();
		for (int i=0;i<topping2.size();i++) {
			System.out.println(topping2.get(i));
		}
		
		
	}

}
