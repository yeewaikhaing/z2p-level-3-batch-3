package day21;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Testing_1 {

	public static void main(String[] args) {
		
		//save_with_statement();
		//save_with_preparestatement();
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter emp no: ");
			//int no = Integer.parseInt(sc.nextLine());
			String no = sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			
			//find_with_statement(no, name);
			find_with_preparedstatement(no, name);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void find_with_preparedstatement(String no, String name) {
		try(
				// create connection
				Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3", "root", "")) {
				System.out.println("Get Connection");
				
				
				// define query
				String query = "SELECT emp_no,city, birthday FROM employees WHERE name = ?";
				
				PreparedStatement pstm = con.prepareStatement(query);
				//setXXX(index, value)
				pstm.setString(1, name); // select city, birthday from employees where emp_no ='1006 or 1 = 1'
				//pstm.setString(2, name);
				
			 	ResultSet rs = pstm.executeQuery();
			 	while(rs.next()) {
			 		//System.out.println("data exist");
			 		// getXXX();
			 		//rs.getint
			 		//rs.getstring
			 		System.out.println("No: " + rs.getInt("emp_no"));
			 		System.out.println("Dob: " + rs.getDate("birthday"));
			 		System.out.println("city: " + rs.getString("city"));
			 		System.out.println("---------");
			 	}
			 	//else {
			 	//	System.out.println("There is no data");
			 	//}
				
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	private static void find_with_statement(String no, String name) {
		try(
			// create connection
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3", "root", "")) {
			System.out.println("Get Connection");
			// create statement
			Statement st = con.createStatement();
			
			// define query
			//String query = "SELECT city, birthday FROM employees WHERE emp_no = " + no + " AND name = '" + name + "'";
			// SELECT * FROM employees WHERE emp_no = 1001 AND name = 'aung'
			
			String query = "SELECT city, birthday FROM employees WHERE emp_no = " + no ;
			// select city, birthday from employees where emp_no = 1006 or 1 = 1
			 // sql injection
			
		 	ResultSet rs = st.executeQuery(query);
		 	if(rs.next()) {
		 		System.out.println("data exist");
		 	}
		 	else {
		 		System.out.println("There is no data");
		 	}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void save_with_preparestatement() {
		try(
				// create connection
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3", "root", "")) {
			System.out.println("Get Connection");
			
			// define query
			String query = "INSERT INTO employees(emp_no, name, city, salary, birthday)VALUES(1003, 'Su su', 'Mandalay', 1000000, '1997-12-12')";
			
			// create prepared statement
			PreparedStatement pstm = con.prepareStatement(query);
						
			//execute query
			// 1. select => executeQuery()(return result set)
			// 2. transaction(insert/update/delete) => executeUpdate() ( return no of affected row)
			
			pstm.executeUpdate();
			System.out.println("Insert success");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void save_with_statement() {
		try(
				// create connection
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3", "root", "")) {
			System.out.println("Get Connection");
			// create statement
			Statement st = con.createStatement();
			
			// define query
			String query = "INSERT INTO employees(emp_no, name, city, salary, birthday)VALUES(1002, 'Su su', 'Mandalay', 1000000, '1997-12-12')";
			
			//execute query
			// 1. select => executeQuery()(return result set)
			// 2. transaction(insert/update/delete) => executeUpdate() ( return no of affected row)
			
			st.executeUpdate(query);
			System.out.println("Insert success");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
