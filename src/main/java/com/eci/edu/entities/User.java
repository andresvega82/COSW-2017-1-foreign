package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Blob;

/**
 *
 */
@Entity
@Table(name = "Users")
public class User implements Serializable {
    private String user_id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String country;
    private Blob photo;
    private Integer age;

    public User(){

    }

    public User(String  id, String name, String lastName, String email, String phone, String country, Integer Age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.user_id = id;
        this.age = Age;
    }


    @Id
    @Column (name = "user_id")
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Column (name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column (name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column (name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column (name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column (name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column (name = "photo")
    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }


    @Column (name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return user_id+" "+name+" "+lastName+" "+age+" "+email+" "+country+" "+phone;
    }
}
