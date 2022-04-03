package com.group13.cafe94;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Welcome {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void changeScene(String newScene, ActionEvent e, Stage stage, Scene scene, Parent root) throws IOException {
        root = FXMLLoader.load(getClass().getResource(newScene));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCustomerLogin(ActionEvent event) throws IOException {
        changeScene("CustomerLogin.fxml", event, stage, scene, root);
    }

    public void switchToStaffLogin(ActionEvent event) throws IOException {
        changeScene("StaffLogin.fxml", event, stage, scene, root);
    }
}