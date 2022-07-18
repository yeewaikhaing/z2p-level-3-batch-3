package day8;

public class PhoneDemo {

	public static void main(String[] args) {
		
		// creating object
		Phone phone1 = new Phone("iPhone", 1500000, "purple");
		Phone phone2 = new Phone("Samsung", 1300000, "white");
		Phone phone3 = new Phone("Vivo", 1000000, "black");
		
		System.out.println("------ Phone 1's Info-----\n");
		System.out.println("Brand: " + phone1.brand);
		System.out.println("Color: " + phone1.color);
		System.out.println("Price: " + phone1.price + " ks.");
		
		phone1.call();
		phone1.sendSms();
		
		System.out.println("\n------ Phone 2's Info-----\n");
		System.out.println("Brand: " + phone2.brand);
		System.out.println("Color: " + phone2.color);
		System.out.println("Price: " + phone2.price + " ks.");
		
		phone2.call();
		phone2.sendSms();
		
		
		System.out.println("------ Phone 3's Info-----\n");
		System.out.println("Brand: " + phone3.brand);
		System.out.println("Color: " + phone3.color);
		System.out.println("Price: " + phone3.price + " ks.");
		
		phone3.call();
		phone3.sendSms();
		
		
		
		Phone.shop = "ABC";
		
		System.out.println("Phone2's shop name: " + phone2.shop);
		
	}
}
