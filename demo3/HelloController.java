package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private PasswordField charss;

    @FXML
    private AnchorPane dharsh;

    @FXML
    private TextField dharshh;

    @FXML
    private Hyperlink fprget;

    @FXML
    private Button gayu;

    @FXML
    private Text user;

    @FXML
    void enterairplane(ActionEvent event) throws IOException {
        FXMLLoader signupfxmlloader = new FXMLLoader(getClass().getResource("passenger.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(signupfxmlloader.load(), 859, 486));
        stage.show();
    }

}

