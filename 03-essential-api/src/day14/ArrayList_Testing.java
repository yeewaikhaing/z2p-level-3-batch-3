package day14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Testing {

	public static void main(String[] args) {
		
		// create empty arraylist
		ArrayList<Integer> list = new ArrayList<>();
		//var list = new ArrayList<>();
		
		// add an element
		list.add(100);
		list.add(50);
		list.add(20);
		list.add(10);
		
		System.out.println("No of items: " + list.size());
		System.out.println(list);
		
		// add with specific index
		list.add(1, 300);
		
		System.out.println("After add, [1]: " + list.get(1));
		System.out.println("Adter add, [2]: " + list.get(2));
		
		// display all items with foreach
		list.forEach( num -> System.out.println(num));
		
		// update element
		list.set(0, 250);
		System.out.println("After update, [0]: " + list.get(0));
		
		System.out.println("List is empty?: " + list.isEmpty());
		
		System.out.println("Size before remove: " + list.size());
		
		// remove element
		list.remove(1);
		System.out.println("Size after remove: " + list.size());
		System.out.println(list);
		
		System.out.println("Max value: " + Collections.max(list));
		System.out.println("Min value: " + Collections.min(list));
		
		// remove all element
		list.clear();
		System.out.println("After remove all element, " + list.isEmpty());
		System.out.println("Size: " + list.size());
		
		
		
		
	}
}
