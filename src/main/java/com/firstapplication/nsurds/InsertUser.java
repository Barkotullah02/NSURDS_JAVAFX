package com.firstapplication.nsurds;

import java.io.*;
import java.util.ArrayList;

class InsertUser {
    public static void main(String[] args) {
        User newUser1 = new User("Barkotullah", "2323740", "abcd", "ECE");
        User newUser2 = new User("Shome", "2231894", "efgh", "ECE");
        User newUser3 = new User("Ashik", "2323194", "abcd", "ECE");
        User newUser4 = new User("Sudad", "2322742", "efgh", "ECE");
        User newUser5 = new User("Opu", "abcd", "1234", "ECE");
        File userData0 = new File("userdata.dat");
        try {
            FileOutputStream fStream = new FileOutputStream(userData0);
            ObjectOutputStream store = new ObjectOutputStream(fStream);
            store.writeObject(newUser1);
            store.writeObject(newUser2);
            store.writeObject(newUser3);
            store.writeObject(newUser4);
            store.writeObject(newUser5);
            store.close();
            System.out.println("finished");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user[] = new User[10];

        for (int i = 0; i < user.length; i++){
            user[i] = new User();
        }
        int userSize = 0;

        File userData = new File("userdata.dat");
        try{
            FileInputStream fStream = new FileInputStream(userData);
            ObjectInputStream getData = new ObjectInputStream(fStream);

            for (int i = 0; i < 5; i++){
                user[i] = (User) getData.readObject();
                System.out.println(user[i]);
            }

            while (true){
                try {
                    user[userSize] = (User) getData.readObject();
                    userSize++;
                }catch (EOFException e){
                    break;
                }
            }



//            User users = (User) getData.readObject();
//            User userss = (User) getData.readObject();
//            User usersss = (User) getData.readObject();
//            User userssss = (User) getData.readObject();
//            System.out.println(users);
//            System.out.println(userss);
//            System.out.println(usersss);
//            System.out.println(userssss);

            getData.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}

