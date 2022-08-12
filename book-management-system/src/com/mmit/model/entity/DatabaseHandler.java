package com.mmit.model.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

	public static Connection createConnection() throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3", "root", "");
		
		return conn;
	}

	public static void saveCategory(String name) throws Exception {
		
		try(var con = createConnection()) {
			var query = "INSERT INTO categories(name)VALUES(?)";
			
			var pstm = con.prepareStatement(query);
			pstm.setString(1, name);
			
			pstm.executeUpdate();
		}
		catch (Exception e) {
			throw e;
		}
		
	}

	public static List<Category> findAllCategory() {
		List<Category> data = new ArrayList<>();
		try(var con = createConnection()) {
			// select id, name from
			var query = "SELECT * FROM categories ORDER BY id";
			var pstm = con.prepareStatement(query);
			
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				// create new category
				var cat = new Category();
				
				// bind column to field
				cat.setId(rs.getInt("id"));
				cat.setName(rs.getString("name"));
				
				// add obj to list
				data.add(cat);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public static void updateCategory(Category cat) throws Exception {
		
		try(var con = createConnection()) {
			var query = "UPDATE categories SET name = ? WHERE id = ?";
			var pstm = con.prepareStatement(query);
			pstm.setString(1, cat.getName());
			pstm.setInt(2, cat.getId());
			
			pstm.executeUpdate();
		}
		catch (Exception e) {
			throw e;
		}
		
	}

	public static void deleteCategory(int id) {
		try(var con = createConnection()) {
			var query = "DELETE FROM categories WHERE id = ?";
			var pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			
			pstm.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
//	public static void main(String[] args) throws SQLException {
//		createConnection();
//		System.out.println("Success");
//	}
}
