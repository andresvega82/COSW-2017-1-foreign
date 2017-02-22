package com.eci.edu.controllers;


import com.eci.edu.services.InterfaceTutores;
import com.eci.edu.entities.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tata on 22/02/17.
 */

@RestController
@RequestMapping(value = "/tutores")
public class TutorController {

    @Autowired
    private InterfaceTutores service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getTutores(){
        System.out.println("Lista de los tutores get en el api");
        return new ResponseEntity<>(service.getTutores(), HttpStatus.ACCEPTED);
    }
}
