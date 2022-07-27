package day16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reduction {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Mg Mg", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("Jeon", 7800, "Monywa")
				);
		
		int total = empList.stream().mapToInt(e -> e.getSalary()).sum();
		double avg = empList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		int max_sal = empList.stream().mapToInt(e -> e.getSalary()).max().getAsInt();
		long count = empList.stream().filter(e -> e.getSalary() > 6000).count();
		Employee max_emp = empList.stream().max(Comparator.comparingInt(e -> e.getSalary())).get();
		Employee min_emp = empList.stream().min((e1, e2) -> e1.getSalary() - e2.getSalary()).get();
		
		System.out.println("Total salary: " + total);
		System.out.println("Average salary: " + avg);
		System.out.println("Max salary: " + max_sal);
		System.out.println("No of emplyee who got salary > 6000: " + count);
		System.out.println("Emplyee who got max salyary: " + max_emp);
		System.out.println("Employee who got min salary: " + min_emp);
		
		
		// custom reduction (reduce())
		total = empList.stream()
					.map(Employee::getSalary)
					.reduce(0, (s1, s2) -> s1 + s2);
		
		int min_sal = empList.stream()
				.mapToInt(Employee::getSalary)
				.reduce(Integer::min)
				.getAsInt();
		
		max_emp = empList.stream()
					.reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e2 : e1)
					.get();
		
		System.out.println("Total: " + total);
		System.out.println("Min salary: " + min_sal);
		System.out.println("min value: " + Integer.min(100, 200));
		System.out.println("Max sal with employee: " + max_emp);
	}
}
