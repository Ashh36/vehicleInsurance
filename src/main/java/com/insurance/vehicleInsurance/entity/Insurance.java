package com.insurance.vehicleInsurance.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer insuranceId;
	Double insuranceAmount;
	String insuranceNumber;
	String insuranceDescription;
	String insuranceType;
	
	@ManyToOne
	Customer customer;
	@OneToMany
	List<Payment> payments = new ArrayList<Payment>();
	@OneToOne
	Vehicle vehicle;
	
	public Insurance() {
		super();
	}
	
	public Insurance(Integer insuranceId, Double insuranceAmount, String insuranceNumber, String insuranceDescription,
			String insuranceType, Customer customer, List<Payment> payments, Vehicle vehicle) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceAmount = insuranceAmount;
		this.insuranceNumber = insuranceNumber;
		this.insuranceDescription = insuranceDescription;
		this.insuranceType = insuranceType;
		this.customer = customer;
		this.payments = payments;
		this.vehicle = vehicle;
	}

	public Integer getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public String getInsuranceDescription() {
		return insuranceDescription;
	}

	public void setInsuranceDescription(String insuranceDescription) {
		this.insuranceDescription = insuranceDescription;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
