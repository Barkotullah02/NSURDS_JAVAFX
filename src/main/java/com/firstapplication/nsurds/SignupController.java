package com.firstapplication.nsurds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import structure.Controller;

import java.io.*;

public class SignupController extends Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected TextArea password;
    @FXML
    protected TextArea username;
    @FXML
    protected TextArea department;
    @FXML
    protected TextArea fullname;
    @FXML
    Text txtStudentportal;
    @FXML
    Button btnsignup;
    private FileWriter userData;

    @FXML
    public void storeData() throws IOException {
        String username = this.username.getText();
        String password = this.password.getText();
        String department = this.department.getText();
        String name = this.fullname.getText();

        User newUser = new User(name, username, password, department);



        try {
            FileOutputStream fStream = new FileOutputStream("userData.dat", true);
            ObjectOutputStream store = new ObjectOutputStream(fStream);
            store.writeObject(newUser);
            store.close();
            txtStudentportal.setText("Signup successful");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.fullname.setText("");
        this.username.setText("");
        this.password.setText("");
        this.department.setText("");

    }

    @FXML
    public void goToLogin(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
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


