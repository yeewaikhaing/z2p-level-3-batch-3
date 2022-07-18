package day9;

import java.time.LocalDate;

public class CopyConstructor {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1961, 10, 16);
		Book book = new Book("Detective U San Shar", date, 6000);
		System.out.println(book);
		Book book2 = new Book(book);
		System.out.println();
		System.out.println(book2);
		
		changePrice(book2);
		System.out.println("After change price, price = " + book2.price);
		int a = 100;
		changeVale(a);
		System.out.println("After change value, a = " + a);
	}

	private static void changeVale(int b) {// b = 100
		b = 300;
		
	}

	private static void changePrice(Book obj) {// obj  = book2
		obj.price = 10000;
		
	}
	
	//changePrice()
}

class Book {
	String title;
	LocalDate publishDate;
	int price;
	
	//title = "Detective U San Shar", p_date = date, price = 6000
	public Book(String title, LocalDate p_date, int price) {
		this.title = title;
		this.publishDate = p_date;
		this.price = price;
		//Book()
	}
	// obj = book
	public Book(Book obj) { // copy constructor
		this.title = obj.title;
		this.publishDate = obj.publishDate;
		this.price = obj.price;
	}
	@Override
	public String toString() {
		return "title = " + this.title + ",date = " +
					this.publishDate + ",price = " + this.price;
	}
}
