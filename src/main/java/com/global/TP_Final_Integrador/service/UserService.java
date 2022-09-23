package com.global.TP_Final_Integrador.service;

import com.global.TP_Final_Integrador.model.User;
import com.global.TP_Final_Integrador.singleton.UsersSingleton;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class UserService {

    //create user
    public ResponseEntity<ArrayList<User>> createUser(User newUser) {
        UsersSingleton us = UsersSingleton.getInstance();
        ArrayList<User> users = us.getUsers();

        User user = users.stream()
                .filter(u -> Objects.equals(u.getIdUser(), newUser.getIdUser()))
                .findFirst()
                .orElse(null);

        if(user == null){
            users.add(newUser);
            us.setUsers(users);
            return new ResponseEntity<>(users, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //Get users
    public ResponseEntity<ArrayList<User>> getUsers() {
        UsersSingleton us = UsersSingleton.getInstance();
        ArrayList<User> users = us.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //Get user by id
    public ResponseEntity<User> getUserById(Long id) {
        UsersSingleton us = UsersSingleton.getInstance();
        ArrayList<User> users = us.getUsers();
        User user = users.stream()
                .filter(u -> Objects.equals(u.getIdUser(), id))
                .findFirst()
                .orElse(null);

        if(user != null){
            return new ResponseEntity<>(user, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Edit user
    public ResponseEntity<User> editUser(User newUser) {
        UsersSingleton us = UsersSingleton.getInstance();
        ArrayList<User> users = us.getUsers();
        User user = users.stream()
                .filter(u -> Objects.equals(u.getIdUser(),newUser.getIdUser()))
                .findFirst()
                .orElse(null);

        if(user != null){
            user.setIdUser(newUser.getIdUser());
            user.setUserName(newUser.getUserName());
            user.setPassword(newUser.getPassword());
            user.setName(newUser.getName());
            user.setSurname(newUser.getSurname());
            user.setDateOfBirth(newUser.getDateOfBirth());
            user.setEmail(newUser.getEmail());
            user.setUserType(newUser.getUserType());
            return new ResponseEntity<>(user, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    //Delete user

    public ResponseEntity<ArrayList<User>> deleteUser(Long id) {
        UsersSingleton us = UsersSingleton.getInstance();
        ArrayList<User> users = us.getUsers();

        User user = users.stream()
                .filter(u -> Objects.equals(u.getIdUser(), id))
                .findFirst()
                .orElse(null);

        if(user != null){
            users.remove(user);
            us.setUsers(users);
            return new ResponseEntity<>(users, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
}
}
