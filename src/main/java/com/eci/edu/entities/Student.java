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
public class Student  implements Serializable{
    private StudentId studentid;
    private String description= null;
    private Set<Tutorial> tutorials = new HashSet<>(0);

    public Student(StudentId nombreUsuario, String d){
        this.studentid = nombreUsuario;
        this.description=d;
    }

    public Student(StudentId nombreUsuario, String d, Set tutorials){
        this.studentid = nombreUsuario;
        this.description=d;
        this.tutorials = tutorials;
    }

    public Student(){

    }

    @EmbeddedId
    public StudentId getStudentid() {
        return studentid;
    }

    public void setStudentid(StudentId studentid) {
        this.studentid = studentid;
    }


    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="Tutorials_Students",
            joinColumns = {@JoinColumn(name="Students_student_id",referencedColumnName = "student_id",nullable = false)},
            inverseJoinColumns = {@JoinColumn(name="Tutorials_tutorial_id",referencedColumnName = "tutorial_id",nullable = false)}
    )
    public Set<Tutorial>  getTutorials() {
        return this.tutorials;
    }

    public void setTutorials(Set tutorials) {
        this.tutorials = tutorials;
    }


}
