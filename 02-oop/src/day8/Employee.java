package day8;

public class Employee {

	static int noOfEmployee = 3; // static field
	static int nextId = 1; // static field
	final int empId; // final field
	String name; // instance field
	int salary; // instance field
	
	static final float BONUS = 2.5f; // const var
	
	public Employee() throws AppException {
		if(nextId > noOfEmployee) // 4 > 3
			throw new AppException("Sorry! Limited number has been reached");
		
		empId = nextId;
		nextId++;
	}
	
	public void initData(String name, int salary) {// "Aung Aung", 1400000
		this.name = name;
		this.salary = salary;
	}
	
	public void changeData(String new_name, int new_salary) {
		if(! name.equalsIgnoreCase(new_name))
			this.name = new_name;
		if( salary != new_salary)
			this.salary = new_salary;
	}
	
	public void showData() {
		System.out.println(empId + "\t" + name + "\t" + salary + " ks");
	}
	
	public static void changeNoOfEmployee(int no) {
		noOfEmployee = no; // static
		//this.name = "";// can't use this
		//salary = 1000;// can't access instance data
	}
	
	public void viewInformation() {
		System.out.println("Total emp: " + noOfEmployee); // 10// can access static
		System.out.println("---- current employee info ----");
		this.showData(); // access instance method
		System.out.println("Next employee's id: " + nextId);
	}
	
	Student s  = new Student();
	// s.rno = 0
	// s.name = null
	
	Student s2 = new Student(2,"Cherry");
	// s2.rno = 2
	// s2.name = "Cherry";
}

class Student {
	int rno;
	String name;
	
	public Student() { // default constructor
		
	}
	
	public Student(int rno, String na) { // parameterized constructor
		this.rno = rno;
		this.name = na;
	}
}
