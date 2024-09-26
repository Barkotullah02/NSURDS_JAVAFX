package com.firstapplication.nsurds;

import Exceptions.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import structure.*;

import java.io.*;
import java.util.Scanner;

public class AdvisingController extends Controller {

    @FXML
    private Text warningMax;
    private int courseControl = 0;
    private String courses, oldCoursesTxt, savedCourses;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Text selectedCourse;

    @FXML
    public void goToPayments(ActionEvent evt) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payments.fxml"));
        Stage stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void goToCourses(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("courses.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
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
    @FXML
    public void goToHome(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("index.fxml"));
        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
        scene = new Scene(root);
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
    public void selectCourse(ActionEvent evt){

        try{
            if (courseControl < 8) {
                oldCoursesTxt = selectedCourse.getText();
                courses = ((Button) evt.getSource()).getText();

                ((Button) evt.getSource()).setStyle("-fx-background-color: red");
                //((Button) evt.getSource()).setStyle("-fx-te");
                ((Button) evt.getSource()).setDisable(true);
                //((Button) evt.getSource()).setVisible(false);
                savedCourses = oldCoursesTxt + courses + "\n";
                selectedCourse.setText(savedCourses);
                courseControl++;
            }
            else if (courseControl > 8){
                throw new CourseLimitException("Course limit is reached");
            }
        }catch (CourseLimitException e){
            warningMax.setText("Can't select more than 8 courses!");
            System.out.println("Error: " + e);
        }


    }

    public void saveCourse(ActionEvent actionEvent) {
        Advising advising = new Advising(savedCourses);

        try {

            FileWriter advisingData = new FileWriter("advising.dat");
//            FileOutputStream advOS = new FileOutputStream(advisingData);
//            ObjectOutputStream advCourses = new ObjectOutputStream(advOS);
//
//            advCourses.writeObject(advising);
//            advCourses.close();
            advisingData.write(savedCourses);
            advisingData.close();

            selectedCourse.setText("Successfully saved\nNow go to your courses\nto see more.");
        }catch (IOException e){
            System.out.println("Error: " + e);
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("advising.dat");
        Scanner input = new Scanner(f1);
        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }
    }

    @Override
    public String className() {
        return this.className();
    }
}
