package com.example.parking.controller.client;

import com.example.parking.model.DatabaseDriver;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ReserveController implements Initializable {
    public ListView<String> active_reserve_listView;
    public ListView history_reserve_listView;
    public ListView<String> reservation_listView;
    public Label confirmation_lbl;
    public Button show_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        show_btn.setOnAction(event -> {
            List<String> information = getParkCars();
            reservation_listView.getItems().addAll(information);
        });
    }

    public List<String> getParkCars() {
        List<String> information = new ArrayList<>();
        Connection connection = DatabaseDriver.getInstance().getConnection();
        String query = "SELECT * FROM parqueadero";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Long id = resultSet.getLong("codigo");
                String name = resultSet.getString("nombre");
                information.add(name);
                System.out.println("ID: " + id + ", Nombre: " + name);

               }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return information;
    }

}
