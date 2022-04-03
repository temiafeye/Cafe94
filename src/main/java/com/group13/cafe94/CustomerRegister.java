package com.group13.cafe94;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CustomerRegister {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField firstName;
    @FXML
    TextField lastName;
    @FXML
    TextField street;
    @FXML
    TextField city;
    @FXML
    TextField postcode;

    String fullName;
    String fullAddress;

    public void changeScene(String newScene, ActionEvent e, Stage stage, Scene scene, Parent root) throws IOException {
        root = FXMLLoader.load(getClass().getResource(newScene));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void register(ActionEvent event) throws IOException {
        fullName = firstName.getText().toString() + " " + lastName.getText().toString();
        fullAddress = street.getText().toString() + "\n" + city.getText().toString() + "\n"
                + postcode.getText().toString();

        Customer cus = new Customer(firstName.getText().toString(),lastName.getText().toString(),new Integer(new Random().nextInt(100)).toString(),fullAddress,new ArrayList<Order>());
        cus.persistData();
        System.out.println(fullName);
        System.out.println(fullAddress);

        changeScene("AlisScenes.fxml", event, stage, scene, root);
    }
}


