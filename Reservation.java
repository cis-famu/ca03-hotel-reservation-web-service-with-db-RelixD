/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca03hotelreservation;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Relo's PC
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
private @XmlAttribute int customerId;
private @XmlAttribute int confirmationNumber;
private @XmlAttribute Date completed;
private @XmlAttribute Date checkIn;
private @XmlAttribute Date checkOut;
private int adultGuest;
private int minorguest;
private String reservationName;
private @XmlAttribute String paymentStatus;
private @XmlAttribute String platform;
private String cancellationPolicy;

public Reservation (){
    
}

    public Reservation(int customerId, int confirmationNumber, Date completed, Date checkIn, Date checkOut, int adultGuest, int minorguest, String reservationName, String paymentStatus, String platform, String cancellationPolicy) {
        this.customerId = customerId;
        this.confirmationNumber = confirmationNumber;
        this.completed = completed;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.adultGuest = adultGuest;
        this.minorguest = minorguest;
        this.reservationName = reservationName;
        this.paymentStatus = paymentStatus;
        this.platform = platform;
        this.cancellationPolicy = cancellationPolicy;
    }

    public Reservation(int i, int i0, String string, String string0, String string1, String string2, int i1, int i2, String carlton, String paid, String expedia, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setAdultGuest(int adultGuest) {
        this.adultGuest = adultGuest;
    }

    public void setMinorguest(int minorguest) {
        this.minorguest = minorguest;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public Date getCompleted() {
        return completed;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public int getAdultGuest() {
        return adultGuest;
    }

    public int getMinorguest() {
        return minorguest;
    }

    public String getReservationName() {
        return reservationName;
    }

    public String isPaymentStatus() {
        return paymentStatus;
    }

    public String getPlatform() {
        return platform;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

 
}
