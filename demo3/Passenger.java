package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Passenger {

    @FXML
    private PasswordField Aadhar;

    @FXML
    private TextField Passenger_name;

    @FXML
    private MenuButton age;

    @FXML
    private Button nexts;

    @FXML
    private RadioButton normal;

    @FXML
    private TextField seats;



    @FXML
    void donepassenger(ActionEvent event) throws IOException, SQLException {

            String user_name = Passenger_name.getText();
            String Password = Aadhar.getText();
            String seat_number=seats.getText();

            try (
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root@123")) {
                String sql = "INSERT INTO passenger (Passenger_name, Aadhar_no,Seat_Number) VALUES (?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, user_name);
                statement.setString(2, Password);
                statement.setString(3,seat_number);
                statement.executeUpdate();
                statement.close();
                connection.close();
        }
        FXMLLoader Passfxmlloader = new FXMLLoader(getClass().getResource("payment.fxml"));
        //Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(Passfxmlloader.load(), 859, 486));
        stage.show();
    }

}
