package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
	
}
