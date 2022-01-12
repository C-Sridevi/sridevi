package com.constructor;

public class Customer1 {
	  int customerid,customerContact;
	   String customerName,customerAddress;
	   
	   public Customer1() {
		   
	   }
	   
	   
	
	public Customer1(int customerid, int customerContact, String customerName, String customerAddress) {
		super();
		this.customerid = customerid;
		this.customerContact = customerContact;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	



	public int getCustomerid() {
		return customerid;
	}




	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}




	public int getCustomerContact() {
		return customerContact;
	}




	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getCustomerAddress() {
		return customerAddress;
	}




	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}




	public void display() {

		System.out.println("id:"+customerid+ "customerContact: "+customerContact+
	    "customerName: "+customerName+"customerAddress: "+customerAddress);
	   
	}
	
	
	}


