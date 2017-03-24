package com.eci.edu.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tata on 19/03/17.
 */

@Entity
@Table(name="Languajes")
public class Languaje {
    private int lenguajeId;
    private String desciption;

    public Languaje(){

    }
    public Languaje(int lenguajeId, String desciption){
        this.lenguajeId = lenguajeId;
        this.desciption = desciption;

    }

    @Id
    @Column( name = "lenguaje_id")
    public int getLenguajeId() {
        return lenguajeId;
    }

    public void setLenguajeId(int lenguajeId) {
        this.lenguajeId = lenguajeId;
    }

    @Column (name = "description")
    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

}
