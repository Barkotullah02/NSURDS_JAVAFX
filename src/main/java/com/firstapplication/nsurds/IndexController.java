package com.firstapplication.nsurds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import structure.Controller;

import java.io.IOException;

public class IndexController extends Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public Text codTxt;
    @FXML
    MenuItem logout;

    @FXML
    public void goToAdvising(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("advising.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void goToWarnings(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("warnings.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void logout(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void goToCourses(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("courses.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
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
