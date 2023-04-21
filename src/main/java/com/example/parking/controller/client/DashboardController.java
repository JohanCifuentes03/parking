package com.example.parking.controller.client;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Text  user_name;
    public Label login_date;
    public Label savings;
    public Label last_expense;
    public WebView   webView_maps;
    public ListView  parking_spaces;
    public TextField parking_input;
    public Text car_name;
    public Text car_model;
    public Text car_id;
    public Text car_type;
    public WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


}
