package com.project.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.lms.model.LeaveRequest;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveRequest,Integer> {

}
