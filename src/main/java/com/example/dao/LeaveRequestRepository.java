package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
	
}
