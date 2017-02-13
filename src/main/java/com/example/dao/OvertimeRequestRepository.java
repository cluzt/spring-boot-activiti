package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.OvertimeRequest;

public interface OvertimeRequestRepository extends JpaRepository<OvertimeRequest, Long> {
	
}
