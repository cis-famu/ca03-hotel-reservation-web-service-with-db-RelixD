/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca03hotelreservation.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.mycompany.ca03hotelreservation.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import javax.jws.WebService;

/**
 *
 * @author Relo's PC
 */
@WebService
public class ReservationService extends DBConnection{
   private final ArrayList<Reservation> list = new ArrayList<>();
   
   public ReservationService(){ 
 
   Reservation reserve1 = new Reservation(1,21,"10-17-2020","10-18-2020","10-20-2020","10-22-2020", 2, 0,"Carlton","Paid","Expedia", "refundable");
   }

// Get a reservation by confirmationNum
   public Reservation findByconfirmationNumber(int confirmationNumber){
     for(Reservation reserve : list){
         if(reserve.getConfirmationNumber() == confirmationNumber)
             return reserve;
     }
     return null;
 }
   //Get all reservations by customerId
   public ArrayList<Reservation> findBycustomerId(int customerId){
    
    ArrayList<Reservation> resultList = new ArrayList<>();
    
    for(Reservation reserve : list){
         if(reserve.getCustomerId() == customerId)
             resultList.add(reserve);
}
    return resultList;
}
   // Get all reservations completed within a data range
   
   // Gell all reservations after a checkin date
   public ArrayList<Reservation> findbySubmittedDate(Date checkIn){
     ArrayList<Reservation> returnList = new ArrayList<>();
   
           for(int i = 0; i < list.size(); ++i)
   {
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       String objDate = formatter.format(list.get(i).getCheckIn());
       
       if(objDate.compareTo(formatter.format(checkIn)) == 0)
           returnList.add(list.get(i));
   }
   
         return null;
   }
   // Get all reservations by payment status
   public List<Reservation> all() throws InterruptedException, ExecutionException {
      List<Reservation> resultList = new ArrayList<>();
    ApiFuture<QuerySnapshot> query = db.collection("Reservations").get();
      
      QuerySnapshot querySnapshot = query.get();
      
      List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
      
      //loop over result set
      for(QueryDocumentSnapshot document : documents)
          resultList.add(document.toObject (Reservation.class));
      
       return resultList;
   }
   // Get all reservations by platform
    public ArrayList<Reservation> findByplatform(String platform){
    
    ArrayList<Reservation> resultList = new ArrayList<>();
    
    for(Reservation reserve : list){
         if(reserve.getPlatform() == platform)
             resultList.add(reserve);
}
    return resultList;
    }
    
    // Create New Reservation
    public String createReservation(int customerId, int confirmationNumber, Date completed, Date checkIn, Date checkOut, int adultGuest, int minorguest, String reservationName, String paymentStatus, String platform, String cancellationPolicy) throws ParseException, InterruptedException, ExecutionException {

  
	//create date format that doesn't include time
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
	//get the current date as a string
	String now = formatter.format(new Date(System.currentTimeMillis()));

	//create submitted date
	Date submitted = formatter.parse(now);
  
	// create instance of Random class
	Random rand = new Random();

	// Generate random integers in range 0 to 9999
	int id = rand.nextInt(10000);
	
	
	//create purchase order
	Reservation newReserve = new Reservation(customerId,confirmationNumber,completed, checkIn, checkOut, adultGuest, minorguest,reservationName, paymentStatus, platform, cancellationPolicy);
	//save values to database
	ApiFuture<DocumentReference> future = db.collection("Reservations").add(newReserve);
	
	//retrieve newly created document(row)
	DocumentReference doc = future.get();
   
    //return the document id;
	return doc.getId();
	
 
}
    
    
}
