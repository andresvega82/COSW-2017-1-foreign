package com.eci.edu.services;

import com.eci.edu.entities.Teacher;
import com.eci.edu.entities.User;

import java.util.*;
/**
 * Created by tata on 21/02/17.
 */
public interface InterfaceTeachers {

    public void updateTutor(Teacher t);
    public List<Teacher> getTutores();
    public void addTutor (Teacher t);
    public User getTutorById(Integer id);

}
