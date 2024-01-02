package com.example.demo3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccount {

    @FXML
    private Button Login;

    @FXML
    private Button Signup;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Text acounttext;

    @FXML
    private Text enrtycredits;

    @FXML
    private Text haveaccounttext;

    @FXML
    private ImageView image;

    @FXML
     public void login() throws IOException {
        {
            FXMLLoader entranfxmlloader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            //Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(entranfxmlloader.load(), 859, 486));
            stage.show();
        }


    }

    @FXML
     public void signup() throws IOException {
        FXMLLoader createfxmlloader = new FXMLLoader(getClass().getResource("Hello.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(createfxmlloader.load(), 859, 486));
        stage.show();
    }

}
