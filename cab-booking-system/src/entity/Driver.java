package entity;

import java.util.UUID;
import java.util.HashMap;


public class Driver extends AbstractAccount {
  double rating;
  HashMap<UUID,CabBookingRequest> cabBookingRequests;
  
  
  public Driver(String name) {
	  super(name);
	  this.rating=3.0;
	  cabBookingRequests=new HashMap<>();
  }
  public Driver(String name,String dob) {
	  super(name,dob);
  }
  public Driver(String name,String dob,String address) {
	  super(name,dob,address);
  }
  
  public void addBookingRequest(CabBookingRequest cabBookingRequest) {
	  if(!cabBookingRequests.containsKey(cabBookingRequest.getid())) {
		  cabBookingRequests.put(cabBookingRequest.getid(), cabBookingRequest);
	  }	  
  }
  
  public void updateBookingRequest(CabBookingRequest cabBookingRequest) {
	  if(cabBookingRequests.containsKey(cabBookingRequest.getid())) {
		  cabBookingRequests.put(cabBookingRequest.getid(), cabBookingRequest);
	  }
  }
  
  public CabBookingRequest findBookingRequest(UUID id) {
	  if(cabBookingRequests.containsKey(id)) {
		  cabBookingRequests.get(id);
	  }
	  System.out.println("cab booking request not found with id:" + id.toString());
	  return null;
  }
  
}
