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
	private Date overtimeDate;
	private String timeFrom;
	private String timeTo;
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

	public OvertimeRequest(Long id, Date overtimeDate, String timeFrom, String timeTo, String description,
			Long assessedBy, Date assessedDate, String status, Employee employee) {
		super();
		this.id = id;
		this.overtimeDate = overtimeDate;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
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

	public Date getOvertimeDate() {
		return overtimeDate;
	}

	public void setOvertimeDate(Date overtimeDate) {
		this.overtimeDate = overtimeDate;
	}

	public String getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;
	}

	public String getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;
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
