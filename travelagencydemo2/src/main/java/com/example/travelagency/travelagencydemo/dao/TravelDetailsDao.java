package com.example.travelagency.travelagencydemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.travelagency.travelagencydemo.model.TravelDetails;

@Repository
public interface TravelDetailsDao extends JpaRepository<TravelDetails,Integer>{

}
