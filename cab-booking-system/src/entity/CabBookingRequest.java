package entity;

import java.time.LocalDateTime;
import java.util.UUID;

import enums.CabBookingStatus;


public class CabBookingRequest {
 UUID id;
 Location from;
 Location to;
 Rider riderInfo;
 LocalDateTime date;
 CabBookingStatus status;
 String assignedTo;
 
 public CabBookingRequest(Location from,Location to, Rider rider) {
	 this.id=UUID.randomUUID();
	 this.from=from;
	 this.to=to;
	 this.riderInfo=rider;
	 this.date=LocalDateTime.now();
	 this.status=CabBookingStatus.PENDING;
 }
 public UUID getid() {
	 return id;
 }
 public Location getFrom() {
	 return from;
 }
 public Location getTo() {
	 return to;
 }
 public Rider getRiderInfo() {
	 return riderInfo;
 }
 public LocalDateTime getDate() {
	 return date;
 }
 public CabBookingStatus getstatus() {
	 return status;
 }
 
 public String getAssignedTo() {
	 return assignedTo;
 }
 public void setAssignedTo(String assignedTo) {
	 this.assignedTo=assignedTo;
 }
 public void setStatus(CabBookingStatus status) {
	 this.status=status;
 }
 
 @Override
 public String toString(){
	  return "[CabBookingRequest :" + " id=" +  this.id.toString() + " from=" + this.from.toString()
	  + " to=" + this.to.toString() + " Rider=" + this.riderInfo.getRiderAccount().getName()
      + " Date=" + this.date.toString() + " Status=" + this.status.toString() + " assignedTo=" + this.assignedTo +"]";
	 
 }
 
}
