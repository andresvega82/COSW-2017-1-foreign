package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by tata on 19/03/17.
 */
@Embeddable
public class TutorialId implements java.io.Serializable{

    private int id;
    private int TeachersId;
    private int studentId;

    public TutorialId(){

    }
    public TutorialId(int id,int teachersId, int studentId){
        this.id = id;
        this.TeachersId = teachersId;
        this.studentId = studentId;
    }


    @Column(name = "tutorial_id", nullable = false,unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "Teachers_teacher_id", nullable = false,unique = true)
    public int getTeachersId () {
        return TeachersId;
    }

    public void setTeachersId(int TeachersId) {
        this.TeachersId = TeachersId;
    }

    @Column(name = "Tutorials_tutorial_id", nullable = false,unique = true)
    public int getStudentId() {return studentId;}

    public void setStudentId(int studentId) {this.studentId = studentId;}
}
