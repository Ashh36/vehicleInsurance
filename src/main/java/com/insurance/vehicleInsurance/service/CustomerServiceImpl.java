package com.insurance.vehicleInsurance.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.vehicleInsurance.dao.CustomerRepository;
import com.insurance.vehicleInsurance.dao.LicenseRepository;
import com.insurance.vehicleInsurance.dao.RegistrationRepository;
import com.insurance.vehicleInsurance.dao.VehicleRepository;
import com.insurance.vehicleInsurance.entity.Customer;
import com.insurance.vehicleInsurance.entity.Documents;
import com.insurance.vehicleInsurance.entity.Registration;
import com.insurance.vehicleInsurance.entity.Vehicle;
import com.insurance.vehicleInsurance.exception.CustomerException;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Autowired
	LicenseRepository licenseRepository;
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		Optional<Customer> customerOpt = this.customerRepository.findById(customer.getCustomerId());
		if(customerOpt.isPresent()) {
			throw new CustomerException("Customer already exist"+customer.getCustomerName());
		}List<Vehicle> vehicles = customer.getVehicle();
		if(vehicles != null) {
			vehicles = this.vehicleRepository.saveAll(vehicles);
		}else{
			System.out.println("cannot save.");
		}customer.setVehicle(vehicles);
		Documents license = customer.getLicense();
		if(license != null) {
			license = this.licenseRepository.save(license);
		}customer.setLicense(license);
		Registration registration = customer.getRegistration();
		if(registration != null) {
			registration = this.registrationRepository.save(registration);
		}customer.setRegistration(registration);
		this.customerRepository.save(customer);
		return this.customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer id) throws CustomerException {
		Optional<Customer> customerOpt = this.customerRepository.findById(id);
		if(!customerOpt.isPresent()) {
			throw new CustomerException("Customer not found for id: "+id);
		}
		return customerOpt.get();
	}

	@Override
	public Customer updateCustomer(Customer newCustomer) throws CustomerException {
		return this.customerRepository.save(newCustomer);
	}

	@Override
	public Customer deleteCustomerById(Integer id) throws CustomerException {
		Optional<Customer> customerOpt = this.customerRepository.findById(id);
		if(customerOpt == null) {
			throw new CustomerException("Customer not found to delete, id: "+id);
		}
		Customer customer = customerOpt.get();
		this.customerRepository.delete(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return this.customerRepository.findAll();
	}

}
