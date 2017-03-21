package com.eci.edu.entities;


import javax.persistence.*;
import java.util.*;
/**
 * Created by foreign on 17/02/17.
 */

@Entity
@Table(name = "Tutorials")
public class Tutorial {
    public void setLanguajeId(int languajeId) {
        this.languajeId = languajeId;
    }

    public void setIdTutor(TutorialId idTutor) {
        this.idTutor = idTutor;
    }

    public int getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(int tutorialId) {
        this.tutorialId = tutorialId;
    }

    private int languajeId;
    private Date date;
    private String state;
    private int duration;
    private TutorialId idTutor;
    private int tutorialId;
    private int payment;
    private int cost;


    public Tutorial(){

    }

    public Tutorial(int tutorialId, int languajeId, String state, Date date, int duration, TutorialId idTutor, int payment, int cost){
        this.tutorialId = tutorialId;
        this.idTutor = idTutor;
        this.date = date;
        this.duration = duration;
        this.languajeId = languajeId;
        this.state = state;
        this.payment = payment;
        this.cost = cost;
    }

    @Column(name = "tutoria_id")
    public int getTutorial_id() {
        return tutorialId;
    }

    public void setTutorial(int tutorial_id) {
        this.tutorialId = tutorial_id;
    }


    @Column(name = "languaje_id")
    public int getLanguajeId() {
        return languajeId;
    }

    public void setLanguaje(int lenguajeId) {
        this.languajeId = lenguajeId;
    }


    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state= state;
    }


    @Column(name = "payment")
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Column(name = "cost")
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @EmbeddedId
    public TutorialId getIdTutor() {
        return idTutor;
    }


}
