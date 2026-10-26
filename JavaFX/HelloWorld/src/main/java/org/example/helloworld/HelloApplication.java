package org.example.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

// here it is using fxml file

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // her it use fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // .load()
        // main window
        Scene scene = new Scene(fxmlLoader.load(), 720, 240);
        stage.setTitle("Hello  World!");
        stage.setScene(scene);
        stage.show();
    }
}
