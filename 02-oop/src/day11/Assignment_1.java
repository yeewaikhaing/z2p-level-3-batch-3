package day11;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		
		String[] division = {"Kachin","Kayar","Kayin","Chin","Sagaing","Tanintharyi","Bago","Magway","Mandalay","Mon","Rakhine","Yangon","Shan","Ayeyawady"};
		//System.out.println("len: " + division.length);
		try(Scanner sc = new Scanner(System.in)) {
			String nrcno;
			System.out.println("Enter your nrcno: ");
			nrcno = sc.nextLine();
			
			int index = Integer.parseInt(nrcno.substring(0,nrcno.indexOf("/")));
			String township = nrcno.substring(nrcno.indexOf("/") + 1, nrcno.indexOf("("));
			String number = nrcno.substring(nrcno.lastIndexOf(")") + 1);
			
			System.out.println("division/State: " + division[index - 1]);
			System.out.println("Township: " + township);
			System.out.println("number: " + number);
			System.out.println("\nNrcno: " + nrcno);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("Invalid state/division number");
		}
	}
}
