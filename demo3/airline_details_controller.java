package com.example.demo3;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.ResourceBundle;

public class airline_details_controller implements Initializable {

    @FXML
    private TableView<airline_details_model> airlineTableView;

    @FXML
    private TableColumn<airline_details_model, Integer> airlineNoTableColumn;

    @FXML
    private TableColumn<airline_details_model, String> airlineNameTableColumn;

    @FXML
    private TableColumn<airline_details_model, String> sourceTableColumn;

    @FXML
    private TableColumn<airline_details_model, String> destinationTableColumn;

    @FXML
    private TableColumn<airline_details_model, String> departure_timeTableColumn;
    @FXML
    private Button dharsh;

    @FXML
    private TextField keywords;

    @FXML
    private TableColumn<airline_details_model, String> airlineTypeTableColumn;

    ObservableList<airline_details_model> airlineDetailsModelsObservableList = FXCollections.observableArrayList();
    FilteredList<airline_details_model> filteredData;
    SortedList<airline_details_model> sortedData;




    @FXML

    void onnext(ActionEvent event) throws IOException {


        FXMLLoader signupfxmlloader = new FXMLLoader(getClass().getResource("passenger.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(signupfxmlloader.load(), 859, 486));
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resource) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getDBConnection();
        String airlineviewQuery = "select Airplane_no, Airplane_name, Departure_place, Arrival_place, Departure_Time, Airplane_type from airline_details";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(airlineviewQuery);
            while (queryOutput.next()) {
                Integer queryairlineNo = queryOutput.getInt("Airplane_no");
                String queryairlineName = queryOutput.getString("Airplane_name");
                String querysource = queryOutput.getString("Departure_place");
                String querydestination = queryOutput.getString("Arrival_place");
                String querydepartue_Time = queryOutput.getString("Departure_Time");
                String queryairlineType = queryOutput.getString("Airplane_type");
                airlineDetailsModelsObservableList.add(new airline_details_model(queryairlineNo, queryairlineName, querysource, querydestination, querydepartue_Time, queryairlineType));
            }

            airlineNoTableColumn.setCellValueFactory(new PropertyValueFactory<>("airlineNo"));
            airlineNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("airlineName"));
            sourceTableColumn.setCellValueFactory(new PropertyValueFactory<>("source"));
            destinationTableColumn.setCellValueFactory(new PropertyValueFactory<>("destination"));
            departure_timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("departure_time"));
            airlineTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("airlineType"));

            airlineTableView.setItems(airlineDetailsModelsObservableList);
            filteredData = new FilteredList<>(airlineDetailsModelsObservableList, b -> true);

            // Set up the filtering logic
            keywords.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(airlineDetailsModel -> {
                    if (newValue == null || newValue.isEmpty() || newValue.isBlank()) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    return airlineDetailsModel.getAirlineName().toLowerCase().contains(searchKeyword) ||
                            String.valueOf(airlineDetailsModel.getAirlineNo()).toLowerCase().contains(searchKeyword) ||
                            airlineDetailsModel.getAirlineType().toLowerCase().contains(searchKeyword) ||
                            airlineDetailsModel.getSource().toLowerCase().contains(searchKeyword) ||
                            airlineDetailsModel.getDestination().toLowerCase().contains(searchKeyword) ||
                            airlineDetailsModel.getDeparture_time().toLowerCase().contains(searchKeyword);
                });
            });

            // Set up sorting
            sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(airlineTableView.comparatorProperty());
            airlineTableView.setItems(sortedData);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
