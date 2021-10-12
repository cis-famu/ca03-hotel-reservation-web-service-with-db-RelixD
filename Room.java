/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca03hotelreservation;

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
public class Room {
private int floor;
private @XmlAttribute int roomNumber;
private String bedtype; 

public Room(){

}
public Room(int floor, int roomNumber, String bedtype) {
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.bedtype = bedtype;
    }
    public void setFloor(int floor){this.floor = floor;}
    public void setRoomNumber(int roomNumber){this.roomNumber = roomNumber;}
    public void setBedtype(String bedtype){this.bedtype = bedtype;}
    
    public int getFloor() {return floor;}
    public int getRoomNumber(){return roomNumber;}
    public String getBedtype(){return bedtype;}

    

}
