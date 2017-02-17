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

    public Tutorial(String languaje, Date date, Date startTime, int duration, int idClient, int idTutor){
        this.languaje = languaje;
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
        this.idClient = idClient;
        this.idTutor = idTutor;
    }

}
