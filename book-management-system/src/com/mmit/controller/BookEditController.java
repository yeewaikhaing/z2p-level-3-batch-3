package com.mmit.controller;

import java.io.IOException;

import com.mmit.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class BookEditController {

	@FXML
    private ComboBox<?> cbo_author;

    @FXML
    private ComboBox<?> cbo_category;

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
    void btn_delete_click(ActionEvent event) {

    }

    @FXML
    void btn_search_click(ActionEvent event) {

    }

    @FXML
    void btn_update_click(ActionEvent event) {

    }
}
