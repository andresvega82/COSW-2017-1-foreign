package com.eci.edu.controllers;


import com.eci.edu.entities.User;
import com.eci.edu.services.UserServicesStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nicolas M on 17/03/2017.
 */

@RestController
@RequestMapping(value = "/app")
public class RegisterController {

    @Autowired
    private UserServicesStub handler;

    @RequestMapping(value="/addUser",method = RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestBody User user) throws Exception{
        handler.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
