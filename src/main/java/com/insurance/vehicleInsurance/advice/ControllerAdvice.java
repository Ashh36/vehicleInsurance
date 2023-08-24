package com.insurance.vehicleInsurance.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.insurance.vehicleInsurance.exception.CustomerException;
import com.insurance.vehicleInsurance.exception.InsuranceException;
import com.insurance.vehicleInsurance.exception.LicenseException;
import com.insurance.vehicleInsurance.exception.PaymentException;
import com.insurance.vehicleInsurance.exception.RegistrationException;
import com.insurance.vehicleInsurance.exception.VehicleException;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<String>handleCustomerException(CustomerException customerException){
		return new ResponseEntity<String>(customerException.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(VehicleException.class)
	public ResponseEntity<String>handleVehicleException(VehicleException vehicleException){
		return new ResponseEntity<String>(vehicleException.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InsuranceException.class)
	public ResponseEntity<String>handleInsuranceException(InsuranceException insuranceException){
		return new ResponseEntity<String>(insuranceException.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(LicenseException.class)
	public ResponseEntity<String>handleLicenseException(LicenseException licenseException){
		return new ResponseEntity<String>(licenseException.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PaymentException.class)
	public ResponseEntity<String>handlePaymentException(PaymentException paymentException){
		return new ResponseEntity<String>(paymentException.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(RegistrationException.class)
	public ResponseEntity<String>handleRegistrationException(RegistrationException registrationException){
		return new ResponseEntity<String>(registrationException.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
