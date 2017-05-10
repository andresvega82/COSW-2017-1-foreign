package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by 2099340 on 5/10/17.
 */


@Embeddable
public class TutorialByStudentId implements Serializable {

    private Integer Students_student_id;
    private Integer Tutoriasl_tutorial_id;

    public TutorialByStudentId(){


    }


    @Column(name="Students_student_id")
    public Integer getStudents_student_id() {
        return Students_student_id;
    }

    public void setStudents_student_id(Integer students_student_id) {
        Students_student_id = students_student_id;
    }

    @Column(name="Tutorials_tutorial_id")
    public Integer getTutoriasl_tutorial_id() {
        return Tutoriasl_tutorial_id;
    }

    public void setTutoriasl_tutorial_id(Integer tutoriasl_tutorial_id) {
        Tutoriasl_tutorial_id = tutoriasl_tutorial_id;
    }
}
