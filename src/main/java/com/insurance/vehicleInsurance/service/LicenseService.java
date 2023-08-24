package com.insurance.vehicleInsurance.service;

import java.util.List;

import com.insurance.vehicleInsurance.entity.Documents;
import com.insurance.vehicleInsurance.exception.LicenseException;

public interface LicenseService {
	
	Documents addLicense(Documents newLicense)throws LicenseException;
	
	Documents getLicenseById(Integer id)throws LicenseException;
	
	Documents updateLicense(Documents newLicense)throws LicenseException;
	
	Documents deleteLicenseById(Integer id)throws LicenseException;
	
	List<Documents>getAllLicense();

}
