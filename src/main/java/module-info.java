module com.example.parking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires ojdbc8;
    requires javafx.web;
    opens com.example.parking to javafx.fxml;
    exports com.example.parking;
    exports com.example.parking.controller;
    exports com.example.parking.controller.admin;
    exports com.example.parking.controller.client;
    exports com.example.parking.model;
    exports com.example.parking.view;
}