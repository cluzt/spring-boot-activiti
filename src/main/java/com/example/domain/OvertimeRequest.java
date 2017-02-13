package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author muhammad.duano Uses XmlRootElement annotation to support both JSON
 *         and XML
 *
 */
@Entity
@XmlRootElement
public class OvertimeRequest {

	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	private String from;
	private String to;
	private String description;

	private Long assessedBy;
	private Date assessedDate;
	private String status;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	public OvertimeRequest() {
		super();
	}

	public OvertimeRequest(Long id, Date date, String from, String to, String description, Long assessedBy,
			Date assessedDate, String status, Employee employee) {
		super();
		this.id = id;
		this.date = date;
		this.from = from;
		this.to = to;
		this.description = description;
		this.assessedBy = assessedBy;
		this.assessedDate = assessedDate;
		this.status = status;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getAssessedBy() {
		return assessedBy;
	}

	public void setAssessedBy(Long assessedBy) {
		this.assessedBy = assessedBy;
	}

	public Date getAssessedDate() {
		return assessedDate;
	}

	public void setAssessedDate(Date assessedDate) {
		this.assessedDate = assessedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
