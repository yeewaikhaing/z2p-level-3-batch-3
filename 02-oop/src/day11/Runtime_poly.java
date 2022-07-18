package day11;

public class Runtime_poly {

	public static void main(String[] args) {
		Developer dev = new Developer();
		
		dev.work();
		
		dev = new FrontendDeveloper();
		
		dev.work();
		
		dev = new BackendDeveloper();
		
		dev.work();
		
		// concrete or instance class
		
		//A obj = new A();
	}
}

class Developer {
	void work() {
		System.out.println("Some work");
	}
}

class FrontendDeveloper extends Developer {
	
	@Override
	void work() {
		System.out.println("Work with fontend technologies");
	}
}

class BackendDeveloper extends Developer {

	@Override
	void work() {
		System.out.println("Work with backend technologies");
	}
	
}

abstract class A {
	abstract void test();
	
}
abstract class C extends A {
	
}

class B extends A {

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}
	
}