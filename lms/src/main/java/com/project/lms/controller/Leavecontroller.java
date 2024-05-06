package com.project.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.lms.model.LeaveRequest;
import com.project.lms.service.LeaveRequestService;

@Controller
public class Leavecontroller {
	@Autowired
	private LeaveRequestService leaveRequestService;
	
	@GetMapping("/applyLeave")
	public String applyLeave(Model model) {
		LeaveRequest leaveRequest =new LeaveRequest(); 
			model.addAttribute("leaveRequest",leaveRequest);
			return "applyLeave";
		
	}
	@GetMapping("/submitLeave")
	public String submitLeave(@ModelAttribute LeaveRequest leaveRequest) {
		leaveRequestService.addLeaveRequest(leaveRequest);
		return "valid";
	}
	@GetMapping("/viewRequests")
	public String viewRequests(Model model) {
		model.addAttribute("leaveRequests", leaveRequestService.getAllLeaveRequests());
		return "viewRequests";
	}
	@GetMapping("/back")
    public String back() {
    	return "valid";
    }
	@GetMapping("/searchRequests")
	public String searchRequests() {
		return "searchRequests";
	}
	@GetMapping("/SearchLeaveRequest")
	public String searchLeaveRequests(@RequestParam String status,Model model) {
		List <LeaveRequest> leaverequest =leaveRequestService.searchLeaveRequests(status);
		model.addAttribute("leaveRequests",leaverequest);
		//leaveRequestService.searchLeaveRequests(status);
		return "viewRequests";
	}
	
}
