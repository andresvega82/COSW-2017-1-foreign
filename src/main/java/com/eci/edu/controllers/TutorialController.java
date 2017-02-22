package com.eci.edu.controllers;
import com.eci.edu.entities.Tutorial;
import com.eci.edu.services.TutorialClient;
import com.eci.edu.services.interfaceTutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.InputStream;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created on 17/02/17.
 */

@RestController
@RequestMapping(value = "/tutorial")
public class TutorialController {

    @Autowired
    private interfaceTutorial services;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getTutorials(){
        return new ResponseEntity<>(services.getTutorials(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveTutorial(@RequestBody Tutorial tutorial){
        System.out.println("LLEGO AL POST!");
        System.out.println("entro"+ tutorial.getLanguaje()+"   "+ tutorial.getDate());
        try {
            services.addTutorial(tutorial);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @RequestMapping (value="/{id}",method = RequestMethod.POST)
    public void postTutoria(@PathVariable String id, @RequestBody Tutorial tutorial){
        System.out.println(id + " -----tutoria agregada api------ ");
        services.addTutorial(tutorial);
    }


}