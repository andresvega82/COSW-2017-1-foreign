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
}
