package com.example.parking.controller;

import com.example.parking.model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label     payee_address_lbl;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Button    login_btn;
    public Label     error_lbl;
    public AnchorPane scenePane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> onLogin());
    }

    public void onLogin(){

        closeLogin();
    }

    public void closeLogin(){
        Stage stage = (Stage)  scenePane.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
