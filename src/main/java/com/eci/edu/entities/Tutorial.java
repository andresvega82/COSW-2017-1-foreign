package com.eci.edu.entities;


import javax.persistence.*;
import java.util.*;
/**
 * Created by foreign on 17/02/17.
 */
@Entity
@Table(name = "Tutorials")
public class Tutorial implements java.io.Serializable{

    private Date date;
    private String state;
    private int duration;
    private TutorialId idTutor;
    private int payment;
    private int cost;
    private Set<Student> students = new HashSet<Student>();


    public Tutorial(){

    }

    public Tutorial( String state, Date date, int duration, TutorialId idTutor, int payment, int cost){
        this.idTutor = idTutor;
        this.date = date;
        this.duration = duration;

        this.state = state;
        this.payment = payment;
        this.cost = cost;
    }

    public Tutorial( String state, Date date, int duration, TutorialId idTutor, int payment, int cost, Set students){
        this.idTutor = idTutor;
        this.date = date;
        this.duration = duration;

        this.state = state;
        this.payment = payment;
        this.cost = cost;
        this.students = students;
    }

    @Temporal(TemporalType.TIMESTAMP)
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

    public void setIdTutor(TutorialId idTutor) {
        this.idTutor = idTutor;
    }


    @ManyToMany(cascade=CascadeType.ALL, mappedBy = "tutorials" )
    public Set<Student> getStudents() {
        return this.students;
    }

    public void setStudents(Set<Student > students) {
        this.students = students;
    }
}
