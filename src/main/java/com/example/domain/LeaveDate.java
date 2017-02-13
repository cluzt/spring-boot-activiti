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
	private Date date;

	public LeaveDate() {
		super();
	}

	public LeaveDate(Long id, Date date) {
		super();
		this.id = id;
		this.date = date;
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

}
