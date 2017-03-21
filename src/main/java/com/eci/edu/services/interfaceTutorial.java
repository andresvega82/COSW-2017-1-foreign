package com.eci.edu.services;

import com.eci.edu.entities.Tutorial;

import java.util.*;
/**
 * Created on 17/02/17.
 */
public interface interfaceTutorial {

    public void updateTutorial(Tutorial t);
    public List<Tutorial> getTutorials();
    public void addTutorial (Tutorial t);
    public List<Tutorial> getTutorialByUserId(Integer id);
}
