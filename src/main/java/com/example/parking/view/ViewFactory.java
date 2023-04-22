package com.example.parking.view;

import com.example.parking.controller.client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    // Client view
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane reservationsView;


    public ViewFactory(){
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    public AnchorPane getDashboardView(){
        if (dashboardView == null){
            try{
                dashboardView = new FXMLLoader(getClass().getResource("/fxml/Client/Dashboard.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    return dashboardView;
    }

    public AnchorPane getReservationsView() {
        if (reservationsView == null){
            try{
                reservationsView = new FXMLLoader(getClass().getResource("/fxml/Client/Reserve.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return reservationsView;
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }


    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Parking");
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();
    }


}
