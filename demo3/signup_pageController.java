package com.example.demo3;

import com.example.demo3.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.*;

import java.io.IOException;

public class signup_pageController {
    @FXML
    private TextField Username;

    @FXML
    private PasswordField password;

    @FXML
    void successfully_creates(ActionEvent event) {
        String user_name = Username.getText();
        String Password = password.getText();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root@123")) {
            String sql = "INSERT INTO signup (username, password) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user_name);
            statement.setString(2, Password);
            statement.executeUpdate(); // Use executeUpdate for INSERT, UPDATE, DELETE queries

            // Close the statement and connection
            statement.close();
            connection.close();

            FXMLLoader signupfxmlloader = new FXMLLoader(getClass().getResource("airline_details.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(signupfxmlloader.load(), 859, 486));
            stage.show();

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            // Handle exceptions accordingly
        }
    }


}
