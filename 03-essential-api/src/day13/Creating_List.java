package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Creating_List {

	public static void main(String[] args) {
		// create immutable empty list
		List<String> list1 = List.of();
		
		// create immutable data list
		List<String> list2 = List.of("Aung Aung", "Maung", "Hla");
		
		
		// create mutable empty List
		List<String> list3 = new ArrayList<>();
		
		System.out.println("No of element: " + list3.size());
		
		list3.add("Aung");
		list3.add("Maung");
		
		System.out.println("No of element: " + list3.size());
		
		Integer[] numbers = {100, 200, 300, 400};
		
		List<Integer> list4 = new ArrayList<>(Arrays.asList(numbers));
		
		System.out.println("No of element in list4: " + list4.size());
		
	}
}
