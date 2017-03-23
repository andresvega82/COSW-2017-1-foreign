package com.eci.edu.services;

import com.eci.edu.entities.Teacher;

import java.util.*;
/**
 * Created by tata on 21/02/17.
 */
public interface InterfaceTeachers {

    public void updateTutor(Teacher t);
    public List<Teacher> getTutores();
    public void addTutor (Teacher t);

}
