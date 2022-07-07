package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringBuffer_Testing {

	public static void main(String[] args) throws IOException {
		StringBuffer buffer = new StringBuffer("Java Programming");
		
		buffer.append(" Language");
		
		System.out.println("After append, buffer: " + buffer);
		
		buffer.insert(5, "is a ");
		System.out.println("After insert, buffer: " + buffer);
		
		buffer.replace(0, 4, "PHP");
		System.out.println("After replace, buffer: " + buffer);
		
		System.out.println("index of 'Language': " + buffer.indexOf("Language"));
		System.out.println("substring: " + buffer.substring(40));
		System.out.println("No of characters: " + buffer.length());
		
		int mark = 100;
		System.out.println("You got " + mark + " marks");
		if(mark >= 50) {
			System.out.println("Exam fail");
		}
		
		BufferedReader reader = null;
		
		String name = reader.readLine();
	}
}
