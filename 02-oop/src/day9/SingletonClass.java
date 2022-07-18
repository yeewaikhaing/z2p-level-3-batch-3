package day9;

public class SingletonClass {

	private int a;
	public int b;
	protected int c;
	int d;
	public static void main(String[] args) {
		//private int c;
		DatabaseConfig obj = DatabaseConfig.getInstance();
		System.out.println(obj);
		
		DatabaseConfig obj2 = DatabaseConfig.getInstance();
		System.out.println(obj2);
	}
}

