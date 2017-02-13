package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author muhammad.duano Uses XmlRootElement annotation to support both JSON
 *         and XML
 *
 */
@Entity
@XmlRootElement
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String phoneNumber;
	private String jobTitle;
	private String division;

	public Employee() {
		super();
	}

	public Employee(String name, String email, String phoneNumber, String jobTitle, String division) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.jobTitle = jobTitle;
		this.division = division;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

}
