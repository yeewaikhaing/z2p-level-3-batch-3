package day9;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(100);
		System.out.println("This is default constructor");
		//this(100);
	}
	
	public ConstructorChaining(int i) {// i = 200
		System.out.println("i = " + i);
	}
	
	public ConstructorChaining(int i, int j) {//i = 100, j = 200
		this(j);//this(200)
		System.out.println("i = " + i + ",j = " + j);
		
	}
	
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining(100, 200);
	}
}
