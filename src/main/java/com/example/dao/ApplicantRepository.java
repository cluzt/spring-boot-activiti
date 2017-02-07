package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Applicant;

public interface ApplicantRepository extends CrudRepository<Applicant, Long> {
	
}
