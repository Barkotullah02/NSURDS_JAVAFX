package com.firstapplication.nsurds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import structure.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PaymentsController extends Controller {


    @FXML
    private Text txtPayments;
    private String coursAndPayment[] = new String[20];
    int index = 0;
    private ArrayList<String> courses = new ArrayList<>();

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
    @FXML
    public void fullPayment(ActionEvent evt) throws FileNotFoundException {
        File advisingData = new File("advising.dat");
        Scanner input = new Scanner(advisingData);
        while (input.hasNextLine()){
            courses.add(input.nextLine());
            index++;
        }


        for (int i = 0; i < index; i++){
            coursAndPayment[i] = courses.get(i) + " -3X6500: 19500";
        }

        String oldCourseText = "";
        for (int i = 0; coursAndPayment[i] != null; i++){
            oldCourseText = txtPayments.getText();
            txtPayments.setText(oldCourseText + coursAndPayment[i] + "\n");
        }
        txtPayments.setText(txtPayments.getText() + "You have to pay BDT: " + ((index)*19500));
        ((Button)evt.getSource()).setVisible(false);
    }

    public void goToWarnings(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("warnings.fxml"));
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
