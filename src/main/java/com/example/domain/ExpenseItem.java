package com.example.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author muhammad.duano
 *
 */
@Entity
public class ExpenseItem {

	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String currency;
	private BigInteger amount;
	private BigInteger advancedPayment;
	private String description;

	public ExpenseItem() {
		super();
	}

	public ExpenseItem(Long id, String type, String currency, BigInteger amount, BigInteger advancedPayment,
			String description) {
		super();
		this.id = id;
		this.type = type;
		this.currency = currency;
		this.amount = amount;
		this.advancedPayment = advancedPayment;
		this.description = description;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public BigInteger getAdvancedPayment() {
		return advancedPayment;
	}

	public void setAdvancedPayment(BigInteger advancedPayment) {
		this.advancedPayment = advancedPayment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
