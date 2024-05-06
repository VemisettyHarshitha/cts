package com.example.travelagency.travelagencydemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelagency.travelagencydemo.dao.TravelDetailsDao;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectData;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectDelete;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectDisplay;
import com.example.travelagency.travelagencydemo.exceptions.IncorrectUpdate;
import com.example.travelagency.travelagencydemo.model.TravelDetails;

@Service
public class TravelDetailsServiceImpl implements TravelDetailsService{
	@Autowired
	TravelDetailsDao traveldao;
	@Override
	public TravelDetails addDetails(TravelDetails traveldetails) throws IncorrectData {
		if(traveldetails.getCid()==0 || traveldetails.getFirstname()==null ||traveldetails.getLastname()== null || 
		traveldetails.getStartinglocation()==null || traveldetails.getDestinationlocation()==null ||
		traveldetails.getLocationscovered()==null || traveldetails.getPackagename()==null || 
		traveldetails.getCost()==0 || traveldetails.getPhonenumber()== null || traveldetails.getNotes()== null)
			throw new IncorrectData();
		return traveldao.save(traveldetails);
	}

	@Override
	public List<TravelDetails> displayDetails() {
		return traveldao.findAll();
	}
	@Override
	public TravelDetails updateDetails(int cid,TravelDetails traveldetails) throws IncorrectUpdate{
		TravelDetails td=traveldao.findById(cid).orElseThrow(()-> new IncorrectUpdate());
		if(traveldetails.getFirstname()==null || traveldetails.getStartinglocation()==null ||
				traveldetails.getPackagename()==null || traveldetails.getCost()==0  )
			throw new IncorrectData();
		td.setFirstname(traveldetails.getFirstname());
		td.setStartinglocation(traveldetails.getStartinglocation());
		td.setPackagename(traveldetails.getPackagename());
		td.setCost(traveldetails.getCost());
				
		return traveldao.save(td);
	}
	@Override
	public boolean deleteDetailsById(int cid) throws IncorrectDelete{
		
		traveldao.findById(cid).orElseThrow(
	            ()
	                -> new IncorrectDelete());
		traveldao.deleteById(cid);
		return true;
	}

	@Override
	public TravelDetails displayDetailsById(int cid) throws IncorrectDisplay {
	
	                
		return traveldao.findById(cid).orElseThrow(()-> new IncorrectDisplay());
	}

	

}
