package com.eci.edu.services;

import com.eci.edu.entities.Tutor;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by tata on 21/02/17.
 */


@Service
public class Tutores implements InterfaceTutores {
    private List<Tutor> tutores = new ArrayList<Tutor>();

    private Tutores(){

    }

    @Override
    public void updateTutor(Tutor t){

    }

    @Override
    public List<Tutor> getTutores(){
        Tutor t1 = new Tutor("Seth Rowan", 22, "Want to learn fast & have fun? I teach English/ French using music/film/ poetry/jornalism! Contact me to speed up your learning!.", "english");
        Tutor t2 = new Tutor("Stephanie Hourly", 26, "Lorem ipsum dolor sit amet consectetur et sed adipiscing elit. Curabitur vel sem sit dolor neque semper magna lorem ipsum.", "english");
        Tutor t3 = new Tutor("John Stephen Thomas", 21, "Want to learn fast & have fun? I teach English/ French using music/film/ poetry/jornalism! Contact me to speed up your learning!.", "english");
        tutores.add(t1);
        tutores.add(t2);
        tutores.add(t3);
        return tutores;
    }

    @Override
    public void addTutor (Tutor t){
        tutores.add(t);
    }

}
