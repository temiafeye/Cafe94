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

public class StaffLogin {

    String USER = "ifan";
    String PWORD = "password";

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Label checkLogin;

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

    public void staffLogin(ActionEvent event) throws IOException {

        if(username.getText().toString().equals(USER) && password.getText().toString().equals(PWORD)) {
            changeScene("AlisScenes.fxml", event, stage, scene, root);
        } else {
            checkLogin.setText("Please enter a valid username or password");
        }
    }
}
