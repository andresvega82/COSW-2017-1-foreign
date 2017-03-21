package com.eci.edu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 2101738 on 3/21/17.
 */

@Entity
@Table(name="CreditCard")
public class CreditCard {
    private int paymentId;
    private int cardNumber;
    private Date expirationDate;
    private int postalCode;
    private int cvv;

    public CreditCard(){

    }

    public CreditCard(int paymentId, int cardNumber, Date expirationDate, int postalCode, int cvv){

        this.paymentId = paymentId;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.postalCode = postalCode;
        this.cvv = cvv;

    }

    @Id
    @Column( name = "payment_id")
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Column (name = "numero_tarjeta")
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Column (name = "fecha_vencimiento")

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Column (name = "codigo_postal")
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Column (name = "cvv")
    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
