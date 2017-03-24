package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by nicolasguzmanp on 19/03/17.
 */
@Embeddable
public class StudentId implements Serializable {

    private Integer student_id;
    private String user_id;

    public StudentId(){

    }

    public StudentId(int student_id, String user_id){
        this.student_id = student_id;
        this.user_id = user_id;
    }

    @Column(name="student_id", nullable = false, unique = true)
    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    @Column(name="Users_user_id", nullable = false, unique = true)
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
