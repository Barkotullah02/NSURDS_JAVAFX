package com.firstapplication.nsurds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected String username;
    protected String password;
    protected String department;
    User(String name, String username, String password, String department){
        this.name = name;
        this.username= username;
        this.password = password;
        this.department = department;
    }
    User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    protected void storeData(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    //    @Override
//    public String toString() {
//        return  name + ' ' + username + ' ' + password + ' ' + department + ' ';
//    }
}
