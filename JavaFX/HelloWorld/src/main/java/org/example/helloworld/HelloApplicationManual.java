package org.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplicationManual extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // her it use fxml file
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // without fxml file

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);


        //Label
        Label greet = new Label("Welcome to JavaFX");
        // text color
        greet.setTextFill(Color.GREEN);
        //font
        greet.setFont(Font.font("Times New Roman", FontWeight.BOLD,70));
        root.getChildren().add(greet);



        // .load()
        // main window

//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        Scene scene = new Scene(root, 320, 240);

        // manually increase the width
        Scene scene = new Scene(root, 700, 240);
        stage.setTitle("Hello  World!");
        stage.setScene(scene);
        stage.show();
    }
}
