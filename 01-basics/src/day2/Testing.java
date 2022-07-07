package day2;

public class Testing {
	
	int num;// instance var
	static int price; // static var/field
	//var price = 0;
	void display() {
		int bar_code; // local variable
		var name = "Aung Aung";
		var rno = 1;
		//System.out.println("Barcode: " + bar_code);
		//int a = 20, b = 30;
		//var x = 20, y = 30;
	}
	public static void main(String[] args) {
		Testing.price = 10;
		
		Testing obj = new Testing();
		obj.num = 10;
		
		obj.num = 30;
		
		JavaMethod.static_method();
	}
}
