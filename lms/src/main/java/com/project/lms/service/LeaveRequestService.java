package com.project.lms.service;

import java.util.List;

import com.project.lms.model.LeaveRequest;

public interface LeaveRequestService {
	public LeaveRequest addLeaveRequest(LeaveRequest leaveRequest);
	public List<LeaveRequest> getAllLeaveRequests();
	public List<LeaveRequest> searchLeaveRequests(String status);
}
