package com.eci.edu.entities;

import java.sql.Blob;

/**
 * Created by Nicolas M on 10/05/2017.
 */
public class PostPhoto {

    private String photo;
    private String user_id;

    public PostPhoto() {
    }

    public PostPhoto(String photo, String user_id) {
        this.photo = photo;
        this.user_id = user_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
