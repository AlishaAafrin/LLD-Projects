package entity;

import Constants.CabBookingConstants;

public class Cab extends BaseCab {
	double baseFare;
	double perKMFare;
	
	public Cab(Driver driver,Location location,String license_number) {
	super(driver,location,license_number);
	  this.baseFare=CabBookingConstants.CAB_BASE_FARE;
	  this.perKMFare=CabBookingConstants.CAB_PER_KM_CHARGE;
	}
	
	public Cab(Driver driver,Location location,String license_number, String color) {
		super(driver,location,license_number,color);
		this.baseFare=CabBookingConstants.CAB_BASE_FARE;
		this.perKMFare=CabBookingConstants.CAB_PER_KM_CHARGE;
	}
	
	public double getBaseFare()
	{
		return baseFare;
	}
	public double getPerKMFare() {
		return perKMFare;
	}
	
	public void setBaseFare(double baseFare) {
		this.baseFare=baseFare;
	}
	public void setPerKMFare(double perKMFare) {
		this.perKMFare=perKMFare;
	}

}
