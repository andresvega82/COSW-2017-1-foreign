package com.eci.edu.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 2098165 on 2/16/17.
 */
@Entity
@Table(name="Students")
public class Student implements Serializable {
    private User_user_id users_user_id;
    private String description= null;

    public Student(User_user_id nombreUsuario, String d){
        this.users_user_id=nombreUsuario;
        this.description=d;
    }

    public Student(){

    }


    @EmbeddedId
    public User_user_id getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(User_user_id users_user_id) {
        this.users_user_id = users_user_id;
    }

    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
