package com.example.parking.controller.client;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ReserveController implements Initializable {
    public ListView active_reserve_listView;
    public ListView history_reserve_listView;
    public ListView reservation_listView;
    public Label confirmation_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
