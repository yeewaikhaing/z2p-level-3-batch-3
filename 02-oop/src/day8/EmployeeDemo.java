package day8;

public class EmployeeDemo {

	public static void main(String[] args) {
		try {
			// create object
			Employee emp1 = new Employee();	
			Employee emp2 = new Employee();
			Employee emp3 = new Employee();
			
			// initialize data
			emp1.initData("Jeon", 1000000);
			emp2.initData("Cherry", 500000);
			emp3.initData("Aung Aung", 1400000);
			
			// show info
			System.out.println("ID \tName \tSalary");
			emp1.showData();
			emp2.showData();
			emp3.showData();
			
			Employee.changeNoOfEmployee(10);
			// create 4th employee object
			var emp4 = new Employee();// occur exception
			emp4.initData("Kyaw Kyaw", 3000000);
			emp4.showData();
			
			emp4.viewInformation();
			
		} catch (AppException e) {
			System.err.println(e.getMessage());
		}
		
		//disp
	}
	
	static void display(String a) {
		System.out.println("testing1");
	}
	static void display(int a) {
		System.out.println("test2");
	}
	static void display(float a) {
		System.out.println("test3");
	}

	
	
}
