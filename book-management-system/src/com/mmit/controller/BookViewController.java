package com.mmit.controller;

import java.io.IOException;

import com.mmit.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BookViewController {

	@FXML
    private TableColumn<?, ?> col_author;

    @FXML
    private TableColumn<?, ?> col_category;

    @FXML
    private TableColumn<?, ?> col_code;

    @FXML
    private TableColumn<?, ?> col_entry_by;

    @FXML
    private TableColumn<?, ?> col_price;

    @FXML
    private TableColumn<?, ?> col_publish;

    @FXML
    private TableColumn<?, ?> col_title;

    @FXML
    private TableView<?> tbl_book;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Start.changeScene("view/Book.fxml", "Book");
    }
}
