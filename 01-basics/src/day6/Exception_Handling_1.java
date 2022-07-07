package day6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exception_Handling_1 {

	public static void main(String[] args) {
		
//		try {
//			//display(100);
//			Scanner sc = null;
//			System.out.println("Enter number1: ");
//			int num1 = Integer.parseInt(sc.nextLine()); // NullpointerExeption a = new NullpointerEx(); throw a;
//			System.out.println("Enter number2: ");
//			int num2 = Integer.parseInt(sc.nextLine());
//			
//			var result = num1 / num2;// 100/0 ( ArithmenticException a = new ArithmeticExmpe(); throw a;
//			System.out.println("Result: " + result);
//			sc.close();
//		}
//		catch (ArithmeticException obj1) {// execute when exception occurs in try block
//			System.err.print("Divisor must not be zero");
//		}
//		catch (NumberFormatException obj2) {
//			System.err.print("User input is not a number");
//		}
//		catch (Exception obj3) {// can handle its subclass
//			System.err.println(obj3.getMessage());
//		}
//		
//		System.out.println("Outside try catch block");
		
		test();
		
	}

	private static void display(int i) {
		// TODO Auto-generated method stub
		
	}
	
	private static void test() {
		String[] days = {"Monday","Tuesday", "wednesday", "Thursday"};
		 
		var day = LocalDate.now().getDayOfWeek();
		System.out.println("before sort, " + Arrays.toString(days));
		Arrays.sort(days);
		System.out.println("After sort, " + Arrays.toString(days));
		 
		
		//LocalDate.now().getda
		System.out.println("current day: " + day);
		 String tmp = String.valueOf(day).toLowerCase();
		 List<String> list = Arrays.asList(days);
		 
		 if(list.contains(tmp))
			 System.out.println("today is weekday");
		 else
			 System.out.println("today is weekend");
	}
}
