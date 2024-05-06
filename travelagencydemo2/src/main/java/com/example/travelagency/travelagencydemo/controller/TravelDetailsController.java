package com.example.travelagency.travelagencydemo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.travelagency.travelagencydemo.model.TravelDetails;
import com.example.travelagency.travelagencydemo.service.TravelDetailsService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/travel")
public class TravelDetailsController {
	
	@Autowired
	TravelDetailsService tdservice;
	
	@GetMapping("/read")
	@ResponseStatus(HttpStatus.OK)
	public List<TravelDetails> displaydetails(){
		return tdservice.displayDetails();
	}
	@GetMapping("/search/{cid}")
	@ResponseStatus(HttpStatus.OK)
	public TravelDetails displaydetailsbycid(@PathVariable int cid){
		return tdservice.displayDetailsById(cid);
	}
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public TravelDetails adddetails(@Valid @RequestBody TravelDetails traveldetails) {
		return tdservice.addDetails(traveldetails);
	}
	
	@PutMapping("/update/{cid}")
	@ResponseStatus(HttpStatus.CREATED)
	public TravelDetails updatedetails(@PathVariable int cid,@RequestBody TravelDetails traveldetails) {
		return tdservice.updateDetails(cid, traveldetails);
	}
	@DeleteMapping("/delete/{cid}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public boolean deletedetailsbyid(@PathVariable int cid) {
		return tdservice.deleteDetailsById(cid);
	}

}
