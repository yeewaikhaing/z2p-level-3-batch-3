package com.mmit.controller;

import java.io.IOException;

import com.mmit.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BookSearchController {

	@FXML
    private TableColumn<?, ?> col_author;

    @FXML
    private TableColumn<?, ?> col_category;

    @FXML
    private TableColumn<?, ?> col_code;

    @FXML
    private TableColumn<?, ?> col_price;

    @FXML
    private TableColumn<?, ?> col_publish;

    @FXML
    private TableColumn<?, ?> col_title;

    @FXML
    private TableView<?> tbl_book;

    @FXML
    private TextField txt_author;

    @FXML
    private TextField txt_category;

    @FXML
    private DatePicker txt_date;

    @FXML
    private TextField txt_title;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Start.changeScene("view/Book.fxml", "Book");
    }

    @FXML
    void btn_search_click(ActionEvent event) {

    }
}
