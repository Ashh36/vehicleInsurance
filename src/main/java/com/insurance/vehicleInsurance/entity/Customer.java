package com.insurance.vehicleInsurance.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Customer {
	
	@Id
	Integer customerId;
	String customerName;
	String customerMobile;
	String customerEmail;
	String customerAddress;
	String customerUserName;
	String customerPassword;
	
	@OneToMany
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	@OneToOne
	Documents license;
	@OneToOne
	Registration registration;
	
	public Customer() {
		super();
	}

	public Customer(Integer customerId, String customerName, String customerMobile, String customerEmail,
			String customerAddress, String customerUserName, String customerPassword, List<Vehicle> vehicles,
			Documents license, Registration registration) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.vehicles = vehicles;
		this.license = license;
		this.registration = registration;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public List<Vehicle> getVehicle() {
		return vehicles;
	}

	public void setVehicle(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Documents getLicense() {
		return license;
	}

	public void setLicense(Documents license) {
		this.license = license;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
}
