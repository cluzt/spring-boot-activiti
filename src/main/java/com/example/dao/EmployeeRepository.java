package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
