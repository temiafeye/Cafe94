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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerLogin {

   // String USER = "ifan";
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
    public void customerRegister(ActionEvent event) throws IOException {
        changeScene("CustomerRegister.fxml", event, stage, scene, root);
    }

    public void customerLogin(ActionEvent event) throws IOException {

        String customerID = username.getText().toString();
        //username.getText().toString().equals(USER)

        if(checkIsCustomerIDValid(customerID) && password.getText().toString().equals(PWORD)) {
            changeScene("AlisScenes.fxml", event, stage, scene, root);
        } else {
            checkLogin.setText("Please enter a valid username or password");
        }
    }

    public boolean checkIsCustomerIDValid(String customerID){
        try{
                Connection con = DBConnectionHandler.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER WHERE CUSTOMER_ID LIKE '" + customerID + "';");
                while (rs.next())
                    return true;
                return false;
            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }
    }
