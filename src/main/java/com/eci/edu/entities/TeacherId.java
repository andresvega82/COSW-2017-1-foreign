package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by tata on 19/03/17.
 */
@Embeddable
public class TeacherId implements java.io.Serializable{
    private int teacherId;
    private String userId;

    public TeacherId(){

    }

    public TeacherId(int teacherId, String userId){
        this.teacherId = teacherId;
        this.userId = userId;

    }

    @Column (name = "teacher_id")
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Column (name = "Users_user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
