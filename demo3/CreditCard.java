package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreditCard {

    @FXML
    private Label Credit_card_method;

    @FXML
    private Label card_name;

    @FXML
    private Label card_no;

    @FXML
    private TextField number;

    @FXML
    private Button pay;

    @FXML
    private TextField visa;

    @FXML
    void PaymentFinished(ActionEvent event) throws IOException {
        FXMLLoader entranfxmlloader = new FXMLLoader(getClass().getResource("final.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(entranfxmlloader.load(), 859, 486));
        stage.show();
    }

}
