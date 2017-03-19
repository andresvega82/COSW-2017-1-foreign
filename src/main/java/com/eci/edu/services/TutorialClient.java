package com.eci.edu.services;

import java.io.*;
import java.util.*;
import com.eci.edu.entities.Tutorial;
import org.springframework.stereotype.Service;


/**
 * Created on 17/02/17.
 */

@Service
public class TutorialClient implements interfaceTutorial{


    private List<Tutorial> tutorials = new ArrayList<Tutorial>();

    public void updateTutorial(Tutorial t){

    }
    @Override
    public List<Tutorial> getTutorials(){
        Date date = new Date();
        Tutorial t = new Tutorial();
        tutorials.add(t);
        /*Date date = new Date();
        Tutorial t = new Tutorial(1, , date, tutorialId, int languajeId, String state, Date date, int duration, TutorialId idTutor, int payment, int cost){);
        tutorials.add(t);*/
        System.out.println("Entro hasta tutoria del cliente"+ tutorials.size());
        return tutorials;
    }
    @Override
    public void addTutorial (Tutorial t){
        tutorials.add(t);
    }

    @Override
    public List<Tutorial> getTutorialByUserId(int id){
        return null;
    }
}
