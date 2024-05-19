package entity;

import enums.AccountStatus;

public class AbstractAccount {
  String name;
  String phone_no;
  String dob;
  String address;
  AccountStatus status;
  
  public AbstractAccount(String name) {
	  this.name=name;
	  this.status=AccountStatus.ACTIVE;
  }
  public AbstractAccount(String name,String phone_no) {
	  this.name=name;
	  this.phone_no=phone_no;
	  this.status=AccountStatus.ACTIVE;
  }
  public AbstractAccount(String name,String phone_no,String dob) {
	  this.name=name;
	  this.phone_no=phone_no;
	  this.dob=dob;
	  this.status=AccountStatus.ACTIVE;
  }
  public AbstractAccount(String name,String phone_no,String dob,String address) {
	  this.name=name;
	  this.phone_no=phone_no;
	  this.dob=dob;
	  this.address=address;
	  this.status=AccountStatus.ACTIVE;
  }
  
  public String getName() {
	  return name;
  }
  public String getPhoneNo() {
	  return phone_no;
  }
  public String getAddress() {
	  return address;
  }
  public String getDob() {
	  return dob;
  }
  public AccountStatus getStatus() {
	  return status;
  }
}
