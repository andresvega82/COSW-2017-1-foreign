package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * Created by tata on 19/03/17.
 */
@Embeddable
public class TutorialId implements java.io.Serializable{

    private Integer tutorialId;
    private int teachersId;

    public TutorialId(){

    }
    public TutorialId(int id,int teachersId){
        this.tutorialId = id;
        this.teachersId = teachersId;
    }

    @Column(name = "tutorial_id", nullable = false,unique = true)
    public int getId() {
        return tutorialId;
    }

    public void setId(int id) {
        this.tutorialId = id;
    }

    @Column(name = "Teachers_teacher_id", nullable = false,unique = true)
    public int getTeachersId () {
        return teachersId;
    }

    public void setTeachersId(int TeachersId) {
        this.teachersId = TeachersId;
    }

}