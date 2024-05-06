package com.example.travelagency.travelagencydemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.travelagency.travelagencydemo.model.CommunicationAddress;
import com.example.travelagency.travelagencydemo.model.PermanentAddress;
import com.example.travelagency.travelagencydemo.model.TravelDetails;
import com.example.travelagency.travelagencydemo.service.TravelDetailsService;

@SpringBootTest
public class Testcases {
	@Autowired
	TravelDetailsService tdservice;
	
	@Test
    public void testAddDetails() {
       PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");
       CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
       List<String> l = new ArrayList<String>();
       l.add("Hydrabad");
       l.add("Btm");
        TravelDetails passengerToAdd = new TravelDetails(1,"KUmar","dkdd","Banagalore","Hydrabad",l,"3days",600,p,c,"80037493","nchdfcn");
       
        TravelDetails addedPassenger = tdservice.addDetails(passengerToAdd);
        assertNotNull(addedPassenger.getCid());
        assertEquals(passengerToAdd.getFirstname(), addedPassenger.getFirstname());
    }
	@Test
    public void testDisplayDetailsbycid() {
		PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");
	       CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
	       List<String> l = new ArrayList<String>();
	       l.add("Hydrabad");
	       l.add("Btm");
	        TravelDetails passengerToAdd = new TravelDetails(1,"KUmar","dkdd","Banagalore","Hydrabad",l,"3days",600,p,c,"80037493","nchdfcn");
	        TravelDetails addedPassenger = tdservice.addDetails(passengerToAdd);
	        TravelDetails displayPassenger = tdservice.displayDetailsById(passengerToAdd.getCid());
	        
	        
	        
	        assertNotNull(addedPassenger.getCid());
	        //doubt 
	        assertEquals(1, displayPassenger.getCid());
	        
	        
	}
	@Test
    public void testUpdateDetails() {
        // Given
		PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");
	       CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
	       List<String> l = new ArrayList<String>();
	       l.add("Hydrabad");
	       l.add("Btm");
	        TravelDetails passengerToAdd = new TravelDetails(1,"KUmar","dkdd","Banagalore","Hydrabad",l,"3days",600,p,c,"80037493","nchdfcn");
	       
        // When
	    TravelDetails addedPassenger = tdservice.addDetails(passengerToAdd);
        assertNotNull(addedPassenger.getCid());
 
        // Modify some attributes of the customer
        addedPassenger.setFirstname("UpdatedName");
        addedPassenger.setPackagename("orange");
        addedPassenger.setCost(500);
 
        // Update the customer
        TravelDetails updateddetails = tdservice.updateDetails(addedPassenger.getCid(), addedPassenger);
 
      
        // Then
        assertNotNull(updateddetails);
        assertEquals("UpdatedName", updateddetails.getFirstname());
        assertEquals("orange", updateddetails.getPackagename());
        assertEquals(500,updateddetails.getCost());
    }
	@Test
    public void testDeleteDetails() {
        // Given
		PermanentAddress p = new PermanentAddress("1B","Manyata","nagawra","Banaglore","Karnatka","560045");
	       CommunicationAddress c = new CommunicationAddress("1A","BTM","BTM","Bangalore","karnatka","560045");
	       List<String> l = new ArrayList<String>();
	       l.add("Hydrabad");
	       l.add("Btm");
	        TravelDetails passengerToAdd = new TravelDetails(1,"KUmar","dkdd","Banagalore","Hydrabad",l,"3days",600,p,c,"80037493","nchdfcn");
	       
	        TravelDetails addedPassenger = tdservice.addDetails(passengerToAdd);
        
 
        // When
        boolean isDeleted = tdservice.deleteDetailsById(addedPassenger.getCid());
 
        // Then
        assertTrue(isDeleted);      
    }
 
	

}
