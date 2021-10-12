/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca03hotelreservation.Endpoint;

import com.mycompany.ca03hotelreservation.Reservation;
import com.mycompany.ca03hotelreservation.Service.ReservationService;
import java.util.Date;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Relo's PC
 */
@WebService
public class Reservations {
    private final ReservationService service = new ReservationService();
   
   
    // ConfirmationNum function
    @WebResult(name="Reservation")
    public Reservation getByconfirmationNumber(@WebParam(name="Confirmation") int confirmationNumber)
    {
        return service.findByconfirmationNumber(confirmationNumber);
    }
    
    //Get all reservations by customerNo function
    @WebResult(name="Reservation")
    public List <Reservation> getByCustomerId(@WebParam(name="customerId")int customerid){
    
        return service.findBycustomerId(customerid);
    }
    
     // Get all reservations after a checkin date 
    @WebResult(name="Reservation")
    public List<Reservation> getBySubmittedDate(@WebParam(name = "submittedDate") Date checkIn){
      return service.findbySubmittedDate(checkIn);
    }
    // Get all reserves by platform
    @WebResult(name="Reservation")
    public List<Reservation> getByPlatform(@WebParam(name = "Platform") String platform){
      return service.findByplatform(platform);
    }
    
}

