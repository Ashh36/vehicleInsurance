package com.insurance.vehicleInsurance.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Payment {
	
	@Id
	Integer id;
	@JsonFormat(pattern="yyyy-MM-dd")
	LocalDate date;
	Double amount;
	String description;
	@ManyToOne
	Insurance insurance;
	
	public Payment() {
		super();
	}

	public Payment(Integer id, LocalDate date, Double amount, String description, Insurance insurance) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.description = description;
		this.insurance = insurance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
}
