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
        Tutorial t = new Tutorial("English", date, date, 20, 1, 1);
        tutorials.add(t);
        System.out.println("Entro hasta tutoria del cliente"+ tutorials.size());
        return tutorials;
    }
    @Override
    public void addTutorial (Tutorial t){
        tutorials.add(t);
    }
    @Override
    public List<Tutorial> getTutorialByUserId(Integer id){
        return null;
    }
}
