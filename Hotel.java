/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca03hotelreservation;

/**
 *
 * @author Relo's PC
 */
public class Hotel extends Room{
    private String hotelName;
 private String address;
 private long phoneNumber;
 
public Hotel (){

}

 
    public Hotel(String hotelName, String address, long phoneNumber, int floor, int roomNumber, String bedtype) {
        super(floor, roomNumber, bedtype);
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

}
