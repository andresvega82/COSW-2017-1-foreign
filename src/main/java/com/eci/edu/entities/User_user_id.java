package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by nicolasguzmanp on 19/03/17.
 */
@Embeddable
public class User_user_id implements Serializable {

    private Integer student_id;
    private String users_user_id;

    public User_user_id(){

    }

    public User_user_id(int student_id, String users_user_id){
        this.student_id=student_id;
        this.users_user_id=users_user_id;
    }

    @Column(name="student_id")
    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    @Column(name="User_user_id")
    public String getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(String users_user_id) {
        this.users_user_id = users_user_id;
    }
}
