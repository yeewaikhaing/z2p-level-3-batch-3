package day9;

import java.util.Arrays;
import java.util.List;

public class CallingSuperConstructor {

	public static void main(String[] args) {
		String paragraph = "NLp techniques are becoming widely popular scientific research areas as well as Information Technology industry. Language technology together with Information Technology can enhance the lives of people with different capablities. This system implements voice command mobile phone dialer applcation. The strength of the system is that it can make phone call to the contact name written in either English scripts or Myanmar scripts.";	       
	    int wordsLength = paragraph.split(" ").length;	     
	    int senLength = paragraph.split("\\.").length;
	    int sentCount = 0;	     
	    System.out.println("No of character: " + paragraph.length());
	     int len = paragraph.length();
	    for (int i = 0; i < len; i++){
	            if (paragraph.charAt(i) == '.'){
	                 sentCount++;
	            }
	        }	            
	       System.out.println("The string has total " + sentCount + " sentences.");
	       System.out.println("The string has total " + wordsLength + " words.");	
	
	}
}

class Employee {
	private String name;
	public Employee() {
		
	}
	public Employee(String name) {
		this.name = name;
		System.out.println("This is emp constructor");
	}
}

class Teacher extends Employee {
	private String position;
	public Teacher(String na, String pos) {
		super(na);
		this.position = pos;
		System.out.println("This is teacher constructor");
	}
}

class Animal {
	private Animal() {
		
	}
}

