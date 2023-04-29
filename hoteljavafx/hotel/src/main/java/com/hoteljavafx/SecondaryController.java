package com.hoteljavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.fxml.Initializable;

public class SecondaryController implements Initializable {
    
    @FXML
    private ComboBox<String> roomType;

    @FXML
    private ComboBox<String> room;

    @FXML
    private void selectRoomType() throws IOException{
        String selectedValue = roomType.getValue();
        switch(selectedValue){
            case "LUX":
                room.getItems().clear();
                room.getItems().addAll("1", "2", "3");
                break;
            case "ECONOM":
                room.getItems().clear();
                room.getItems().addAll("4", "5", "6");
                break;
            case "VIP":
                room.getItems().clear();
                room.getItems().addAll("7", "8", "9");
                break;
        }
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void createAction() throws IOException {
        App.setRoot("primary");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        roomType.getItems().clear();
        roomType.getItems().addAll("LUX", "VIP", "ECONOM");
    }
}