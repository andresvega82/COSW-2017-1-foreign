package com.eci.edu.modelo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
/**
 * Created by 2099340 on 2/1/17.
 */


public class Task {

    public String descripcion;
    public int prioridad;


    public Task(int prio,String desc) {
        this.prioridad = prio;
        this.descripcion = desc +"";
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }

    public int getPrioridad(){
        return prioridad;
    }




}
