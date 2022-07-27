package day16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collecting {

	public static void main(String[] args) {
		Student[] students = {
				new Student(10, "cherry", "yangon"),
				new Student(2, "cherry", "mandalay"),
				new Student(5, "khaing", "monywa"),
				new Student(1, "htet", "mandalay"),
				new Student(11, "htet yadana", "yangon")
		};
		
		
		Set<String> hashSet = Arrays.stream(students)
								.map(Student::getName)
								.collect(Collectors.toSet());
		
		System.out.println("hashset: " + hashSet);
		
		TreeSet<String> treeSet = Arrays.stream(students)
									.map(s -> s.getName())
									.collect(Collectors.toCollection(TreeSet::new));
		
		List<String> list = Arrays.stream(students)
								.map(Student::getName)
								.collect(Collectors.toList());
		
		Map<Integer, String> map_1 = Arrays.stream(students)
										.collect(Collectors.toMap(
												Student::getRno,  // key
												Student::getName) // value
											);
		Map<Integer, Student> map_2 = Arrays.stream(students)
										.filter(s -> !s.getCity().equals("yangon"))
										.collect(Collectors.toMap(
												s -> s.getRno(), // key
												s -> s) // value
											);
		
		
		System.out.println("treeset: " + treeSet);
		System.out.println("list: " + list);
		System.out.println("Map1: " + map_1);
		System.out.println("Map2: " + map_2);
		
	}
	
	// c:\\Java\\
	//c:/java/
}
