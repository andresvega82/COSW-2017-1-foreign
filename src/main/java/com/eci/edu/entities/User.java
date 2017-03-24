package com.eci.edu.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private Set<Languaje> languajes = new HashSet<>(0);

    public User(){

    }

    public User(String id, String name, String lastName, String email, String phone, String country, Integer Age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.user_id = id;
        this.age = Age;
    }

    public User(String id, String name, String lastName, String email, String phone, String country, Integer Age, Set<Languaje> languajes) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.user_id = id;
        this.age = Age;
        this.languajes = languajes;
    }




    @Column
    @Id
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column
    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }


    @Column
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //@ManyToMany(cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name="Users_user_id",nullable = false)})

    public Set<Languaje> getLanguajes() {
        return languajes;
    }

    public void setLanguajes(Set<Languaje> languajes) {
        this.languajes = languajes;
    }


    @Override
    public String toString(){
        return user_id+" "+name+" "+lastName+" "+age+" "+email+" "+country+" "+phone;
    }
}
