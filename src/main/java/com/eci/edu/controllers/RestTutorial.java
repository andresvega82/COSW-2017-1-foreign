package com.eci.edu.controllers;
import com.eci.edu.services.TutorialClient;
import com.eci.edu.services.interfaceTutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.InputStream;
import java.util.Set;

/**
 * Created on 17/02/17.
 */

@RestController
@RequestMapping(value = "/tutorial")
public class RestTutorial {

    @Autowired
    private interfaceTutorial services;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getTutorials(){
        System.out.println("entro hasta el rest de tutorial");
        return new ResponseEntity<>(services.getTutorials(), HttpStatus.ACCEPTED);
    }


}