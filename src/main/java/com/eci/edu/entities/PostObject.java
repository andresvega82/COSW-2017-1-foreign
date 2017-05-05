package com.eci.edu.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Nicolas M on 24/03/2017.
 */
public class PostObject implements Serializable{
    private int paymentId;
    private int cardNumber;
    private Date expirationDate;
    private int postalCode;
    private int cvv;
    private String user_id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String country;
    private Integer age;
    private String photo;
    PostObject(){

    }
    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }

    private String isStudent;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "PostObject{" +
                "paymentId=" + paymentId +
                ", cardNumber=" + cardNumber +
                ", expirationDate=" + expirationDate +
                ", postalCode=" + postalCode +
                ", cvv=" + cvv +
                ", user_id='" + user_id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", photo="+photo+
                '}';
    }
}
