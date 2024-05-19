package entity;

import enums.RiderStatus;

import java.util.HashMap;
import java.util.UUID;

public class Rider {
	
 RiderAccount rider;
 RiderStatus status;
 Location location;
 double rating;
 HashMap<UUID,CabBookingRequest> bookingRequests;
 
 
 public Rider(RiderAccount rider,Location location)
 {   
	 this.bookingRequests = new HashMap<>();
	 this.rider=rider;
	 this.location=location;
	 this.status=RiderStatus.FREE;
	 this.rating=3.0;
 }
 
 public RiderAccount getRiderAccount() {
	 return rider;
 }
 public RiderStatus getRiderStatus() {
	 return status;
 }
 public Location getLocation() {
	 return location;
 }
 public double getRating() {
	 return rating;
 }
 public void setRating(double rating) {
	 this.rating=rating;
 }
 public HashMap<UUID,CabBookingRequest> getCabBookingRequest(){
	 return bookingRequests;
 }
 public void setLocation(Location location) {
	 this.location=location; 
 }
 
 public void setStatus(RiderStatus status) {
	 this.status=status;
 }

 public void addCabBookingRequest(CabBookingRequest cabBookingRequest) {
	 if(!bookingRequests.containsKey(cabBookingRequest.getid())) {
		  bookingRequests.put(cabBookingRequest.getid(), cabBookingRequest) ;
	 }
 }
 public void updateBookingRequest(CabBookingRequest cabBookingRequest) {
	 if(bookingRequests.containsKey(cabBookingRequest.getid())) {
		 bookingRequests.put(cabBookingRequest.getid(), cabBookingRequest);
	 }
 }
 
 public CabBookingRequest findBookingRequest(UUID id) {
	 if(bookingRequests.containsKey(id)) {
		 return bookingRequests.get(id);			 
	 }
	 System.out.println("Booking request is not found for the id :"+id.toString());
	 return null;
 }
 
 
}
