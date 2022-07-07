package day7;

import java.util.Scanner;

public class UserException {

	int a; // default - 0
	int b = 19; // default - 19
	int c = 20 ;
	static int d;
	
	{ // instance block
		if(b == 19)
			c = 20;
		else
			c = 30;
	}
	
	static {// static block
		//a = 20;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			
			System.out.println("Enter your age: ");
			var age = sc.nextInt();
			validateAge(age);// exception
		}
		catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		
		if(age < 18) {
			throw new InvalidAgeException("Age must be at least 18.");
		}
		else {
			System.out.println("You can smoke!");
		}
		
	}
	
	// enterprise = security + reliability + multiuser + scable
	
	String[] numbers = {"1000", "200", "3", "5"};
}

class InvalidAgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
	public InvalidAgeException() {
		
	}
	
}
