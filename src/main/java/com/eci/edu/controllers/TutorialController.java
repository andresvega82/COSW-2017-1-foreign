package com.eci.edu.controllers;
import com.eci.edu.entities.Tutorial;
import com.eci.edu.services.InterfaceTeachers;
import com.eci.edu.services.InterfaceTutorials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created on 17/02/17.
 */

@RestController
@RequestMapping(value = "/tutorial")
public class TutorialController {

    @Autowired
    InterfaceTutorials services;

    @Autowired
    InterfaceTeachers service1;

    @RequestMapping(method = RequestMethod.GET, value = "/tutores/{params}")
    public ResponseEntity<?> getTutorials(@PathVariable Integer id){
        System.out.println("ENTRA AL GET");
        //System.out.println("Get "+services.getTutorials());
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tutoresMobile")
    public ResponseEntity<?> getTutoriaslMobile(){
        return new ResponseEntity<>(services.getTutorials(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST)
    //posttutoria
    public void saveTutorial(@RequestBody Tutorial tutorial){
        System.out.println("LLEGO AL POST!");
       // System.out.println("entro guardar una tutoria api"+ tutorial.getLanguajeId()+"   "+ tutorial.getDate());
        try {
            services.addTutorial(tutorial);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @RequestMapping (value="/{id}",method = RequestMethod.POST)
    //
    public void postTutoria(@PathVariable String id, @RequestBody Tutorial tutorial){
        System.out.println(id + " -----tutoria agregada api------ ");
        services.addTutorial(tutorial);
    }


}
