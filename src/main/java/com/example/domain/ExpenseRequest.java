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
public class ExpenseRequest {

	@Id
	@GeneratedValue
	private Long id;
	private String project;
	private Date dateFrom;
	private Date dateTo;
	private String destination;
	private String description;

	private Long assessedBy;
	private Date assessedDate;
	private String status;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "expenseRequestId")
	Set<ExpenseItem> expenseItems;

	public ExpenseRequest() {
		super();
	}

	public ExpenseRequest(Long id, String project, Date dateFrom, Date dateTo, String destination, String description,
			Long assessedBy, Date assessedDate, String status, Employee employee, Set<ExpenseItem> expenseItems) {
		super();
		this.id = id;
		this.project = project;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.destination = destination;
		this.description = description;
		this.assessedBy = assessedBy;
		this.assessedDate = assessedDate;
		this.status = status;
		this.employee = employee;
		this.expenseItems = expenseItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public Set<ExpenseItem> getExpenseItems() {
		return expenseItems;
	}

	public void setExpenseItems(Set<ExpenseItem> expenseItems) {
		this.expenseItems = expenseItems;
	}

}
