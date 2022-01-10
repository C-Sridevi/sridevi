package com.constructor;

public class Address1 {
	int Street,zip;
	String City,Country,State;
	
	public Address1() {
	}
	
	
	public int getStreet() {
		return Street;
	}
	public void setStreet(int street) {
		this.Street = street;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public void display() {
		System.out.println("Street: "+Street+"City: "+City+"Country:"
				 +Country+"State: "+State);
	}
	public Address1(int street, int zip, String city, String country, String state) {
		super();
		this.Street = street;
		this.zip = zip;
		this.City = city;
		this.Country = country;
		this.State = state;
	}
	
	

}




