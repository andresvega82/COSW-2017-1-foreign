package com.eci.edu.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tata on 19/03/17.
 */

@Entity
@Table(name="Teachers")
public class Teacher implements Serializable {
    private String description = null;
    private TeacherId users_user_id;
    private Blob validateDocument;
    private List<Tutorial> tutorials = new ArrayList<Tutorial>();

    public Teacher(){

    }

    public Teacher( TeacherId users_user_id, String description,  Blob validateDocument){
        this.description = description;
        this.users_user_id = users_user_id;
        this.validateDocument = validateDocument;

    }

    @EmbeddedId
    public TeacherId getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(TeacherId users_user_id) {
        this.users_user_id = users_user_id;
    }

    @Column (name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Column (name = "ValidateDocument")
    public Blob getValidateDocument() {
        return validateDocument;
    }

    public void setValidateDocument(Blob validateDocument) {
        this.validateDocument = validateDocument;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name="Teachers_teacher_id"), @JoinColumn(name = "Users_user_id")})
    public List<Tutorial> getTutorials() {
        return tutorials;
    }

    public void setTutorials(List<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }

}
