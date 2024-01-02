package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;




public class Payment {

    @FXML
    private Label paymenttype;

    @FXML
    private Label totalprice;

    @FXML
    private TextField value;

    @FXML
    void UPI(ActionEvent event) throws IOException {

        FXMLLoader upifxmlloader = new FXMLLoader(getClass().getResource("upi3.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(upifxmlloader.load(), 859, 486));
        stage.show();
    }

    @FXML
    void creditcard(ActionEvent event) throws IOException {

        FXMLLoader creditcardfxmlloader = new FXMLLoader(getClass().getResource("creditcard.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(creditcardfxmlloader.load(), 859, 486));
        stage.show();
    }

    @FXML
    void netbank(ActionEvent event) throws IOException {

        FXMLLoader netbankfxmlloader = new FXMLLoader(getClass().getResource("netbanking.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(netbankfxmlloader.load(), 859, 486));
        stage.show();
    }

}
