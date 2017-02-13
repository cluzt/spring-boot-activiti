package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author muhammad.duano
 *
 */
@Entity
public class LeaveDate {

	@Id
	@GeneratedValue
	private Long id;
	private Date leaveDate;

	public LeaveDate() {
		super();
	}

	public LeaveDate(Long id, Date leaveDate) {
		super();
		this.id = id;
		this.leaveDate = leaveDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

}
