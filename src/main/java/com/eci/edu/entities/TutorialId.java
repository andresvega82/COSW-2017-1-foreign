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
    private int LenguajeId;

    public TutorialId(){

    }
    public TutorialId(int id,int teachersId,int lenguajeId){
        this.id = id;
        this.TeachersId = teachersId;
        this.LenguajeId = lenguajeId;
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

    @Column(name = "languaje_id", nullable = false,unique = true)
    public int getLenguajeId() {
        return LenguajeId;
    }

    public void setLenguajeId(int lenguajeId) {
        LenguajeId = lenguajeId;
    }
}
