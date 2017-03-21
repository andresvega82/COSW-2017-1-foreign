package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by tata on 19/03/17.
 */
@Embeddable
public class TeacherId implements Serializable {
    private Integer teacher_id;
    private String users_user_id;

    public TeacherId(){

    }

    public TeacherId(int teacher_id, String userId){
        this.teacher_id = teacher_id;
        this.users_user_id = userId;

    }

    @Column (name = "teacher_id")
    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Column (name = "Users_user_id")
    public String getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(String users_user_id) {
        this.users_user_id = users_user_id;
    }
}
