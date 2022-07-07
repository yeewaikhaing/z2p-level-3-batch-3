package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData_bufferreader {

	public static void main(String[] args) throws IOException {
		// create obj
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// operations
		System.out.print("Enter name: ");
		String name = reader.readLine();
		System.out.print("Enter salary: ");
		int salary = Integer.parseInt(reader.readLine());
		System.out.print("Enter bonus rate: ");
		float bonus = Float.parseFloat(reader.readLine());		
		// close obj
		reader.close();
		
		System.out.println("\n----- Your data ----");
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus rate: " + bonus);
	}
}
