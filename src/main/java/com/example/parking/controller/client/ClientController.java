package com.example.parking.controller.client;

import com.example.parking.model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener(((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "Reserve" -> client_parent.setCenter(Model.getInstance().getViewFactory().getReservationsView());
                default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        }));
    }
}
