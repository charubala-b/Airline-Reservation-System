package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class entrancee {

    @FXML
    private Button airlinestaff;

    @FXML
    private Button pass;

       public void createAccount() {
           try {
               FXMLLoader loader = new FXMLLoader(getClass().getResource("create_account.fxml"));
               Parent root = loader.load();
               Stage stage = new Stage();
               stage.setScene(new Scene(root, 859, 486));
               stage.show();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }



    @FXML
    public void en() throws IOException {
        FXMLLoader entrancefxmlloader = new FXMLLoader(HelloApplication.class.getResource("create_account.fxml"));
        //Parent root = loader.load();
        //loader.setRoot(root);
        Scene scene = new Scene(entrancefxmlloader.load(),859,486);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    public void ent() throws IOException {
        FXMLLoader entranfxmlloader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(entranfxmlloader.load(), 859, 486));
        stage.show();
    }

}