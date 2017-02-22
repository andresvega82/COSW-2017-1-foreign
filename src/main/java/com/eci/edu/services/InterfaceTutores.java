package com.eci.edu.services;

import com.eci.edu.entities.Tutor;

import java.util.*;
/**
 * Created by tata on 21/02/17.
 */
public interface InterfaceTutores {

    public void updateTutor(Tutor t);
    public List<Tutor> getTutores();
    public void addTutor (Tutor t);

}
