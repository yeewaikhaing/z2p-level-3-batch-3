package day8;

public class Phone {

	// fields
	String brand;
	String color;
	int price;
	
	static String shop;
	
	// constructor
	//brand = "Vivo", price = 1000000, color = "black"
	public Phone(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	// methods
	public void call() {
		System.out.println("Phone calling can be made at here");
	}
	
	public void sendSms() {
		System.out.println("Message can be sent at here");
	}
	
	
}
