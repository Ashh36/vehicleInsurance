package com.insurance.vehicleInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.vehicleInsurance.entity.Documents;

public interface LicenseRepository extends JpaRepository<Documents, Integer>{

}
