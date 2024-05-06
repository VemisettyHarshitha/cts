package com.example.travelagency.travelagencydemo.service;

import java.util.List;


import com.example.travelagency.travelagencydemo.exceptions.IncorrectData;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectDelete;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectDisplay;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectUpdate;
import com.example.travelagency.travelagencydemo.model.TravelDetails;

public interface TravelDetailsService {
   public List<TravelDetails> displayDetails();
   public TravelDetails addDetails(TravelDetails traveldetails) throws IncorrectData; 
   public TravelDetails displayDetailsById(int cid) throws IncorrectDisplay;
   public TravelDetails updateDetails(int cid,TravelDetails traveldetails) throws IncorrectUpdate;
   public boolean deleteDetailsById(int cid)throws IncorrectDelete;
   
}
