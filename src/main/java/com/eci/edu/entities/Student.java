package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by 2098165 on 2/16/17.
 */
@Entity
@Table(name="Students")
public class Student implements Serializable {
    private Integer student_id;
    private String users_user_id;
    private String description= null;

    public Student(Integer id, String nombreUsuario, String d){
        this.student_id = id;
        this.users_user_id=nombreUsuario;
        this.description=d;
    }

    @Id
    @Column(name ="student_id")
    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    @Column(name ="users_user_id")
    public String getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(String users_user_id) {
        this.users_user_id = users_user_id;
    }

    @Column(name ="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
