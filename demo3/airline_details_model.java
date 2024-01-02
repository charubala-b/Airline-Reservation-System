package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class airline_details_model {
    private Integer airlineNo;
    private String airlineName, airlineType;
    private String source, destination, departure_time;

    public airline_details_model(Integer airlineNo, String airlineName, String source, String destination, String departure_time, String airlineType) {
        this.airlineNo = airlineNo;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.departure_time = departure_time;
        this.airlineType = airlineType;
    }

    public Integer getAirlineNo() {
        return airlineNo;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getAirlineType() {
        return airlineType;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setAirlineNo(Integer airlineNo) {
        this.airlineNo = airlineNo;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setAirlineType(String airlineType) {
        this.airlineType = airlineType;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }



}
