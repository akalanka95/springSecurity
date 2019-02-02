package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.User;
import com.epiclanka.supportTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    @Autowired private UserService userService;

    @GetMapping(value = "/users")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/getuser")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<User> getUser(Principal principal){
        User users = userService.getUserByEmail(principal.getName());
        return new ResponseEntity<User>(users, HttpStatus.OK);
    }
}
