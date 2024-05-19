package entity;

public class RiderAccount extends AbstractAccount {

	public RiderAccount(String name) {
		super(name);
	}
	public RiderAccount(String name,String phone_no) {
		super(name,phone_no);
	}
	public RiderAccount(String name,String phone_no,String dob) {
		super(name,phone_no,dob);
	}
	public RiderAccount(String name,String phone_no,String dob,String address) {
		super(name,phone_no,dob,address);
	}
}
