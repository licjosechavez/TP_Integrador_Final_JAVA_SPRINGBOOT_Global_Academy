package com.global.TP_Final_Integrador.controller;

import com.global.TP_Final_Integrador.model.Category;
import com.global.TP_Final_Integrador.model.User;
import com.global.TP_Final_Integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Create users

    /*@PostMapping(
            value = "/users/create",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<ArrayList<User>> createUser(
            @RequestBody User newUser

    ) {
        ResponseEntity<ArrayList<User>> userss = userService.createUser(newUser);
        return new ResponseEntity<>(userss, HttpStatus.CREATED);

    }*/
    //


    //Get Users

    @GetMapping(
            value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<ArrayList<User>> getUsers() {
        return userService.getUsers();
    }

    //Get user by id

    @GetMapping(
            value = "/users/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<User> getUserById(
            @PathVariable(name = "id") Long id
    ) {
        return userService.getUserById(id);

    }

    //delete user
    @DeleteMapping(
            value = "/users/delete/{id}"

    )
    @ResponseBody
    public ResponseEntity<ArrayList<User>> deleteUser(
            @PathVariable(name = "id") long id
    ) {

        return userService.deleteUser(id);

    }


}
