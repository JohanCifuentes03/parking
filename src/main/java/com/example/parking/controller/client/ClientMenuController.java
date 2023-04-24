package com.example.parking.controller.client;

import com.example.parking.model.DatabaseDriver;
import com.example.parking.model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;
    public Button reserve_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners(){
        dashboard_btn.setOnAction(event -> onDashboard());
        reserve_btn.setOnAction(event -> onReserve());
        //profile_btn.setOnAction(event -> testConnection());
    }


        private void testConnection(){
        Connection connection = DatabaseDriver.getInstance().getConnection();
        String query = "SELECT * FROM cliente";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            ResultSet resultSet =  statement.executeQuery();
            while (resultSet.next()){
                Long id = resultSet.getLong("codigo");
                String name = resultSet.getString("nombre");
                System.out.println("ID: " + id + ", Nombre: " + name );

            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }


    }



    private void onDashboard (){
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }
    private void onReserve (){
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Reserve");
    }
}
