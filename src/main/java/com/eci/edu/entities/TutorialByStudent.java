package com.eci.edu.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by 2099340 on 5/10/17.
 */

@Entity
@Table(name="Tutorials_Students")
public class TutorialByStudent implements java.io.Serializable{
    private TutorialByStudentId tutorialByStudentId;



    public TutorialByStudent(){

    }

    public TutorialByStudent(TutorialByStudentId tutorialByStudentId) {
        this.tutorialByStudentId = tutorialByStudentId;
    }

    @EmbeddedId
    public TutorialByStudentId getTutorialByStudentId() {
        return tutorialByStudentId;
    }

    public void setTutorialByStudentId(TutorialByStudentId tutorialByStudentId) {
        this.tutorialByStudentId = tutorialByStudentId;
    }
}
