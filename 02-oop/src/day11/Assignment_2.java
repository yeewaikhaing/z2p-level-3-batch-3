package day11;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		
		String words = "do, does, will, can, may, is, are";
		String wh_question = "what, why, how, which, who, when";
		
		try(Scanner sc = new Scanner(System.in)) {
			String sentence;
			System.out.println("Enter a sentence: ");
			sentence = sc.nextLine();
			
			if(sentence.endsWith("?")) {
				System.out.println("This is question sentence");
				String[] data = sentence.split(" ");
				String first_word = data[0].toLowerCase();
				//System.out.println("word: " + first_word);
				if(wh_question.contains(first_word)) {
					first_word = data[1].toLowerCase();
				}
				
				if(words.contains(first_word)) {
					System.out.println("This is simple present tense");
				}
				else {
					System.out.println("This is not simple present tense");
				}
			}
			else {
				System.out.println("This is not question sentence");
			}
			
		}
		catch (Exception e) {
			System.err.print("Invalid state/division number");
		}
	}
}
