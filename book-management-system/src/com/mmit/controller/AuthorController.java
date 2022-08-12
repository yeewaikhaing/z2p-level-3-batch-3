package com.mmit.controller;

import java.io.IOException;

import com.mmit.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AuthorController {

	@FXML
    private TableColumn<?, ?> col_birthday;

    @FXML
    private TableColumn<?, ?> col_city;

    @FXML
    private TableColumn<?, ?> col_id;

    @FXML
    private TableColumn<?, ?> col_name;

    @FXML
    private TableView<?> tbl_author;

    @FXML
    private DatePicker txt_birthday;

    @FXML
    private TextField txt_city;

    @FXML
    private TextField txt_name;

    @FXML
    void btn_add_click(ActionEvent event) {

    }

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Start.changeScene("view/Start.fxml", "Book Management System");
    }

    @FXML
    void btn_delete_click(ActionEvent event) {

    }

    @FXML
    void btn_update_click(ActionEvent event) {

    }
}
