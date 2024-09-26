package com.firstapplication.nsurds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import structure.Controller;

import java.io.IOException;

public class WarningController extends Controller {

    @FXML
    public void goToCourses(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("courses.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void goToAdvising(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("advising.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void logout(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void goToHome(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void goToPayments(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payments.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public String className() {
        return this.className();
    }
}
