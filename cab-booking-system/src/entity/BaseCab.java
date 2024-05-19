package entity;

import enums.CabStatus;

public class BaseCab {
	Driver driver;
	Location location;
	CabStatus status;
	String license_number;
	String color;
	
	public BaseCab(Driver driver,Location location,String license_number) {
		this.driver=driver;
		this.location=location;
		this.license_number=license_number;
		this.color="UNKNOWN";
		this.status=CabStatus.AVAILABLE;		
	}
	
	public BaseCab(Driver driver,Location location,String license_number,String color) {
		this.driver=driver;
		this.location=location;
		this.license_number=license_number;
		this.color=color;
		this.status=CabStatus.AVAILABLE;
	}
	
	public CabStatus getStatus() {
		return status;	
	}
	public Driver getDriver() {
		return driver;
	}
	public Location getLocation() {
		return location;
	}
    public String getLicensePlate() {
    	return license_number;
    }
    public String getColor() {
    	return color;
    }
    public void setStatus(CabStatus currentStatus) {
    	this.status=currentStatus;
    }
}

