package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import java.sql.Blob;

/**
 * Created by tata on 19/03/17.
 */
public class Teacher {
    private int teacherId;
    private String description;
    private TeacherId userId;
    private Blob validateDocument;

    public Teacher(){

    }

    public Teacher(int teacherId, String description, TeacherId userId, Blob validateDocument){
        this.teacherId = teacherId;
        this.description = description;
        this.userId = userId;
        this.validateDocument = validateDocument;

    }

    @Id
    @Column (name = "teacher_id")
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Column (name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @EmbeddedId
    public TeacherId getUserId() {
        return userId;
    }

    @Column (name = "ValidateDocument")
    public Blob getValidateDocument() {
        return validateDocument;
    }

    public void setValidateDocument(Blob validateDocument) {
        this.validateDocument = validateDocument;
    }
}
