package com.mmit;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Start extends Application {
	
	static Stage original_stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("view/Category.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Book Management System");
			primaryStage.show();
			original_stage = primaryStage;
			original_stage.setResizable(false);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeScene(String input_file, String title) throws IOException {
		original_stage.hide();
		Parent root = FXMLLoader.load(Start.class.getResource(input_file));
		Scene scene = new Scene(root);
		original_stage.setScene(scene);
		original_stage.setTitle(title);
		original_stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
