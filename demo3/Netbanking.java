package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Netbanking {

    @FXML
    private Label account_no;

    @FXML
    private Label bank_name;

    @FXML
    private Label net_banking;

    @FXML
    private Button pay;

    @FXML
    void payedsuccessful(ActionEvent event) throws IOException {

        FXMLLoader entranfxmlloader = new FXMLLoader(getClass().getResource("final.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(entranfxmlloader.load(), 859, 486));
        stage.show();
    }

}
