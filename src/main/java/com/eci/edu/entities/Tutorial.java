package com.eci.edu.entities;


import java.util.Date;
/**
 * Created by tata on 17/02/17.
 */

public class Tutorial {
    private String languaje;
    private Date date;
    private Date startTime;
    private int duration;
    private int idClient;
    private int idTutor;


    public Tutorial(){

    }

    public Tutorial(String languaje, Date date, Date startTime, int duration, int idClient, int idTutor){
        this.languaje = languaje;
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
        this.idClient = idClient;
        this.idTutor = idTutor;
    }

    public String getLanguaje() {
        return languaje;
    }

    public void setLanguaje(String languaje) {
        this.languaje = languaje;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }



}
