package com.example.travelagency.travelagencydemo.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class CommunicationAddress {
	@NotBlank(message = "Communication House No is required")
	@Size(max = 50, message = "Must be less than 50 characters")
    String houseNumber;
	@NotBlank(message = "Communication  Street Name is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String streetName;
	@NotBlank(message = "Communication LandMark is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String addressLandmark;
	@NotBlank(message = "Communication City is required")
	@Size(max = 15, message = "Must be less than 15 characters")
	String cityName;
	@NotBlank(message = "Communication State  is required")
	@Size(max = 20, message = "Must be less than 20 characters")
	String stateName;
	@NotBlank(message = "Communication Pincode No is required")
	@Size(max = 10, message = "Must be less than 10 characters")
    String pinCode;
	
	public CommunicationAddress() {
	}

	public CommunicationAddress(String houseNumber, String streetName, String addressLandmark, String cityName,
			String stateName, String pinCode) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.addressLandmark = addressLandmark;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAddressLandmark() {
		return addressLandmark;
	}

	public void setAddressLandmark(String addressLandmark) {
		this.addressLandmark = addressLandmark;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "CommunicationAddress [houseNumber=" + houseNumber + ", streetName=" + streetName + ", addressLandmark="
				+ addressLandmark + ", cityName=" + cityName + ", stateName=" + stateName + ", pinCode=" + pinCode
				+ "]";
	}

}
