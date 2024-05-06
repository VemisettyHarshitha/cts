package com.project.lms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.lms.dao.LeaveRepository;
import com.project.lms.model.LeaveRequest;
@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{
@Autowired
private LeaveRepository leaveRepository;
	@Override
	public LeaveRequest addLeaveRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		return leaveRepository.save(leaveRequest);
	}
	@Override
	public List<LeaveRequest> getAllLeaveRequests() {
		return leaveRepository.findAll();
	}
	@Override
	public List<LeaveRequest> searchLeaveRequests(String status) {
		// TODO Auto-generated method stub
		List<LeaveRequest> leaveRequests=leaveRepository.findAll();
		List<LeaveRequest> newlr=new ArrayList<>();
		for(LeaveRequest leaveRequest:leaveRequests) {
			if(leaveRequest.getStatus().equals(status)) {
				newlr.add(leaveRequest);
			}
		}
		return newlr ;
	}
		
	
	

}
