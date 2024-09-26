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
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class LoginController extends Controller {
    User users = new User(), userss = new User();
    User user[] = new User[1000];
    private int trackEnd = 1;

    @FXML
    public Button signup;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    AnchorPane parent;
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea username;
    @FXML
    private TextArea password;
    @FXML
    Text prompt;
    @FXML
    Button btnlogin;

    protected void getData(){

        for (int i = 0; i < 1000; i++){
            user[i] = new User();
        }

        File userData = new File("userdata.dat");
        try{
            FileInputStream fStream = new FileInputStream(userData);
            ObjectInputStream getData = new ObjectInputStream(fStream);
            int userIndex = 0;

            for (int i = 0; i < 5; i++){
                user[i] = (User) getData.readObject();
                System.out.println(user[i]);
            }



                    userIndex++;

            getData.close();


        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }


    @FXML
    protected void verifyLogin(ActionEvent evt) throws IOException {

        System.out.println(((Node) evt.getSource()).getAccessibleText());
        String dusername = " ", dpassword = " ";

        String username = this.username.getText();
        String password = this.password.getText();
        if (username != null && password != null) {
            getData();


            for (User un : user) {
                if (un.username != null) {

                    dusername = un.getUsername().toString();
                    dpassword = un.getPassword().toString();

                }
                if ((dusername.compareTo(username) == 0) && (dpassword.compareTo(password) == 0)) {
                        root = FXMLLoader.load(getClass().getResource("index.fxml"));
                        stage = (Stage)((Node)evt.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();

                    break;
                }
            }

            prompt.setText("Username or password is wrong!");

        }

            this.password.setText("");
            this.username.setText("");


    }


    public void goToSignup(ActionEvent evt) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
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
