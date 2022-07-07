package day3;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food name: ");
		String name = sc.nextLine();
		String category;
		switch(name) {
			case "burger", "pizza","sandwich" :
					category = "Fast food";
					break;
			case "yogurt" ,"milk tea":
				category = "Dessert";
				break;
			case "mohinga" :
				category = "Burmese Food";
				break;
			case "sushi" :
				category = "Japanese Food";
				break;
			default:
				category = "unknown";
		}
		System.out.println(name + " is " + category);
		
		boolean result = (3 == 4) && (3 < 4);
		sc.close();
	}
}
