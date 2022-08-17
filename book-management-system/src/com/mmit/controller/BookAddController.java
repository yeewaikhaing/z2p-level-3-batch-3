package com.mmit.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import com.mmit.Start;
import com.mmit.model.entity.Author;
import com.mmit.model.entity.Book;
import com.mmit.model.entity.Category;
import com.mmit.model.entity.DatabaseHandler;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class BookAddController implements Initializable{

	private List<Category> catList;
	private List<Author> authorList;
	 @FXML
	    private ComboBox<String> cbo_author;

	    @FXML
	    private ComboBox<String> cbo_category;

	    @FXML
	    private TextField txt_code;

	    @FXML
	    private TextField txt_price;

	    @FXML
	    private DatePicker txt_publishDate;

	    @FXML
	    private TextField txt_title;

	    @FXML
	    void btn_back_click(ActionEvent event) throws IOException {
	    	Start.changeScene("view/Book.fxml", "Book");
	    }

	    @FXML
	    void btn_reset_click(ActionEvent event) {
	    	txt_code.setText(null);
	    	txt_price.setText(null);
	    	txt_publishDate.setValue(null);
	    	txt_title.setText(null);
	    }

	    @FXML
	    void btn_save_click(ActionEvent event) {
	    	
	    	try {
	    		// get data from input
		    	var code = txt_code.getText();
		    	var title = txt_title.getText();
		    	var price = txt_price.getText();
		    	var publishDate = txt_publishDate.getValue();
		    	
		    	if(code.isEmpty()) {
		    		showAlert(AlertType.ERROR, "Code is requried");
		    		return;
		    	}
		    	if(title.isEmpty()) {
		    		showAlert(AlertType.ERROR, "Title is requried");
		    		return;
		    	}
		    	if(price.isEmpty()) {
		    		showAlert(AlertType.ERROR, "Price is requried");
		    		return;
		    	}
		    	if(publishDate == null) {
		    		showAlert(AlertType.ERROR, "Publish Date is requried");
		    		return;
		    	}
		    	
		    	var author_index = cbo_author.getSelectionModel().getSelectedIndex();// -1
		    	var cat_index = cbo_category.getSelectionModel().getSelectedIndex();
		    	
		    	if(author_index < 0) {
		    		showAlert(AlertType.ERROR, "Author is required");
		    		return;
		    	}
		    	
		    	if(cat_index < 0) {
		    		showAlert(AlertType.ERROR, "Category is required");
		    		return;
		    	}
		    	
		    	var select_author = authorList.get(author_index);
		    	var select_cat = catList.get(cat_index);
		    	//System.out.println("index: " + author_index);
		    	// create new book
		    	var book = new Book();
		    	// assign data to book obj
		    	book.setAuthor(select_author);
		    	book.setCategory(select_cat);
		    	book.setCode(Integer.parseInt(code));
		    	book.setPrice(Double.parseDouble(price));
		    	book.setPublishDate(publishDate);
		    	book.setCreated_by(Start.login_user);
		    	book.setTitle(title);
		    	// save to db
		    	DatabaseHandler.saveBook(book);
		    	showAlert(AlertType.INFORMATION, "Success");
		    	resetForm();
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
				showAlert(AlertType.ERROR, e.getMessage());
			}
	    }

		private void resetForm() {
			txt_code.setText(null);
			txt_price.setText(null);
			txt_publishDate.setValue(null);
			txt_title.setText(null);
			cbo_author.getSelectionModel().clearSelection();
			cbo_category.getSelectionModel().clearSelection();
		}

		private Optional<ButtonType> showAlert(AlertType type, String msg) {
			Alert alert = new Alert(type);
			alert.setContentText(msg);
			alert.setHeaderText(null);
			alert.setTitle("Message");
			
			return alert.showAndWait();
		}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			catList = DatabaseHandler.findAllCategory();
			authorList = DatabaseHandler.findAllAuthor();
			
			List<String> categories = catList.stream()
										.map(c -> c.getName())
										.toList();
			List<String> authors = authorList.stream()
										.map(a -> a.getName())
										.toList();
			cbo_category.setItems(FXCollections.observableArrayList(categories));
			cbo_author.setItems(FXCollections.observableArrayList(authors));
		}
}
