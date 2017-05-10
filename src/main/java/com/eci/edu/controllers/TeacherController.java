package com.eci.edu.controllers;


import com.eci.edu.services.InterfaceTeachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tata on 22/02/17.
 */

@RestController
@RequestMapping(value = "/tutores")
public class TeacherController {

    @Autowired
    private InterfaceTeachers service;

    @RequestMapping(method = RequestMethod.GET, path = "/tutor/{id}")
    public ResponseEntity<?> getTutores(@PathVariable Integer id){
        System.out.println("Lista de los tutores get en el api");
        return new ResponseEntity<>(service.getTutorById(id), HttpStatus.ACCEPTED);
    }

    
}
