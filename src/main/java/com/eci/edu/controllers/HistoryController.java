package com.eci.edu.controllers;

import com.eci.edu.services.InterfaceTeachers;
import com.eci.edu.services.InterfaceTutorials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2098165 on 4/26/17.
 */

@RestController
@RequestMapping(value = "/history")
public class HistoryController {

    @Autowired
    InterfaceTutorials services;



    @RequestMapping(path = "/{username}",method = RequestMethod.GET)
    public ResponseEntity<?> getTutorials(@PathVariable String username) {
        return new ResponseEntity<>(services.getHistory(username), HttpStatus.ACCEPTED);
    }
}