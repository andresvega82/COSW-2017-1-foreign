package com.eci.edu.services;


import java.util.ArrayList;
import com.eci.edu.entities.Tutorial;
import org.springframework.stereotype.Service;


/**
 * Created on 17/02/17.
 */

@Service
public class TutorialClient implements interfaceTutorial{


    private ArrayList<Tutorial> tutorials = new ArrayList<Tutorial>();

    public void updateTutorial(Tutorial t){

    }
    @Override
    public ArrayList<Tutorial> getTutorials(){
        return tutorials;
    }
    @Override
    public void addTutorial (Tutorial t){
        tutorials.add(t);
    }
    @Override
    public ArrayList<Tutorial> getTutorialByUserId(Integer id){
        return null;
    }
}
