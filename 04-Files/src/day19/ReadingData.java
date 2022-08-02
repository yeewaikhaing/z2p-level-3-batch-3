package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		var path = Path.of("src/employee.txt");
		
		//read_file_lines(path);
		//read_large_file(path);
		//convertObjectFromFile(path);
		//read_all_bytes(path);
		//readString(path);
		read_BufferReader(path);
	}

	private static void read_BufferReader(Path path) {
		
		// jdk8+
		try(BufferedReader br = Files.newBufferedReader(path)) {
			
			List<String> data = br.lines()
									.filter(line -> line.contains("Aung"))
									.collect(Collectors.toList());
			System.out.println(data);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		// < jdk8
		try(BufferedReader br = Files.newBufferedReader(path)){
			
			String line = null;
			List<String> list = new ArrayList<>();
			while((line = br.readLine()) != null) {
				if(line.contains("Aung"))
					list.add(line);
			}
			
			System.out.println(list);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static void readString(Path path) throws IOException {
		String data = Files.readString(path);
		System.out.println(data);
	}

	private static void read_all_bytes(Path path) throws IOException {
		
		byte[] data = Files.readAllBytes(path);
		
		System.out.println(new String(data));
		
	}

	private static void convertObjectFromFile(Path path) throws IOException {
		List<String> lines = Files.readAllLines(path);
		List<Employee> empList = lines.stream()
									.map(Employee::getEmployeeFromLine)
									.collect(Collectors.toList());
		
		System.out.println("All Employee");
		empList.forEach(emp -> System.out.println(emp));
//		empList.forEach(emp -> {
//			System.out.println("Id: " + emp.getId());
//			System.out.println("Name: " + emp.getName());
//			System.out.println("City: " + emp.getCity());
//			System.out.println("-----------");
//		});
		
	}

	private static void read_large_file(Path path) throws IOException {
		
		// parallel stream
		System.out.println("--- Reading with parallel -----");
		Stream<String> data = Files.lines(path).parallel();
		List<String> list = data.collect(Collectors.toList());
		System.out.println(list);
		
		// bufferReader
		System.out.println("----- Reading with bufferReader---");
		try(BufferedReader reader = Files.newBufferedReader(path)){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static void read_file_lines(Path path) {
	try(Stream<String> lines = Files.lines(path)) {
				
				List<String> list = lines.filter(name -> name.contains("Aung"))
										.toList();
				System.out.println(list);		
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		
	}
}
