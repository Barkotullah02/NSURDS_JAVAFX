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

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseController extends Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Text txtCourses;

    SecureRandom section = new SecureRandom();

    private String coursAndSection[] = new String[20];
    int index = 0;
    private ArrayList<String> courses = new ArrayList<>();

    @FXML
    public void goToAdvising(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("advising.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void goToWarnings(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("warnings.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
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

    public void showCourses(ActionEvent evt) throws FileNotFoundException {

        File advisingData = new File("advising.dat");
        Scanner input = new Scanner(advisingData);
        while (input.hasNextLine()){
            courses.add(input.nextLine());
        index++;
        }

        for (int i = 0; i < index; i++){
            int sec = 1 + section.nextInt(40);
            coursAndSection[i] = courses.get(i) + " -SECTION: " + sec;
        }

        String oldCourseText;
        for (int i = 0; coursAndSection[i] != null; i++){
            oldCourseText = txtCourses.getText();
            txtCourses.setText(oldCourseText + coursAndSection[i] + "\n");
        }
        ((Button)evt.getSource()).setVisible(false);
    }

    public void goToHome(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("index.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public String className() {
        return this.className();
    }
}
