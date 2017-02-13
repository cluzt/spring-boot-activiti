package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.ExpenseRequest;

public interface ExpenseRequestRepository extends JpaRepository<ExpenseRequest, Long> {
	
}
