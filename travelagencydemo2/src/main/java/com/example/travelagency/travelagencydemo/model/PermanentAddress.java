package com.example.travelagency.travelagencydemo.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class PermanentAddress {
	
	@NotBlank(message = "Permanent House No is required")
	@Size(max = 50, message = "Must be less than 50 characters")
    String houseNo;
	@NotBlank(message = "Permanent Street is required")
	@Size(max = 50, message = "Must be less than 50 characters")
    String street;
	@NotBlank(message = "Permanent LandMark is required")
	@Size(max = 50, message = "Must be less than 50 characters")
    String landMark;
	@NotBlank(message = "Permanent City is required")
	@Size(max = 15, message = "Must be less than 15 characters")
	String city;
	@NotBlank(message = "Permanent State is required")
	@Size(max = 20, message = "Must be less than 20 characters")
	String state;
	@NotBlank(message = "Permanent House Pin is required")
	@Size(max = 15, message = "Must be less than 15 characters")
    String pin;
	 
	public PermanentAddress() {
		
		super();
	}

	public PermanentAddress(String houseNo, String street, String landMark, String city, String state, String pin) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.landMark = landMark;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "PermanentAddress [houseNo=" + houseNo + ", street=" + street + ", landMark=" + landMark + ", city="
				+ city + ", state=" + state + ", pin=" + pin + "]";
	}

	
}
