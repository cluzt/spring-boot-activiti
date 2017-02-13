package com.example.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author muhammad.duano Uses XmlRootElement annotation to support both JSON
 *         and XML
 *
 */
@Entity
@XmlRootElement
public class LeaveRequest {

	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String project;
	private String permissionType;
	private String description;

	private Long assessedBy;
	private Date assessedDate;
	private String status;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "leaveRequestId")
	Set<LeaveDate> leaveDates;

	public LeaveRequest() {
		super();
	}

	public LeaveRequest(Long id, String type, String project, String permissionType, String description,
			Long assessedBy, Date assessedDate, String status, Employee employee, Set<LeaveDate> leaveDates) {
		super();
		this.id = id;
		this.type = type;
		this.project = project;
		this.permissionType = permissionType;
		this.description = description;
		this.assessedBy = assessedBy;
		this.assessedDate = assessedDate;
		this.status = status;
		this.employee = employee;
		this.leaveDates = leaveDates;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
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

	public Set<LeaveDate> getLeaveDates() {
		return leaveDates;
	}

	public void setLeaveDates(Set<LeaveDate> leaveDates) {
		this.leaveDates = leaveDates;
	}

}
