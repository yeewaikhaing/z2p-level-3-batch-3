package day14.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {

	static List<String> categoryList = new ArrayList<>();
	static List<Author> authorList = new ArrayList<>();
	static List<Book> bookList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		initializeData();
		
		try(Scanner sc = new Scanner(System.in)) {
			String output = """
					1. View Author
					2. View Category
					3. View Book
					4. Add New Book
					Choose number(1 ~ 4): 
					""";
			System.out.print(output);
			int input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
			case 1: 
				viewAuthor();
				break;
			case 2:
				viewCategory();
				break;
			case 3:
				viewBook(sc);
				break;
			case 4:
				addBook(sc);
				break;
			default:
				System.err.println("Invalid number");
			};
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void addBook(Scanner sc) {
		
		
	}


	private static void viewBook(Scanner sc) {
		
		String output = """
				1. View All
				2. View by Category
				3. View by Author
				choose number(1, 2 or 3): 
				""";
		System.out.print(output);
		int input = Integer.parseInt(sc.nextLine());
		if(input == 1) {
			viewAllBook();
		}
		else if(input == 2) {
			System.out.print("Enter category name: ");
			String name = sc.nextLine();
			viewByCategory(name);
		}
		else if(input == 3) {
			System.out.print("Enter author name: ");
			String name = sc.nextLine();
			viewByAuthor(name);
		}
		else
			System.err.println("Invalid number");
	}


	private static void viewByAuthor(String name) {
		
		Author author = null;
		for(var auth : authorList) {
			if(auth.getName().equalsIgnoreCase(name)) {
				author = auth;
				break;
			}
		}
		
		if(author == null) {
			System.out.println(name + " does not exist");
		}
		else {
			var result_list = new ArrayList<Book>();
			for(var b : bookList) {
				if(b.getAuthor().getName().equalsIgnoreCase(name)) {
					result_list.add(b);
				}
			}
			
			if(result_list.size() > 0) {// found
				System.out.println("Code \tBook Title \tCategory \tPublish Date");
				System.out.println("--------------------------");
				result_list.forEach(obj -> {
					System.out.print(obj.getCode() + "\t");
					System.out.print(obj.getTitle() + "\t");
					System.out.print(obj.getCategory() + "\t");
					System.out.print(obj.getPublishDate() + "\n");
				});
			}
			else
				System.out.println("There is no books related to this author");
		}
		
	}


	private static void viewAllBook() {
		// TODO Auto-generated method stub
		
	}


	private static void viewByCategory(String name) {
		
		
	}


	private static void viewCategory() {
		// TODO Auto-generated method stub
		
	}


	private static void viewAuthor() {
		System.out.println("------ Author List ------");
		System.out.println("Author \tCountry");
		System.out.println("--------------------");
		authorList.forEach(obj -> {
			System.out.println(obj.getName() + " \t" + obj.getCountry());
		});
		
	}


	private static void initializeData() {
		
		// category
		categoryList.add("music");
		categoryList.add("movie");
		categoryList.add("cosmetic");
		categoryList.add("drinks");
		
		// author
		authorList.add(new Author("Jeon", "Korea"));
		authorList.add(new Author("Cherry", "Myanmar"));
		authorList.add(new Author("Chris", "India"));
		
		// book
		var book1 = new Book();
		book1.setCategory(categoryList.get(0));
		book1.setAuthor(authorList.get(0));
		book1.setCode(1001);
		book1.setPublishDate(LocalDate.of(2013, 10, 13));
		book1.setTitle("No more dream");
		
		var book2 = new Book();
		book2.setCategory(categoryList.get(1));
		book2.setAuthor(authorList.get(0));
		book2.setCode(1002);
		book2.setPublishDate(LocalDate.of(2018, 11, 19));
		book2.setTitle("Life goes on");
		
		bookList.add(book1);
		bookList.add(book2);
		
	}
}
