package com.example.demo3;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import  java.lang.reflect.InvocationTargetException;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override

    public void start(Stage stage) {
        try {
            FXMLLoader entrancefxmlloader = new FXMLLoader(HelloApplication.class.getResource("entrancee.fxml"));
            //FXMLLoader entrancefxmlloader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("entrancee.fxml")));
           // Parent root = loader.load();
            Scene scene = new Scene(entrancefxmlloader.load(),600,400);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print the exception trace for debugging purposes
            // Handle the IOException appropriately based on your application's requirements
        }
    }


    public static void main(String[] args) {
        launch();
    }
}