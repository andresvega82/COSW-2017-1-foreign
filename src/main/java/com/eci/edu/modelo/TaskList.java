package com.eci.edu.modelo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 2099340 on 2/1/17.
 */

@Service
public class TaskList {
    public ArrayList<Task> taskArrayList = new ArrayList<Task>();


    public void agregarTarea(Task tarea){
        taskArrayList.add(tarea);
    }

    public ArrayList<Task> getTareas(){
        return taskArrayList;
    }
}

