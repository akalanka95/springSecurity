package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.domain.Response;
import com.epiclanka.supportTest.model.User;
import com.epiclanka.supportTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreLoginController {
    @Autowired private UserService userService;

    @PostMapping(value = "/registration")
    public ResponseEntity<Response> registration(@RequestBody User user){
            User dbUser = userService.save(user);
            if(dbUser!=null){
                return new ResponseEntity<Response>(new Response("User is saved successfuly"), HttpStatus.OK);
            }
            return null;
    }

}
