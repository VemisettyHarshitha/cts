package com.example.travelagency.travelagencydemo.model;

import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="traveldetails")
public class TravelDetails {
	@Id
	@NotNull
	@Min(value = 1, message = "CID must be a positive integer")
	int cid;
	@NotBlank(message = "First name is required")
	@Size(max = 50, message = "First name must be less than 50 characters")
	String firstName;
	@NotBlank(message = "Last name is required")
	@Size(max = 50, message = "Last name must be less than 50 characters")
	String lastName;
	@NotBlank(message = "Strating location is required")
	@Size(max = 50, message = "Startinglocation must be less than 50 characters")
	String startingLocation;
	@NotBlank(message = "Destination location is required")
	@Size(max = 50, message = "Destination location must be less than 50 characters")
	String destinationLocation;
	@NotEmpty(message ="locations covered are required")
	List<String> locationsCovered;
	@NotBlank(message = "Packagename is required")
	@Size(max = 50, message = "Destination location must be less than 50 characters")
	String packageName;
	@NotNull
	@Min(value = 1, message = "Cost must be a positive integer")
    int cost;
    @Valid
	@Embedded
	PermanentAddress permanentAddress;
    @Valid
	@Embedded
	CommunicationAddress communicationAddress;
    @NotBlank(message="Packagename is required")
	String phoneNumber;
    @NotBlank(message = "Notes is required")
	String notes;
	public  TravelDetails() {
		
	}
	public TravelDetails(int cid, String firstName, String lastName, String startingLocation,
			String destinationLocation, List<String> locationsCovered, String packageName, int cost,
			PermanentAddress permanentAddress, CommunicationAddress communicationAddress, String phoneNumber,
			String notes) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startingLocation = startingLocation;
		this.destinationLocation = destinationLocation;
		this.locationsCovered = locationsCovered;
		this.packageName = packageName;
		this.cost = cost;
		this.permanentAddress = permanentAddress;
		this.communicationAddress = communicationAddress;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	public String getStartinglocation() {
		return startingLocation;
	}
	public void setStartinglocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	public String getDestinationlocation() {
		return destinationLocation;
	}
	public void setDestinationlocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public List<String> getLocationscovered() {
		return locationsCovered;
	}
	public void setLocationscovered(List<String> locationsCovered) {
		this.locationsCovered = locationsCovered;
	}
	public String getPackagename() {
		return packageName;
	}
	public void setPackagename(String packageName) {
		this.packageName = packageName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public PermanentAddress getPermanentaddress() {
		return permanentAddress;
	}
	public void setPermanentaddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public CommunicationAddress getCommunicationaddress() {
		return communicationAddress;
	}
	public void setCommunicationaddress(CommunicationAddress communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	public String getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		return "Traveldetails [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", startingLocation=" + startingLocation + ", destinationLocation=" + destinationLocation
				+ ", locationsCovered=" + locationsCovered + ", packageName=" + packageName + ", cost=" + cost
				+ ", permanentAddress=" + permanentAddress + ", communicationAddress=" + communicationAddress
				+ ", phoneNumber=" + phoneNumber + ", notes=" + notes + "]";
	}
	
	
	
	
	
	
	
	

}
