package com.global.TP_Final_Integrador.singleton;

import com.global.TP_Final_Integrador.model.User;

import java.util.ArrayList;

public class UsersSingleton {

    private static UsersSingleton INSTANCE;
    private ArrayList<User> users;

    //construct

    public UsersSingleton(){
        users = new ArrayList<>();
        users.add(new User(1L, "chavezdrive", "mipass22",
                "Jose", "Chavez", "1984-07-07", "chavez@gmail.com",
                "Customer"));
        users.add(new User(2L, "pepe", "pp2",
                "Pepe", "Sanchez", "2015-01-01", "pepito@gmail.com",
                "Seller"));
    }

    public static  UsersSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new UsersSingleton();
        }
        return INSTANCE;
    }

    public ArrayList<User> getUsers(){

        return users;
    }

    public void setUsers(ArrayList<User> users){

        this.users = users;
    }
}
