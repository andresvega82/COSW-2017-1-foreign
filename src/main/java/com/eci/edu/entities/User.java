package com.eci.edu.entities;

/**
 *
 */
public class User {
    private String firtsName;
    private String lastName;
    private String email;
    private String number;
    private String country;
    private String password;

    public User(String firtsName, String lastName, String email, String number, String country, String password) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
        this.country = country;
        this.password = password;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
