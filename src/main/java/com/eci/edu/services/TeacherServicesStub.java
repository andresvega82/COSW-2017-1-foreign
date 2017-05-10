package com.eci.edu.services;

import com.eci.edu.entities.Teacher;
import com.eci.edu.entities.User;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by tata on 21/02/17.
 */


//@Service
public class TeacherServicesStub implements InterfaceTeachers {
    private List<Teacher> tutores = new ArrayList<Teacher>();

    private TeacherServicesStub(){

    }

    @Override
    public void updateTutor(Teacher t){

    }

    @Override
    public List<Teacher> getTutores(){
        //Teacher t1 = new Teacher("Seth Rowan", 22, "Want to learn fast & have fun? I teach English/ French using music/film/ poetry/jornalism! Contact me to speed up your learning!.", "english");
        //Teacher t2 = new Teacher("Stephanie Hourly", 26, "Lorem ipsum dolor sit amet consectetur et sed adipiscing elit. Curabitur vel sem sit dolor neque semper magna lorem ipsum.", "english");
        //Teacher t3 = new Teacher("John Stephen Thomas", 21, "Want to learn fast & have fun? I teach English/ French using music/film/ poetry/jornalism! Contact me to speed up your learning!.", "english");
        //tutores.add(t1);
        //tutores.add(t2);
        //tutores.add(t3);
        return tutores;
    }

    @Override
    public void addTutor (Teacher t){
        tutores.add(t);
    }

    @Override
    public User getTutorById(Integer id) {
        return null;
    }

}
