package day7;

import java.util.Scanner;

public class Try_Finally {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//Scanner sc = null;
//		try {
//			
//			System.out.println("Enter salary: ");
//			var salary = sc.nextInt();// exception
//			if(salary == 0)
//				return;
//			System.out.println("Your salary is " + salary);
//			
//		}
//		catch (NullPointerException e) {
//			System.out.println("Object does not allocate in memory");
//		}
//		catch(Exception obj) {
//			System.out.println(obj.getMessage());
//		}
//		finally {
//			System.out.println("Finally block executed");
//			sc.close();
//		}
		
		System.out.println("Outside try finally block");
		
		System.out.println("----- try with resource statement ------");
		try(Scanner s = new Scanner(System.in);) {
			
			System.out.println("Enter name: ");
			var name = s.nextLine();
			System.out.println("Your name: " + name);
		}
		catch (Exception obj) {
			System.err.println(obj.getMessage());
		}
		
		
		display();
		
	}
	
	private static void display() throws NullPointerException {
		
	}
}
